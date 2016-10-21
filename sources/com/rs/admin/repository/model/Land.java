package com.rs.admin.repository.model;

/**
 * 土地
 */
public class Land {
    private String pkid;               // 编号
    private String assetType;          // 押品资产类别
    private String title;              // 题目
    private String landType;           // 土地类型
    private String province;           // 区域位置-省
    private String city;               // 区域位置-市
    private String area;               // 区域位置-区
    private String location;           // 区域位置-具体位置
    private String landCertNo;         // 土地证书编号
    private String restYears;          // 剩余使用年限
    private String landUseRightArea;   // 土地使用权面积
    private String volumeRatio;        // 容积率
    private String greenLandRate;      // 绿地率
    private String buildingDensity;    // 建筑密度
    private String household;          // 地上住户、占用情况
    private String isClosed;           // 是否查封
    private String isMortgage;         // 是否抵押
    private String valuation;          // 评估价值
    private String buyerConditon;      // 购买人条件
    private String presentDescription; // 押品现状描述
    private String isRecommend;        // 是否重点推荐

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLandType() {
        return landType;
    }

    public void setLandType(String landType) {
        this.landType = landType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLandCertNo() {
        return landCertNo;
    }

    public void setLandCertNo(String landCertNo) {
        this.landCertNo = landCertNo;
    }

    public String getRestYears() {
        return restYears;
    }

    public void setRestYears(String restYears) {
        this.restYears = restYears;
    }

    public String getLandUseRightArea() {
        return landUseRightArea;
    }

    public void setLandUseRightArea(String landUseRightArea) {
        this.landUseRightArea = landUseRightArea;
    }

    public String getVolumeRatio() {
        return volumeRatio;
    }

    public void setVolumeRatio(String volumeRatio) {
        this.volumeRatio = volumeRatio;
    }

    public String getGreenLandRate() {
        return greenLandRate;
    }

    public void setGreenLandRate(String greenLandRate) {
        this.greenLandRate = greenLandRate;
    }

    public String getBuildingDensity() {
        return buildingDensity;
    }

    public void setBuildingDensity(String buildingDensity) {
        this.buildingDensity = buildingDensity;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public String getIsMortgage() {
        return isMortgage;
    }

    public void setIsMortgage(String isMortgage) {
        this.isMortgage = isMortgage;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    public String getBuyerConditon() {
        return buyerConditon;
    }

    public void setBuyerConditon(String buyerConditon) {
        this.buyerConditon = buyerConditon;
    }

    public String getPresentDescription() {
        return presentDescription;
    }

    public void setPresentDescription(String presentDescription) {
        this.presentDescription = presentDescription;
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }
}
