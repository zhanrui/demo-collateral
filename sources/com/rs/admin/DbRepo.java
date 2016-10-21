package com.rs.admin;

import com.rs.admin.repository.model.Collateral;
import com.rs.admin.repository.model.Land;
import com.rs.enums.*;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by baiqg on 2016/10/20.
 */
@ManagedBean
@ApplicationScoped
public class DbRepo {
    private List<Collateral> collateralList;
    private List<Land> landList;

    @PostConstruct
    public void init() {
        collateralList = new ArrayList<Collateral>();
        landList = new ArrayList<Land>();

        // 测试数据-草稿-土地
        Land land = new Land();
        land.setPkid("01");
        land.setAssetType(EnuAssetType.TYPE_0.getCode());
        land.setTitle("宜昌路16号");
        land.setLandType(EnuLandType.TYPE_1.getCode());
        land.setProvince(EnuProvince.PROVINCE_0.getCode());
        land.setCity(EnuCity.CITY_1.getCode());
        land.setArea(EnuArea.AREA_1.getCode());
        land.setLocation("宜昌路16号");
        land.setLandCertNo("331-317-370203-029-508-GB00001");
        land.setRestYears("70");
        land.setLandUseRightArea("23178.8");
        land.setVolumeRatio("≤3.5");
        land.setGreenLandRate("≥35%");
        land.setBuildingDensity("≤25%");
        land.setHousehold("2000");
        land.setIsClosed(EnuYesOrNo.NO.getCode());
        land.setIsMortgage(EnuYesOrNo.NO.getCode());
        land.setValuation("5000元/㎡");
        land.setBuyerConditon("房地产开发商");
        land.setPresentDescription("宜昌路16号甲地块原为山东省食品进出口公司四方仓库用地，青岛东大物流有限公司也在此办公，现在尚未拆迁。");
        land.setIsRecommend(EnuYesOrNo.NO.getCode());
        landList.add(land);

        Collateral collateral = new Collateral();
        collateral.setPkid("8861A8FF533F4C52B87D1918983C58DC");
        collateral.setUnit(EnuUnit.UNIT_0.getCode());
        collateral.setContact("张一");
        collateral.setPhone("18800000001");
        collateral.setMail("zhangyi@rs.com");
        collateral.setDealType("抵债资产");
        collateral.setAssetType(EnuAssetType.TYPE_0.getCode());
        collateral.setAssetPkid("01");
        collateral.setDescTag("土地 抵债资产 仓库 宜昌路");
        collateral.setStatus(EnuCollateralStatus.STATUS_0.getCode());
        collateralList.add(collateral);
    }


    public void addCollateral(Collateral collateral) {
        collateralList.add(collateral);
    }

    public void updCollateral(Collateral collateral) {
        delCollateral(collateral);
        addCollateral(collateral);
    }

    public void delCollateral(Collateral collateral) {
        int i = 0;
        for (i = 0; i < collateralList.size(); i++) {
            if (collateral.getPkid().equals(collateralList.get(i).getPkid())) {
                break;
            }
        }
        collateralList.remove(i);
    }

    public List<Collateral> getCollateralList() {
        return collateralList;
    }

    public List<Land> getLandList() {
        return landList;
    }

    public void addLand(Land land) {
        landList.add(land);
    }

    public void updLand(Land land) {
        delLand(land);
        addLand(land);
    }

    public void delLand(Land land) {
        int i = 0;
        for (i = 0; i < landList.size(); i++) {
            if (land.getPkid().equals(landList.get(i).getPkid())) {
                break;
            }
        }
        landList.remove(i);
    }
}
