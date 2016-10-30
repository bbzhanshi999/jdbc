package com.simlink.empi.service;

import com.simlink.empi.dao.EmpiDao;
import com.simlink.empi.dao.PatientInfoDao;
import com.simlink.empi.entity.Brjbxx;
import com.simlink.empi.entity.EmpiInfo;
import com.simlink.empi.entity.EmpiCaculatingStatus;
import com.simlink.empi.util.EmpiCaculator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowCountCallbackHandler;
import org.springframework.transaction.annotation.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * EMPI业务逻辑service
 * Created by Administrator on 2016/10/27 0027.
 */
public class EmpiService {

    private PatientInfoDao patientInfoDao;
    private EmpiDao empiDao;
    private CalculateInitialLizer initialLizer;


    /**
     * 建立关联关系
     *
     * @param info
     */
    public void linkToEmpi(EmpiInfo info) {
        linkToEmpi(info.getId(), info.getBrbh(), info.getPercentage(),null);
    }

    /**
     * 建立关联关系
     *
     * @param brbh
     * @param empiId
     */
    public void linkToEmpi(String empiId, Integer brbh, Integer percentage,String inputType) {
        empiDao.linkToEmpi(empiId, brbh, percentage, inputType);
    }

    /**
     * 获得所有可能关联的记录
     *
     * @param brjbxx
     * @return
     */
    public List<EmpiInfo> getProbableEmpInfos(Brjbxx brjbxx) {
        String sql = EmpiCaculator.generateSql(brjbxx);
        return empiDao.getProbableInfosByReq(sql);
    }

    /**
     * 查询最后一条没有关联主索引的病人编号
     * @return
     */
    public Integer queryLastBrbh(){
        return patientInfoDao.queryLastBrbh();
    }


    /**
     * 获得可能关联的主索引列表
     * @param brjbxx
     * @return
     */
    public List<EmpiInfo> getRelativeEmpis(Brjbxx brjbxx){
        List<EmpiInfo> probableEmpInfos = empiDao
                .getProbableInfosByReq(EmpiCaculator.generateSql(brjbxx));
        if(probableEmpInfos.size()>0){
            probableEmpInfos = EmpiCaculator.sort(probableEmpInfos);
        }
        return probableEmpInfos;
    }

    /**
     * 创建empi并关联brjbxx
     * @param empiInfo
     */
    @Transactional
    public void addEmpiAndLink(EmpiInfo empiInfo){
        String id = empiDao.addEmpi(empiInfo);
        linkToEmpi(id,empiInfo.getBrbh(),100,EmpiInfo.MANUAL);
    }

    /**
     * 根据必要条件进行主索引建立和关联
     * @param brjbxx
     */
    private void createEmpiRefByReq(Brjbxx brjbxx) {
        // TODO: 2016/10/30 0030
    }

    /**
     * 启动计算
     */
    public void startCalculate(){
        if (initialLizer == null) {
            initialLizer = new CalculateInitialLizer(){
                @Override
                public void run() {
                    final Brjbxx brjbxx = new Brjbxx();
                    Integer lastBrbh = queryLastBrbh();
                    empiDao.updateStatus(lastBrbh, EmpiCaculatingStatus.CACULATING);
                    String sql = "select * from BRJBXX BR WHERE not exists(SELECT 1 FROM" +
                            " EMPI_PATIENT_INFO_BRJBXX EPIB WHERE EPIB.BRBH = BR.BRBH ) ORDER BY BRBH";
                    patientInfoDao.iterateBrjbxxAware(sql,new RowCountCallbackHandler() {
                        @Override
                        protected void processRow(ResultSet rs, int rowNum) throws SQLException {
                            while (rs.next()&&!getStop()) {
                                assembleBrjbxxBean(brjbxx, rs);
                                List<EmpiInfo> probableEmpInfos = empiDao
                                        .getProbableInfosByReq(EmpiCaculator.generateSql(brjbxx));
                                if(probableEmpInfos.size()<=0){
                                    createEmpiRefByReq(brjbxx);
                                }else{
                                    EmpiInfo result = EmpiCaculator.screenOut(probableEmpInfos);
                                    linkToEmpi(result.getId(), brjbxx.getBrbh(), result.getPercentage(),null);
                                }
                                if(brjbxx.getBrbh()>=(lastBrbh))break;
                            }
                            if(!getStop()){
                                empiDao.updateStatus(EmpiCaculatingStatus.FINSH);
                            }
                        }
                    });
                }
            };
            initialLizer.run();
        }
    }

    /**
     * 销毁计算线程
     */
    public void destroyCalculate(){
        initialLizer.setStop(true);
        initialLizer =null;
    }

    /**
     * 组装brjgbxxbean（单例组装）
     *
     * @param brjbxx
     * @param rs
     */
    private void assembleBrjbxxBean(Brjbxx brjbxx, ResultSet rs) {
        // TODO: 2016/10/28 0028
    }

    public PatientInfoDao getPatientInfoDao() {
        return patientInfoDao;
    }

    public void setPatientInfoDao(PatientInfoDao patientInfoDao) {
        this.patientInfoDao = patientInfoDao;
    }

    public EmpiDao getEmpiDao() {
        return empiDao;
    }

    public void setEmpiDao(EmpiDao empiDao) {
        this.empiDao = empiDao;
    }


    public CalculateInitialLizer getInitialLizer() {
        return initialLizer;
    }

    public void setInitialLizer(CalculateInitialLizer initialLizer) {
        this.initialLizer = initialLizer;
    }


    /**
     * 全局计算主索引线程
     * Created by Administrator on 2016/10/27 0027.
     */
    public static class CalculateInitialLizer extends Thread {
        private Boolean stop = false;

        public Boolean getStop() {
            return stop;
        }

        public void setStop(Boolean stop) {
            this.stop = stop;
        }
    }
}
