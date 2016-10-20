package com.rs.admin.repository.model;

/**
 * Created by baiqg on 2016/10/20.
 */
public class Collateral {
    private String pkid;                       // 编号
    private String unit;                       // 所属单位
    private String contact;                    // 咨询联系人
    private String phone;                      // 电话
    private String mail;                       // 邮箱
    private String dealType;                   // 押品可处置属性
    private String assetType;                  // 押品资产类别
    private Land land;                         // 土地
    private FactoryBuilding factoryBuilding;   // 厂房
    private BusinessBuilding businessBuilding; // 商业用房

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public FactoryBuilding getFactoryBuilding() {
        return factoryBuilding;
    }

    public void setFactoryBuilding(FactoryBuilding factoryBuilding) {
        this.factoryBuilding = factoryBuilding;
    }

    public BusinessBuilding getBusinessBuilding() {
        return businessBuilding;
    }

    public void setBusinessBuilding(BusinessBuilding businessBuilding) {
        this.businessBuilding = businessBuilding;
    }
}
