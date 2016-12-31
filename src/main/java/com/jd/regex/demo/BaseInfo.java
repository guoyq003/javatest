package com.jd.regex.demo;

import java.util.Date;

/**
 * Created by guoyq on 2016/12/31.
 */
public class BaseInfo {
    private String projNumber;
    private String projName;
    private int planPercent;
    private int percent;
    private String priorityTypeName;
    private String des;
    private String businessManName;
    private String businessDeptName;
    private String roiTypeNames;
    private String roiTargets;
    private String projTypeName;
    private String developDepTierName;
    private String developDepNames;
    private String developDepTierCodes;
    private String pmErp;
    private String pmName;
    private String pmoErp;
    private String pmoName;
    private String poNames;
    private String pdNames;
    private Date createrTime;
    private Date startTime;
    private Date endTime;
    private Date planStartTime;
    private Date planEndTime;
    private int planHours;
    private int  usedHours;

    public String getProjNumber() {
        return projNumber;
    }

    public void setProjNumber(String projNumber) {
        this.projNumber = projNumber;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public int getPlanPercent() {
        return planPercent;
    }

    public void setPlanPercent(int planPercent) {
        this.planPercent = planPercent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getPriorityTypeName() {
        return priorityTypeName;
    }

    public void setPriorityTypeName(String priorityTypeName) {
        this.priorityTypeName = priorityTypeName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getBusinessManName() {
        return businessManName;
    }

    public void setBusinessManName(String businessManName) {
        this.businessManName = businessManName;
    }

    public String getBusinessDeptName() {
        return businessDeptName;
    }

    public void setBusinessDeptName(String businessDeptName) {
        this.businessDeptName = businessDeptName;
    }

    public String getRoiTypeNames() {
        return roiTypeNames;
    }

    public void setRoiTypeNames(String roiTypeNames) {
        this.roiTypeNames = roiTypeNames;
    }

    public String getRoiTargets() {
        return roiTargets;
    }

    public void setRoiTargets(String roiTargets) {
        this.roiTargets = roiTargets;
    }

    public String getProjTypeName() {
        return projTypeName;
    }

    public void setProjTypeName(String projTypeName) {
        this.projTypeName = projTypeName;
    }

    public String getDevelopDepTierName() {
        return developDepTierName;
    }

    public void setDevelopDepTierName(String developDepTierName) {
        this.developDepTierName = developDepTierName;
    }

    public String getDevelopDepNames() {
        return developDepNames;
    }

    public void setDevelopDepNames(String developDepNames) {
        this.developDepNames = developDepNames;
    }

    public String getDevelopDepTierCodes() {
        return developDepTierCodes;
    }

    public void setDevelopDepTierCodes(String developDepTierCodes) {
        this.developDepTierCodes = developDepTierCodes;
    }

    public String getPmErp() {
        return pmErp;
    }

    public void setPmErp(String pmErp) {
        this.pmErp = pmErp;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName;
    }

    public String getPmoErp() {
        return pmoErp;
    }

    public void setPmoErp(String pmoErp) {
        this.pmoErp = pmoErp;
    }

    public String getPmoName() {
        return pmoName;
    }

    public void setPmoName(String pmoName) {
        this.pmoName = pmoName;
    }

    public String getPoNames() {
        return poNames;
    }

    public void setPoNames(String poNames) {
        this.poNames = poNames;
    }

    public String getPdNames() {
        return pdNames;
    }

    public void setPdNames(String pdNames) {
        this.pdNames = pdNames;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Date getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    public int getPlanHours() {
        return planHours;
    }

    public void setPlanHours(int planHours) {
        this.planHours = planHours;
    }

    public int getUsedHours() {
        return usedHours;
    }

    public void setUsedHours(int usedHours) {
        this.usedHours = usedHours;
    }

    @Override
    public String toString() {
        return "BaseInfo{" +
                "projNumber='" + projNumber + '\'' +
                ", projName='" + projName + '\'' +
                ", planPercent=" + planPercent +
                ", percent=" + percent +
                ", priorityTypeName='" + priorityTypeName + '\'' +
                ", des='" + des + '\'' +
                ", businessManName='" + businessManName + '\'' +
                ", businessDeptName='" + businessDeptName + '\'' +
                ", roiTypeNames='" + roiTypeNames + '\'' +
                ", roiTargets='" + roiTargets + '\'' +
                ", projTypeName='" + projTypeName + '\'' +
                ", developDepTierName='" + developDepTierName + '\'' +
                ", developDepNames='" + developDepNames + '\'' +
                ", developDepTierCodes='" + developDepTierCodes + '\'' +
                ", pmErp='" + pmErp + '\'' +
                ", pmName='" + pmName + '\'' +
                ", pmoErp='" + pmoErp + '\'' +
                ", pmoName='" + pmoName + '\'' +
                ", poNames='" + poNames + '\'' +
                ", pdNames='" + pdNames + '\'' +
                ", createrTime=" + createrTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", planStartTime=" + planStartTime +
                ", planEndTime=" + planEndTime +
                ", planHours=" + planHours +
                ", usedHours=" + usedHours +
                '}';
    }
}
