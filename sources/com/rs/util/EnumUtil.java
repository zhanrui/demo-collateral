package com.rs.util;

import com.rs.enums.*;

import javax.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.List;

/**
 * 枚举工具类
 */
public class EnumUtil {
    /**
     * 押品资产类别
     *
     * @return
     */
    public static List<SelectItem> getAssetTypeMenu() {
        List<SelectItem> list = new ArrayList<SelectItem>();
        list.add(new SelectItem("", ""));
        for (EnuAssetType record : EnuAssetType.values()) {
            list.add(new SelectItem(record.getCode(), record.getTitle()));
        }
        return list;
    }

    /**
     * 所属单位
     *
     * @return
     */
    public static List<SelectItem> getUnitMenu() {
        List<SelectItem> list = new ArrayList<SelectItem>();
        list.add(new SelectItem("", ""));
        for (EnuUnit record : EnuUnit.values()) {
            list.add(new SelectItem(record.getCode(), record.getTitle()));
        }
        return list;
    }

    /**
     * 土地类型
     *
     * @return
     */
    public static List<SelectItem> getLandTypeMenu() {
        List<SelectItem> list = new ArrayList<SelectItem>();
        list.add(new SelectItem("", ""));
        for (EnuLandType record : EnuLandType.values()) {
            list.add(new SelectItem(record.getCode(), record.getTitle()));
        }
        return list;
    }

    /**
     * 区域位置-省
     *
     * @return
     */
    public static List<SelectItem> getProvinceMenu() {
        List<SelectItem> list = new ArrayList<SelectItem>();
        list.add(new SelectItem("", ""));
        for (EnuProvince record : EnuProvince.values()) {
            list.add(new SelectItem(record.getCode(), record.getTitle()));
        }
        return list;
    }

    /**
     * 区域位置-市
     *
     * @return
     */
    public static List<SelectItem> getCityMenu() {
        List<SelectItem> list = new ArrayList<SelectItem>();
        list.add(new SelectItem("", ""));
        for (EnuCity record : EnuCity.values()) {
            list.add(new SelectItem(record.getCode(), record.getTitle()));
        }
        return list;
    }

    /**
     * 区域位置-区
     *
     * @return
     */
    public static List<SelectItem> getAreaMenu() {
        List<SelectItem> list = new ArrayList<SelectItem>();
        list.add(new SelectItem("", ""));
        for (EnuArea record : EnuArea.values()) {
            list.add(new SelectItem(record.getCode(), record.getTitle()));
        }
        return list;
    }

    /**
     * 是否
     *
     * @return
     */
    public static List<SelectItem> getEnuYesOrNoMenu() {
        List<SelectItem> list = new ArrayList<SelectItem>();
        for (EnuYesOrNo record : EnuYesOrNo.values()) {
            list.add(new SelectItem(record.getCode(), record.getTitle()));
        }
        return list;
    }
}
