package com.rs.admin.repository.model;

/**
 * 押品信息
 */
public class Collateral {
    private String pkid;                       // 编号
    private String unit;                       // 所属单位
    private String contact;                    // 咨询联系人
    private String phone;                      // 电话
    private String mail;                       // 邮箱
    private String dealType;                   // 押品可处置属性
    private String assetType;                  // 押品资产类别
    private String assetPkid;                  // 押品ID
    private String descTag;                    // 押品描述 标签
    private String status;                     // 状态

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

    public String getAssetPkid() {
        return assetPkid;
    }

    public void setAssetPkid(String assetPkid) {
        this.assetPkid = assetPkid;
    }

    public String getDescTag() {
        return descTag;
    }

    public void setDescTag(String descTag) {
        this.descTag = descTag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
