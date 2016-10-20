package com.rs.admin.view;

import com.rs.admin.repository.model.Collateral;
import com.rs.admin.repository.model.Land;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by baiqg on 2016/10/20.
 */
@ManagedBean
@ViewScoped
public class CollateralAction {

    private List<Collateral> dataList;
    private Collateral data;

    @PostConstruct
    public void init() {
        dataList = new ArrayList<Collateral>();
        Collateral record = new Collateral();
        record.setPkid("8861A8FF533F4C52B87D1918983C58DC");
        record.setUnit("单位1");
        record.setContact("张一");
        record.setPhone("18800000001");
        record.setMail("zhangyi@rs.com");
        record.setDealType("抵债资产");
        record.setAssetType("1");
        Land land = new Land();
        land.setTitle("宜昌路16号");
        land.setLandType("2");
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
        record.setLand(land);
        dataList.add(record);

    }

    public void selectRecord(Collateral record) {
        data = record;
    }

    public void onDelete(Collateral record) {
        dataList.remove(record);
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
}
