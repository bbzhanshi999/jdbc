package com.simlink.empi.dao;

import com.simlink.empi.entity.Brjbxx;
import com.simlink.empi.entity.EmpiInfo;
import com.simlink.empi.entity.EmpiCaculatingStatus;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * empi业务相关dao
 * Created by Administrator on 2016/10/27 0027.
 */
public class EmpiDao extends JdbcDaoSupport {

    /**
     * 建立关联关系
     *
     * @param brbh
     */
    public void linkToEmpi(String EmpiId, Integer brbh, Integer percentage,String inputType) {
        if(inputType ==null){
            inputType = EmpiInfo.AUTO;
        }
        // TODO: 2016/10/28 0028
    }

    /**
     * 根据必要条件查询可能的EmipiInfo
     *
     * @param sql
     * @return
     */
    public List<EmpiInfo> getProbableInfosByReq(String sql) {
        // TODO: 2016/10/28 0028
        return null;
    }

    /**
     * 创建主索引并返回id
     * @param brjbxx
     * @return
     */
    public String addEmpi(Brjbxx brjbxx) {
        // TODO: 2016/10/28 0028  
        return null;
    }

    public EmpiCaculatingStatus getStatus() {
        // TODO: 2016/10/28 0028
        return null;
    }

    public void updateStatus(String status){
        // TODO: 2016/10/28 0028
    }

    public void updateStatus(Integer lastBrbh,String status){
        // TODO: 2016/10/28 0028
    }
}
