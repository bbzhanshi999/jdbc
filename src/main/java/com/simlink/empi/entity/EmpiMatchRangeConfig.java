package com.simlink.empi.entity;

import java.io.Serializable;

public class EmpiMatchRangeConfig implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String matchDesc;
	private String minPercent;
	private String maxPercent;
	private String createId;
	private String createTime;
	private String modifyId;
	private String modifyTime;
	private String delFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatchDesc() {
		return matchDesc;
	}

	public void setMatchDesc(String matchDesc) {
		this.matchDesc = matchDesc;
	}

	public String getMinPercent() {
		return minPercent;
	}

	public void setMinPercent(String minPercent) {
		this.minPercent = minPercent;
	}

	public String getMaxPercent() {
		return maxPercent;
	}

	public void setMaxPercent(String maxPercent) {
		this.maxPercent = maxPercent;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyId() {
		return modifyId;
	}

	public void setModifyId(String modifyId) {
		this.modifyId = modifyId;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
}
