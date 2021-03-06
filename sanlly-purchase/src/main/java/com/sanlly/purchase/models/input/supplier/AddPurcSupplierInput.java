package com.sanlly.purchase.models.input.supplier;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.models.input.supplierspecial.SpecialInput;

import java.util.Date;
import java.util.List;

public class AddPurcSupplierInput {
    //主键id
    private Integer purcSupplierId;
    //联系手机号
    private String mobilePhoneNum;
    //中文名称
    private String name;
    //英文名称
    private String nameEn;
    //社会信用代码
    private String creditCode;
    //国家
    private String country;
    //城市
    private String city;
    //注册地址
    private String regAddress;
    //经营地址
    private String busniessAddress;
    //法人
    private String legalPerson;
    //服务范围
    private String servicesContent;
    //企业性质
    private String natureId;
    //注册资金
    private String registeredFunds;
    //成立日期
    @JsonFormat(pattern = "yyyy-MM-dd",locale="zh", timezone="GMT+8")
    private Date foundDate;
    //结算信用期
    private String settlementCycle;
    //供应商代码
    private String vendorCode;

    private String sapId;
    //供应商有效期
    private String periodSupplier;
    //结算类型
    private String settlementType;
    //是否黑名单
    private String isBlack;
   //是否特殊关联企业
    private String isSpecial;
    //采购类型
    private String procureType;
    //注册方式
    private Integer registrationMethod;
    //库类别
    private String storehouseType;
    //是否单一来源
    private Integer isSingleSupplier;
    //供应商等级
    private String grade;
    //是否淘汰
    private String isEliminate;
    //币种
    private String currency;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String key;
    //是否物料供应商
    private String isMaterials;

    //公司key列表
    private List<String> companys;
    //供应商类别
    private List<SupplierTypeInput> SupplierTypeInput;
    //公司联系方式 不使用
    private List<CompanycontactInformation> companycontactInformations;
    //联系人列表
    private List<ContactInformation> contactInformations;
    //管理文件列表
    private List<Management> managements;
    //资质文件列表
    private List<QualificationDocuments> qualificationDocuments;
    //银行信息列表 
    private List<BankInformation> bankInformations;
    //供应材料列表
    private List<SpecialInput> specials;

    public String getIsEliminate() {
        return isEliminate;
    }

    public String getIsMaterials() {
        return isMaterials;
    }

    public void setIsMaterials(String isMaterials) {
        this.isMaterials = isMaterials;
    }

    public List<SpecialInput> getSpecials() {
        return specials;
    }

    public void setSpecials(List<SpecialInput> specials) {
        this.specials = specials;
    }

    public List<SupplierTypeInput> getSupplierTypeInput() {
        return SupplierTypeInput;
    }

    public void setSupplierTypeInput(List<SupplierTypeInput> supplierTypeInput) {
        SupplierTypeInput = supplierTypeInput;
    }


    public Integer getPurcSupplierId() {
        return purcSupplierId;
    }

    public void setPurcSupplierId(Integer purcSupplierId) {
        this.purcSupplierId = purcSupplierId;
    }

    public String getMobilePhoneNum() {
        return mobilePhoneNum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setMobilePhoneNum(String mobilePhoneNum) {
        this.mobilePhoneNum = mobilePhoneNum == null ? null : mobilePhoneNum.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }


    public void setNatureId(String natureId) {
        this.natureId = natureId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress == null ? null : regAddress.trim();
    }

    public String getBusniessAddress() {
        return busniessAddress;
    }

    public void setBusniessAddress(String busniessAddress) {
        this.busniessAddress = busniessAddress == null ? null : busniessAddress.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getServicesContent() {
        return servicesContent;
    }

    public void setServicesContent(String servicesContent) {
        this.servicesContent = servicesContent == null ? null : servicesContent.trim();
    }


    public String getRegisteredFunds() {
        return registeredFunds;
    }

    public void setRegisteredFunds(String registeredFunds) {
        this.registeredFunds = registeredFunds == null ? null : registeredFunds.trim();
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public String getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(String settlementCycle) {
        this.settlementCycle = settlementCycle == null ? null : settlementCycle.trim();
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }

    public String getSapId() {
        return sapId;
    }

    public void setSapId(String sapId) {
        this.sapId = sapId == null ? null : sapId.trim();
    }

    public String getPeriodSupplier() {
        return periodSupplier;
    }

    public void setPeriodSupplier(String periodSupplier) {
        this.periodSupplier = periodSupplier == null ? null : periodSupplier.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(String isBlack) {
        this.isBlack = isBlack;
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial;
    }

    public void setIsEliminate(String isEliminate) {
        this.isEliminate = isEliminate;
    }

    public String getProcureType() {
        return procureType;
    }

    public void setProcureType(String procureType) {
        this.procureType = procureType == null ? null : procureType.trim();
    }

    public Integer getRegistrationMethod() {
        return registrationMethod;
    }

    public void setRegistrationMethod(Integer registrationMethod) {
        this.registrationMethod = registrationMethod;
    }

    public String getStorehouseType() {
        return storehouseType;
    }

    public void setStorehouseType(String storehouseType) {
        this.storehouseType = storehouseType == null ? null : storehouseType.trim();
    }

    public Integer getIsSingleSupplier() {
        return isSingleSupplier;
    }

    public void setIsSingleSupplier(Integer isSingleSupplier) {
        this.isSingleSupplier = isSingleSupplier;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public List<CompanycontactInformation> getCompanycontactInformations() {
        return companycontactInformations;
    }

    public void setCompanycontactInformations(List<CompanycontactInformation> companycontactInformations) {
        this.companycontactInformations = companycontactInformations;
    }

    public List<ContactInformation> getContactInformations() {
        return contactInformations;
    }

    public void setContactInformations(List<ContactInformation> contactInformations) {
        this.contactInformations = contactInformations;
    }

    public List<Management> getManagements() {
        return managements;
    }

    public void setManagements(List<Management> managements) {
        this.managements = managements;
    }

    public List<QualificationDocuments> getQualificationDocuments() {
        return qualificationDocuments;
    }

    public void setQualificationDocuments(List<QualificationDocuments> qualificationDocuments) {
        this.qualificationDocuments = qualificationDocuments;
    }

    public List<BankInformation> getBankInformations() {
        return bankInformations;
    }

    public void setBankInformations(List<BankInformation> bankInformations) {
        this.bankInformations = bankInformations;
    }

    public List<String> getCompanys() {
        return companys;
    }

    public void setCompanys(List<String> companys) {
        this.companys = companys;
    }

    public String getNatureId() {
        return natureId;
    }



}