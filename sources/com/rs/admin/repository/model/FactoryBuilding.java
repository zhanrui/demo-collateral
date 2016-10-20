package com.rs.admin.repository.model;

/**
 * 厂房
 */
public class FactoryBuilding {
    private String title;                   // 题目
    private String workshopProperty;        // 厂房性质
    private String location;                // 区域位置
    private String usedYears;               // 已使用年限
    private String landUseRightArea;        // 土地使用权总面积
    private String overallFloorage;         // 总建筑面积
    private String rightConstructionArea;   // 确权建筑面积
    private String noRightConstructionArea; // 未确权建筑面积
    private String household;               // 目前使用情况
    private String isHire;                  // 是否租赁
    private String isClosed;                // 是否查封
    private String isMortgage;              // 是否抵押
    private String uses;                    // 大致用途
    private String buyerConditon;           // 购买人条件
    private String valuation;               // 评估价值
    private String presentDescription;      // 押品现状描述
    private String isRecommend;             // 是否重点推荐

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorkshopProperty() {
        return workshopProperty;
    }

    public void setWorkshopProperty(String workshopProperty) {
        this.workshopProperty = workshopProperty;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUsedYears() {
        return usedYears;
    }

    public void setUsedYears(String usedYears) {
        this.usedYears = usedYears;
    }

    public String getLandUseRightArea() {
        return landUseRightArea;
    }

    public void setLandUseRightArea(String landUseRightArea) {
        this.landUseRightArea = landUseRightArea;
    }

    public String getOverallFloorage() {
        return overallFloorage;
    }

    public void setOverallFloorage(String overallFloorage) {
        this.overallFloorage = overallFloorage;
    }

    public String getRightConstructionArea() {
        return rightConstructionArea;
    }

    public void setRightConstructionArea(String rightConstructionArea) {
        this.rightConstructionArea = rightConstructionArea;
    }

    public String getNoRightConstructionArea() {
        return noRightConstructionArea;
    }

    public void setNoRightConstructionArea(String noRightConstructionArea) {
        this.noRightConstructionArea = noRightConstructionArea;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getIsHire() {
        return isHire;
    }

    public void setIsHire(String isHire) {
        this.isHire = isHire;
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

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public String getBuyerConditon() {
        return buyerConditon;
    }

    public void setBuyerConditon(String buyerConditon) {
        this.buyerConditon = buyerConditon;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation;
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
}
