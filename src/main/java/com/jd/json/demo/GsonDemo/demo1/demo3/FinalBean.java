package com.jd.json.demo.GsonDemo.demo1.demo3;

import java.util.List;

public class FinalBean {
    private Integer formId;
    private List<DataList> dataList;
    private Long _time;

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public List<DataList> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataList> dataList) {
        this.dataList = dataList;
    }

    public Long get_time() {
        return _time;
    }

    public void set_time(Long _time) {
        this._time = _time;
    }

    @Override
    public String toString() {
        return "FinalBean{" +
                "formId=" + formId +
                ", dataList=" + dataList +
                ", _time=" + _time +
                '}';
    }
}
