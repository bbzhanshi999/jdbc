package com.simlink.empi.util;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.SqlProvider;
import org.springframework.util.Assert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 将preparedstatment设置成游标读法
 * Created by Administrator on 2016/10/26 0026.
 */
public class CursorQueryPreparedStatementCreator implements PreparedStatementCreator,SqlProvider {
    private String sql;
    private Integer maxNum;

    public CursorQueryPreparedStatementCreator(String sql, Integer maxNum) {
        Assert.notNull(sql, "SQL must not be null");
        this.sql = sql;
        this.maxNum = maxNum;
    }

    public CursorQueryPreparedStatementCreator(String sql) {
        Assert.notNull(sql, "SQL must not be null");
        this.sql = sql;
    }

    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
        PreparedStatement preparedStatement = con.prepareStatement(this.sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        if(maxNum!=null){
            preparedStatement.setMaxRows(maxNum);
        }

        return preparedStatement;
    }

    public String getSql() {
        return sql;
    }
}