package com.simlink.empi.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class Brjbxx implements Serializable {


    public Brjbxx() {
        super();
    }

    public Brjbxx(Integer brbh, String ylbxh) {
        this.brbh = brbh;
        this.ylbxh = ylbxh;
    }



    /**
     * identifier field
     */
    private Integer brbh;

    /**
     * persistent field
     */
    private String xm;

    /**
     * nullable persistent field
     */
    private String mzh;

    /**
     * persistent field
     */
    private String zyh;

    /**
     * persistent field
     */
    private Integer xb;

    /**
     * nullable persistent field
     */
    private Date csry;

    /**
     * nullable persistent field
     */
    private String ylbxh;

    /**
     * nullable persistent field
     */
    private Integer ylzfxs;

    /**
     * nullable persistent field
     */
    private String zy;

    /**
     * nullable persistent field
     */
    private Integer nl;

    /**
     * nullable persistent field
     */
    private Integer nllx;

    /**
     * nullable persistent field
     */
    private Integer hy;

    /**
     * nullable persistent field
     */
    private Integer mz;

    /**
     * nullable persistent field
     */
    private Integer jg;

    /**
     * nullable persistent field
     */
    private String gj;

    /**
     * nullable persistent field
     */
    private String sfzhm;

    /**
     * nullable persistent field
     */
    private String gzdwjdz;

    /**
     * nullable persistent field
     */
    private String dwdh;

    /**
     * nullable persistent field
     */
    private String hkdz;

    /**
     * nullable persistent field
     */
    private String jtdh;

    /**
     * nullable persistent field
     */
    private String jjly;

    /**
     * nullable persistent field
     */
    private String lxrxm;

    /**
     * nullable persistent field
     */
    private String lxrgx;

    /**
     * nullable persistent field
     */
    private String lxrdz;

    /**
     * nullable persistent field
     */
    private String lxrdh;

    /**
     * nullable persistent field
     */
    private Integer zjxy;

    /**
     * nullable persistent field
     */
    private Integer whcd;

    /**
     * nullable persistent field
     */
    private Integer xx;

    /**
     * nullable persistent field
     */
    private Integer rhyz;

    /**
     * nullable persistent field
     */
    private Date createTime;

    /**
     * nullable persistent field
     */
    private Date modifyTime;

    /**
     * nullable persistent field
     */
    private Integer createId;

    /**
     * nullable persistent field
     */
    private Integer modifyId;

    /**
     * nullable persistent field
     */
    private Integer rycs;

    /**
     * nullable persistent field
     */
    private String jtzz;

    /**
     * nullable persistent field
     */
    private String dwyzbm;

    /**
     * nullable persistent field
     */
    private String hkyzbm;

    /**
     * nullable persistent field
     */
    private String csd;

    /**
     * nullable persistent field
     */
    private Integer jgs;

    /**
     * nullable persistent field
     */
    private String dateSource;

    /**
     * nullable persistent field
     */
    private String jgText;

    private String mzText;

    private String gjText;

    private Set brryxxs;

    private Integer zjlx; //证件类型

    private String zjlxsm;

    private String xzyzbm;

    private String xzdz; //现住地址

    private Integer yyId;

    public String getXzdz() {
        return xzdz;
    }

    public void setXzdz(String xzdz) {
        this.xzdz = xzdz;
    }

    public String getXzyzbm() {
        return xzyzbm;
    }

    public void setXzyzbm(String xzyzbm) {
        this.xzyzbm = xzyzbm;
    }

    public Integer getZjlx() {
        return zjlx;
    }

    public void setZjlx(Integer zjlx) {
        this.zjlx = zjlx;
    }

    public String getZjlxsm() {
        return zjlxsm;
    }

    public void setZjlxsm(String zjlxsm) {
        this.zjlxsm = zjlxsm;
    }

    public Integer getBrbh() {
        return this.brbh;
    }

    public void setBrbh(Integer brbh) {
        this.brbh = brbh;
    }

    public String getXm() {
        return this.xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getMzh() {
        return this.mzh;
    }

    public void setMzh(String mzh) {
        this.mzh = mzh;
    }

    public String getZyh() {
        return this.zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh;
    }

    public Integer getXb() {
        return this.xb;
    }

    public void setXb(Integer xb) {
        this.xb = xb;
    }

    public Date getCsry() {
        return this.csry;
    }

    public void setCsry(Date csry) {
        this.csry = csry;
    }

    public String getYlbxh() {
        return this.ylbxh;
    }

    public void setYlbxh(String ylbxh) {
        this.ylbxh = ylbxh;
    }

    public Integer getYlzfxs() {
        return this.ylzfxs;
    }

    public void setYlzfxs(Integer ylzfxs) {
        this.ylzfxs = ylzfxs;
    }

    public String getZy() {
        return this.zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public Integer getNl() {
        return this.nl;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }

    public Integer getNllx() {
        return this.nllx;
    }

    public void setNllx(Integer nllx) {
        this.nllx = nllx;
    }

    public Integer getHy() {
        return this.hy;
    }

    public void setHy(Integer hy) {
        this.hy = hy;
    }

    public Integer getMz() {
        return this.mz;
    }

    public void setMz(Integer mz) {
        this.mz = mz;
    }

    public Integer getJg() {
        return this.jg;
    }

    public void setJg(Integer jg) {
        this.jg = jg;
    }

    public String getGj() {
        return this.gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getSfzhm() {
        return this.sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    public String getGzdwjdz() {
        return this.gzdwjdz;
    }

    public void setGzdwjdz(String gzdwjdz) {
        this.gzdwjdz = gzdwjdz;
    }

    public String getDwdh() {
        return this.dwdh;
    }

    public void setDwdh(String dwdh) {
        this.dwdh = dwdh;
    }

    public String getHkdz() {
        return this.hkdz;
    }

    public void setHkdz(String hkdz) {
        this.hkdz = hkdz;
    }

    public String getJtdh() {
        return this.jtdh;
    }

    public void setJtdh(String jtdh) {
        this.jtdh = jtdh;
    }

    public String getJjly() {
        return this.jjly;
    }

    public void setJjly(String jjly) {
        this.jjly = jjly;
    }

    public String getLxrxm() {
        return this.lxrxm;
    }

    public void setLxrxm(String lxrxm) {
        this.lxrxm = lxrxm;
    }

    public String getLxrgx() {
        return this.lxrgx;
    }

    public void setLxrgx(String lxrgx) {
        this.lxrgx = lxrgx;
    }

    public String getLxrdz() {
        return this.lxrdz;
    }

    public void setLxrdz(String lxrdz) {
        this.lxrdz = lxrdz;
    }

    public String getLxrdh() {
        return this.lxrdh;
    }

    public void setLxrdh(String lxrdh) {
        this.lxrdh = lxrdh;
    }

    public Integer getZjxy() {
        return this.zjxy;
    }

    public void setZjxy(Integer zjxy) {
        this.zjxy = zjxy;
    }

    public Integer getWhcd() {
        return this.whcd;
    }

    public void setWhcd(Integer whcd) {
        this.whcd = whcd;
    }

    public Integer getXx() {
        return this.xx;
    }

    public void setXx(Integer xx) {
        this.xx = xx;
    }

    public Integer getRhyz() {
        return this.rhyz;
    }

    public void setRhyz(Integer rhyz) {
        this.rhyz = rhyz;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getCreateId() {
        return this.createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getModifyId() {
        return this.modifyId;
    }

    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }

    public Integer getRycs() {
        return this.rycs;
    }

    public void setRycs(Integer rycs) {
        this.rycs = rycs;
    }

    public String getJtzz() {
        return this.jtzz;
    }

    public void setJtzz(String jtzz) {
        this.jtzz = jtzz;
    }

    public String getDwyzbm() {
        return this.dwyzbm;
    }

    public void setDwyzbm(String dwyzbm) {
        this.dwyzbm = dwyzbm;
    }

    public String getHkyzbm() {
        return this.hkyzbm;
    }

    public void setHkyzbm(String hkyzbm) {
        this.hkyzbm = hkyzbm;
    }

    public String getCsd() {
        return this.csd;
    }

    public void setCsd(String csd) {
        this.csd = csd;
    }

    public Integer getJgs() {
        return this.jgs;
    }

    public void setJgs(Integer jgs) {
        this.jgs = jgs;
    }

    public String getDateSource() {
        return this.dateSource;
    }

    public void setDateSource(String dateSource) {
        this.dateSource = dateSource;
    }

    public String getJgText() {
        return this.jgText;
    }

    public void setJgText(String jgText) {
        this.jgText = jgText;
    }

    public Set getBrryxxs() {
        return this.brryxxs;
    }

    public void setBrryxxs(Set brryxxs) {
        this.brryxxs = brryxxs;
    }

    public String getMzText() {
        return mzText;
    }

    public void setMzText(String mzText) {
        this.mzText = mzText;
    }

    public String getGjText() {
        return gjText;
    }

    public void setGjText(String gjText) {
        this.gjText = gjText;
    }

    public Integer getYyId() {
        return yyId;
    }

    public void setYyId(Integer yyId) {
        this.yyId = yyId;
    }


}
