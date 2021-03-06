package com.sanlly.production.models.output.unitfailure;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/1
 * @description
 */
public class UnitFailureOutput {

    private Integer prodUnitFailureId;

    private String key;

    private String keyNameLang;

    private String unitFailureCode;

    private String unitFailureName;

    private String unitFailureNameEn;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdUnitFailureId() {
        return prodUnitFailureId;
    }

    public void setProdUnitFailureId(Integer prodUnitFailureId) {
        this.prodUnitFailureId = prodUnitFailureId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKeyNameLang() {
        return keyNameLang;
    }

    public void setKeyNameLang(String keyNameLang) {
        this.keyNameLang = keyNameLang;
    }

    public String getUnitFailureCode() {
        return unitFailureCode;
    }

    public void setUnitFailureCode(String unitFailureCode) {
        this.unitFailureCode = unitFailureCode;
    }

    public String getUnitFailureName() {
        return unitFailureName;
    }

    public void setUnitFailureName(String unitFailureName) {
        this.unitFailureName = unitFailureName;
    }

    public String getUnitFailureNameEn() {
        return unitFailureNameEn;
    }

    public void setUnitFailureNameEn(String unitFailureNameEn) {
        this.unitFailureNameEn = unitFailureNameEn;
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

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
