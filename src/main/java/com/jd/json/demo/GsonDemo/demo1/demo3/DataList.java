package com.jd.json.demo.GsonDemo.demo1.demo3;

import java.util.HashMap;
import java.util.List;

public class DataList {
    private List<HashMap> detailList;
    private String assignUser;
    private Integer formId;

    public String getAssignUser() {
        return assignUser;
    }

    public void setAssignUser(String assignUser) {
        this.assignUser = assignUser;
    }

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public List<HashMap> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<HashMap> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "DataList{" +
                "detailList=" + detailList +
                ", assignUser='" + assignUser + '\'' +
                ", formId=" + formId +
                '}';
    }
}
