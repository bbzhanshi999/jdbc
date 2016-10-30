package com.simlink.empi.dao;


import com.simlink.empi.entity.Brjbxx;
import com.simlink.empi.util.CursorQueryPreparedStatementCreator;
import org.springframework.jdbc.core.RowCountCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 测试
 * Created by Administrator on 2016/10/26 0026.
 */
public class PatientInfoDao extends JdbcDaoSupport {

    /**
     * 采用游标方式遍历brjbxx，并且进行业务操作
     *
     * @param
     */
    public void iterateBrjbxxAware(String sql, RowCountCallbackHandler rowCountCallbackHandler) {
        getJdbcTemplate().
                query(new CursorQueryPreparedStatementCreator(sql), rowCountCallbackHandler);
    }

    /**
     * 查询最后一条没有关联主索引的病人编号
     * @return
     */
    public Integer queryLastBrbh() {
        return null;
    }


    private static final class PatientInfoMapper implements RowMapper<Brjbxx> {

        public Brjbxx mapRow(ResultSet rs, int rowNum) throws SQLException {
            Brjbxx brjbxx = new Brjbxx();
            brjbxx.setBrbh(rs.getInt("BRBH"));
            return brjbxx;
        }
    }
}
