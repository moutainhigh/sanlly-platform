package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PoolSourceRepair {
    private Integer id;

    private String prodCourseId;

    private String prodContainerId;

    private String containerNo;

    private String yard;

    private Date replyTime;

    private String isBackLease;

    private String containerUser;

    private String chargeObject;

    private String containerCategory;

    private BigDecimal realTaxTotalCostUsa;

    private BigDecimal realNotaxTotalCostUsa;

    private BigDecimal realTaxTotalCostRmb;

    private BigDecimal realNotaxTotalCostRmb;

    private BigDecimal realRate;

    private String realCurrencyType;

    private String payer;

    private String deptKey;

    private String deptCode;

    private String chargeTypeKey;

    private String freeStatus;

    private Integer itemStatus;

    private String remarks;

    private String noCostDesc;

    private Integer poolType;

    private String isEnabled;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Double finishedManHour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdCourseId() {
        return prodCourseId;
    }

    public void setProdCourseId(String prodCourseId) {
        this.prodCourseId = prodCourseId == null ? null : prodCourseId.trim();
    }

    public String getProdContainerId() {
        return prodContainerId;
    }

    public void setProdContainerId(String prodContainerId) {
        this.prodContainerId = prodContainerId == null ? null : prodContainerId.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getIsBackLease() {
        return isBackLease;
    }

    public void setIsBackLease(String isBackLease) {
        this.isBackLease = isBackLease == null ? null : isBackLease.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getChargeObject() {
        return chargeObject;
    }

    public void setChargeObject(String chargeObject) {
        this.chargeObject = chargeObject == null ? null : chargeObject.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public BigDecimal getRealTaxTotalCostUsa() {
        return realTaxTotalCostUsa;
    }

    public void setRealTaxTotalCostUsa(BigDecimal realTaxTotalCostUsa) {
        this.realTaxTotalCostUsa = realTaxTotalCostUsa;
    }

    public BigDecimal getRealNotaxTotalCostUsa() {
        return realNotaxTotalCostUsa;
    }

    public void setRealNotaxTotalCostUsa(BigDecimal realNotaxTotalCostUsa) {
        this.realNotaxTotalCostUsa = realNotaxTotalCostUsa;
    }

    public BigDecimal getRealTaxTotalCostRmb() {
        return realTaxTotalCostRmb;
    }

    public void setRealTaxTotalCostRmb(BigDecimal realTaxTotalCostRmb) {
        this.realTaxTotalCostRmb = realTaxTotalCostRmb;
    }

    public BigDecimal getRealNotaxTotalCostRmb() {
        return realNotaxTotalCostRmb;
    }

    public void setRealNotaxTotalCostRmb(BigDecimal realNotaxTotalCostRmb) {
        this.realNotaxTotalCostRmb = realNotaxTotalCostRmb;
    }

    public BigDecimal getRealRate() {
        return realRate;
    }

    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    public String getRealCurrencyType() {
        return realCurrencyType;
    }

    public void setRealCurrencyType(String realCurrencyType) {
        this.realCurrencyType = realCurrencyType == null ? null : realCurrencyType.trim();
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public String getDeptKey() {
        return deptKey;
    }

    public void setDeptKey(String deptKey) {
        this.deptKey = deptKey == null ? null : deptKey.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    public void setChargeTypeKey(String chargeTypeKey) {
        this.chargeTypeKey = chargeTypeKey == null ? null : chargeTypeKey.trim();
    }

    public String getFreeStatus() {
        return freeStatus;
    }

    public void setFreeStatus(String freeStatus) {
        this.freeStatus = freeStatus == null ? null : freeStatus.trim();
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getNoCostDesc() {
        return noCostDesc;
    }

    public void setNoCostDesc(String noCostDesc) {
        this.noCostDesc = noCostDesc == null ? null : noCostDesc.trim();
    }

    public Integer getPoolType() {
        return poolType;
    }

    public void setPoolType(Integer poolType) {
        this.poolType = poolType;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Double getFinishedManHour() {
        return finishedManHour;
    }

    public void setFinishedManHour(Double finishedManHour) {
        this.finishedManHour = finishedManHour;
    }
}