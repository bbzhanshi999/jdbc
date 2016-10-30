package com.simlink.empi.entity;

import java.io.Serializable;

/**
 * 记录empi计算状态的实体类
 * Created by Administrator on 2016/10/27 0027.
 */
public class EmpiCaculatingStatus implements Serializable {

    private Integer totalCount;
    private String status;
    private Integer lastBrbh;
    private Integer fixBrbh;
    private Integer fixCursor;
    public static final String FINSH = "0";
    public static final String CACULATING = "1";


    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getLastBrbh() {
        return lastBrbh;
    }

    public void setLastBrbh(Integer lastBrbh) {
        this.lastBrbh = lastBrbh;
    }

    public Integer getFixBrbh() {
        return fixBrbh;
    }

    public void setFixBrbh(Integer fixBrbh) {
        this.fixBrbh = fixBrbh;
    }

    public Integer getFixCursor() {
        return fixCursor;
    }

    public void setFixCursor(Integer fixCursor) {
        this.fixCursor = fixCursor;
    }
}
