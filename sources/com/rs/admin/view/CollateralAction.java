package com.rs.admin.view;

import com.rs.admin.DbRepo;
import com.rs.admin.repository.model.Collateral;
import com.rs.admin.repository.model.Land;
import com.rs.enums.EnuAssetType;
import com.rs.enums.EnuCollateralStatus;
import com.rs.enums.EnuUnit;
import com.rs.util.EnumUtil;
import com.rs.util.MessageUtil;
import com.rs.util.ToolUtil;
import org.apache.commons.lang.StringUtils;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    private Land land = new Land();                          // 土地
    private List<SelectItem> unitMenu;                       // 所属单位
    private List<SelectItem> assetTypeMenu;                  // 押品资产类别
    private List<SelectItem> landTypeMenu;                   // 土地类型
    private List<SelectItem> provinceMenu;                   // 区域位置-省
    private List<SelectItem> cityMenu;                       // 区域位置-市
    private List<SelectItem> areaMenu;                       // 区域位置-区
    private List<SelectItem> yesOrNoMenu;                    // 是否
    private String status;                                   // 押品信息状态
    private EnuUnit enuUnit = EnuUnit.UNIT_0;                // 所属单位
    private EnuAssetType enuAssetType = EnuAssetType.TYPE_0; // 押品资产类别

    @PostConstruct
    public void init() {
        dataList = new ArrayList<Collateral>();
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
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        status = params.get("status");
        if (StringUtils.isNotEmpty(status)) {
            for (Collateral record : dbRepo.getCollateralList()) {
                if (record.getStatus().equals(status)) {
                    dataList.add(record);
                }
            }
        }
    }

    /**
     * 保存草稿
     */
    public void draftAdd() {
        collateralAdd.setPkid(ToolUtil.getDateTimeMsec());
        collateralAdd.setStatus(EnuCollateralStatus.STATUS_0.getCode());
        if (EnuAssetType.TYPE_0.getCode().equals(collateralAdd.getAssetType())) { // 土地
            land.setPkid(ToolUtil.getDateTimeMsec());
            land.setAssetType(collateralAdd.getAssetType());
            collateralAdd.setAssetPkid(land.getPkid());
            dbRepo.addLand(land);
        }
        dbRepo.addCollateral(collateralAdd);
        MessageUtil.addInfo("保存草稿成功！");
    }

    /**
     * 确认发布
     */
    public void infoPub() {
        collateralAdd.setPkid(ToolUtil.getDateTimeMsec());
        collateralAdd.setStatus(EnuCollateralStatus.STATUS_1.getCode());
        if (EnuAssetType.TYPE_0.getCode().equals(collateralAdd.getAssetType())) { // 土地
            land.setPkid(ToolUtil.getDateTimeMsec());
            land.setAssetType(collateralAdd.getAssetType());
            collateralAdd.setAssetPkid(land.getPkid());
            dbRepo.addLand(land);
        }
        dbRepo.addCollateral(collateralAdd);
        MessageUtil.addInfo("信息发布成功！");
    }

    /**
     * 确认发布草稿
     */
    public void infoPubByDraft() {
        data.setStatus(EnuCollateralStatus.STATUS_1.getCode());
        dbRepo.updCollateral(data);
        dataList = new ArrayList<Collateral>();
        data = null;
        for (Collateral record : dbRepo.getCollateralList()) {
            if (record.getStatus().equals(status)) {
                dataList.add(record);
            }
        }
        MessageUtil.addInfo("信息发布成功！");
    }

    /**
     * 保存修改
     */
    public void infoUpdate() {
        dbRepo.updCollateral(data);
        dbRepo.updLand(land);
        MessageUtil.addInfo("信息修改成功！");
    }

    /**
     * 保存修改-重新审核
     */
    public void infoUpdateRecheck() {
        data.setStatus(EnuCollateralStatus.STATUS_1.getCode());
        dbRepo.updCollateral(data);
        dataList = new ArrayList<Collateral>();
        data = null;
        for (Collateral record : dbRepo.getCollateralList()) {
            if (record.getStatus().equals(status)) {
                dataList.add(record);
            }
        }
        MessageUtil.addInfo("信息修改成功！");
    }

    /**
     * 审核通过
     */
    public void checkYes() {
        data.setStatus(EnuCollateralStatus.STATUS_3.getCode());
        dbRepo.updCollateral(data);
        dataList = new ArrayList<Collateral>();
        data = null;
        for (Collateral record : dbRepo.getCollateralList()) {
            if (record.getStatus().equals(status)) {
                dataList.add(record);
            }
        }
        MessageUtil.addInfo("审核成功！");
    }

    /**
     * 退回重发
     */
    public void checkNo() {
        data.setStatus(EnuCollateralStatus.STATUS_2.getCode());
        dbRepo.updCollateral(data);
        dataList = new ArrayList<Collateral>();
        data = null;
        for (Collateral record : dbRepo.getCollateralList()) {
            if (record.getStatus().equals(status)) {
                dataList.add(record);
            }
        }
        MessageUtil.addInfo("退回成功！");
    }

    /**
     * 已成交
     */
    public void bargain() {
        data.setStatus(EnuCollateralStatus.STATUS_4.getCode());
        dbRepo.updCollateral(data);
        dataList = new ArrayList<Collateral>();
        data = null;
        for (Collateral record : dbRepo.getCollateralList()) {
            if (record.getStatus().equals(status)) {
                dataList.add(record);
            }
        }
        MessageUtil.addInfo("成交成功！");
    }

    /**
     * 审核通过-已完成
     */
    public void infoComplete() {
        data.setStatus(EnuCollateralStatus.STATUS_5.getCode());
        dbRepo.updCollateral(data);
        dataList = new ArrayList<Collateral>();
        data = null;
        for (Collateral record : dbRepo.getCollateralList()) {
            if (record.getStatus().equals(status)) {
                dataList.add(record);
            }
        }
        MessageUtil.addInfo("审核成功！");
    }

    /**
     * 设置打开页面的状态
     *
     * @param status
     */
    public String open(String status) {
        return "/ui/admin/info.xhtml?faces-redirect=true&status=" + status;
    }

    public void selectRecord(Collateral collateral) {
        data = collateral;
        if (StringUtils.isNotEmpty(data.getAssetType()) && data.getAssetType().equals("0")) { // 土地
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EnuUnit getEnuUnit() {
        return enuUnit;
    }

    public void setEnuUnit(EnuUnit enuUnit) {
        this.enuUnit = enuUnit;
    }

    public EnuAssetType getEnuAssetType() {
        return enuAssetType;
    }

    public void setEnuAssetType(EnuAssetType enuAssetType) {
        this.enuAssetType = enuAssetType;
    }
}
