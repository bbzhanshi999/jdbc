package com.simlink.empi.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
public class EmpiInfo extends Brjbxx implements Serializable {

    private String id;
    private String inputType;
    private Integer percentage;
    private List<Brjbxx> relatedBrjbxx;

    public static final String AUTO = "0";
    public static final String MANUAL = "1";


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public List<Brjbxx> getRelatedBrjbxx() {
        return relatedBrjbxx;
    }

    public void setRelatedBrjbxx(List<Brjbxx> relatedBrjbxx) {
        this.relatedBrjbxx = relatedBrjbxx;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }
}
