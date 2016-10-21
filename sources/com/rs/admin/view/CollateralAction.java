package com.rs.admin.view;

import com.rs.admin.DbRepo;
import com.rs.admin.repository.model.Collateral;
import com.rs.admin.repository.model.Land;
import com.rs.enums.EnuAssetType;
import com.rs.enums.EnuCollateralStatus;
import com.rs.util.EnumUtil;
import com.rs.util.MessageUtil;
import com.rs.util.ToolUtil;
import org.apache.commons.lang.StringUtils;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import java.util.List;

/**
 * Created by baiqg on 2016/10/20.
 */
@ManagedBean
@ViewScoped
public class CollateralAction {

    @ManagedProperty(value = "#{dbRepo}")
    private DbRepo dbRepo;

    private List<Collateral> dataList;
    private Collateral data;
    private Collateral collateralAdd = new Collateral();
    private Land land = new Land();         // 土地
    private List<SelectItem> unitMenu;      // 所属单位
    private List<SelectItem> assetTypeMenu; // 押品资产类别
    private List<SelectItem> landTypeMenu;  // 土地类型
    private List<SelectItem> provinceMenu;  // 区域位置-省
    private List<SelectItem> cityMenu;      // 区域位置-市
    private List<SelectItem> areaMenu;      // 区域位置-区
    private List<SelectItem> yesOrNoMenu;   // 是否

    @PostConstruct
    public void init() {
        dataList = dbRepo.getCollateralList();
        unitMenu = EnumUtil.getUnitMenu();           // 所属单位
        assetTypeMenu = EnumUtil.getAssetTypeMenu(); // 押品资产类别
        landTypeMenu = EnumUtil.getLandTypeMenu();   // 土地类型
        provinceMenu = EnumUtil.getProvinceMenu();   // 区域位置-省
        cityMenu = EnumUtil.getCityMenu();           // 区域位置-市
        areaMenu = EnumUtil.getAreaMenu();           // 区域位置-区
        land.setProvince("0");                       // 山东省
        land.setCity("1");                           // 青岛市
        land.setArea("0");                           // 市南区
        yesOrNoMenu = EnumUtil.getEnuYesOrNoMenu();
    }

    /**
     * 保存草稿
     */
    public void draftAdd() {
        collateralAdd.setPkid(ToolUtil.getDateTimeMsec());
        collateralAdd.setStatus(EnuCollateralStatus.STATUS_0.getCode());
        if(EnuAssetType.TYPE_0.getCode().equals(collateralAdd.getAssetType())) {
            land.setPkid(ToolUtil.getDateTimeMsec());
            land.setAssetType(collateralAdd.getAssetType());
            collateralAdd.setAssetPkid(land.getPkid());
            dbRepo.addLand(land);
        }
        dbRepo.addCollateral(collateralAdd);
        MessageUtil.addInfo("保存草稿成功！");
    }

    public void selectRecord(Collateral collateral) {
        data = collateral;
        if (StringUtils.isNotEmpty(data.getAssetType()) && data.getAssetType().equals("1")) {
            for (Land record : dbRepo.getLandList()) {
                if (record.getPkid().equals(data.getAssetPkid())) {
                    land = record;
                    break;
                }
            }
        }
    }

    public void onDelete(Collateral record) {
        dataList.remove(record);
    }

    //==============================================get set=====================================================
    public DbRepo getDbRepo() {
        return dbRepo;
    }

    public void setDbRepo(DbRepo dbRepo) {
        this.dbRepo = dbRepo;
    }

    public List<Collateral> getDataList() {
        return dataList;
    }

    public void setDataList(List<Collateral> dataList) {
        this.dataList = dataList;
    }

    public Collateral getData() {
        return data;
    }

    public void setData(Collateral data) {
        this.data = data;
    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public Collateral getCollateralAdd() {
        return collateralAdd;
    }

    public void setCollateralAdd(Collateral collateralAdd) {
        this.collateralAdd = collateralAdd;
    }

    public List<SelectItem> getUnitMenu() {
        return unitMenu;
    }

    public void setUnitMenu(List<SelectItem> unitMenu) {
        this.unitMenu = unitMenu;
    }

    public List<SelectItem> getAssetTypeMenu() {
        return assetTypeMenu;
    }

    public void setAssetTypeMenu(List<SelectItem> assetTypeMenu) {
        this.assetTypeMenu = assetTypeMenu;
    }

    public List<SelectItem> getLandTypeMenu() {
        return landTypeMenu;
    }

    public void setLandTypeMenu(List<SelectItem> landTypeMenu) {
        this.landTypeMenu = landTypeMenu;
    }

    public List<SelectItem> getProvinceMenu() {
        return provinceMenu;
    }

    public void setProvinceMenu(List<SelectItem> provinceMenu) {
        this.provinceMenu = provinceMenu;
    }

    public List<SelectItem> getCityMenu() {
        return cityMenu;
    }

    public void setCityMenu(List<SelectItem> cityMenu) {
        this.cityMenu = cityMenu;
    }

    public List<SelectItem> getAreaMenu() {
        return areaMenu;
    }

    public void setAreaMenu(List<SelectItem> areaMenu) {
        this.areaMenu = areaMenu;
    }

    public List<SelectItem> getYesOrNoMenu() {
        return yesOrNoMenu;
    }

    public void setYesOrNoMenu(List<SelectItem> yesOrNoMenu) {
        this.yesOrNoMenu = yesOrNoMenu;
    }
}
