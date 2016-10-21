package com.rs.admin;

import com.rs.admin.repository.model.Collateral;
import com.rs.admin.repository.model.Land;

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

        Land land = new Land();
        land.setPkid("01");
        land.setAssetType("1");
        land.setTitle("宜昌路16号");
        land.setLandType("2");
        land.setProvince("0");
        land.setCity("1");
        land.setArea("1");
        land.setLocation("宜昌路16号");
        land.setLandCertNo("331-317-370203-029-508-GB00001");
        land.setRestYears("70");
        land.setLandUseRightArea("23178.8");
        land.setVolumeRatio("≤3.5");
        land.setGreenLandRate("≥35%");
        land.setBuildingDensity("≤25%");
        land.setHousehold("2000");
        land.setIsClosed("0");
        land.setIsMortgage("0");
        land.setValuation("5000元/㎡");
        land.setBuyerConditon("无");
        land.setPresentDescription("宜昌路16号甲地块原为山东省食品进出口公司四方仓库用地，青岛东大物流有限公司也在此办公，现在尚未拆迁。");
        land.setIsRecommend("1");
        landList.add(land);

        Collateral collateral = new Collateral();
        collateral.setPkid("8861A8FF533F4C52B87D1918983C58DC");
        collateral.setUnit("单位1");
        collateral.setContact("张一");
        collateral.setPhone("18800000001");
        collateral.setMail("zhangyi@rs.com");
        collateral.setDealType("抵债资产");
        collateral.setAssetType("1");
        collateral.setAssetPkid("01");
        collateral.setDescTag("土地 抵债资产 仓库 宜昌路");
        collateralList.add(collateral);
    }


    public void addCollateral(Collateral collateral) {
        collateralList.add(collateral);
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
}
