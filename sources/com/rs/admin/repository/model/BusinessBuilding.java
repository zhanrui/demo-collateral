package com.rs.admin.repository.model;

/**
 * 商业用房
 */
public class BusinessBuilding {
    private String pkid;                    // 编号
    private String assetType;               // 押品资产类别
    private String title;                   // 题目
    private String houseProperty;           // 房产属性
    private String houseCertNo;             // 房产证号
    private String location;                // 区域位置
    private String totalFloor;              // 总楼层
    private String whichFloor;              // 所处第几层
    private String buildingArea;            // 建筑面积
    private String usedArea;                // 使用面积
    private String builtYear;               // 建成年份
    private String isHire;                  // 是否租赁
    private String isClosed;                // 是否查封
    private String isMortgage;              // 是否抵押
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

    public String getHouseProperty() {
        return houseProperty;
    }

    public void setHouseProperty(String houseProperty) {
        this.houseProperty = houseProperty;
    }

    public String getHouseCertNo() {
        return houseCertNo;
    }

    public void setHouseCertNo(String houseCertNo) {
        this.houseCertNo = houseCertNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(String totalFloor) {
        this.totalFloor = totalFloor;
    }

    public String getWhichFloor() {
        return whichFloor;
    }

    public void setWhichFloor(String whichFloor) {
        this.whichFloor = whichFloor;
    }

    public String getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(String buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(String usedArea) {
        this.usedArea = usedArea;
    }

    public String getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(String builtYear) {
        this.builtYear = builtYear;
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
