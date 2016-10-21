package com.rs.enums;

import java.util.Hashtable;

/**
 * 区域位置-省
 */
public enum EnuProvince {
    PROVINCE_0("0", "山东省"),
    PROVINCE_1("1", "北京"),
    PROVINCE_2("2", "上海"),
    PROVINCE_3("3", "天津"),
    PROVINCE_4("4", "重庆"),
    PROVINCE_5("5", "香港"),
    PROVINCE_6("6", "澳门"),
    PROVINCE_7("7", "辽宁省"),
    PROVINCE_8("8", "江苏省"),
    PROVINCE_9("9", "湖北省"),
    PROVINCE_10("10", "四川省"),
    PROVINCE_11("11", "陕西省"),
    PROVINCE_12("12", "广东省"),
    PROVINCE_13("13", "河北省"),
    PROVINCE_14("14", "山西省"),
    PROVINCE_15("15", "河南省"),
    PROVINCE_16("16", "吉林省"),
    PROVINCE_17("17", "黑龙江"),
    PROVINCE_18("18", "内蒙古"),
    PROVINCE_19("19", "安徽省"),
    PROVINCE_20("20", "浙江省"),
    PROVINCE_21("21", "福建省"),
    PROVINCE_22("22", "湖南省"),
    PROVINCE_23("23", "江西省"),
    PROVINCE_24("24", "贵州省"),
    PROVINCE_25("25", "云南省"),
    PROVINCE_26("26", "甘肃省"),
    PROVINCE_27("27", "宁夏"),
    PROVINCE_28("28", "青海省"),
    PROVINCE_29("29", "广西省"),
    PROVINCE_30("30", "西藏"),
    PROVINCE_31("31", "新疆"),
    PROVINCE_32("32", "台湾省");

    private String code = null;
    private String title = null;
    private static Hashtable<String, EnuProvince> aliasEnums;

    EnuProvince(String code, String title) {
        this.init(code, title);
    }

    @SuppressWarnings("unchecked")
    private void init(String code, String title) {
        this.code = code;
        this.title = title;
        synchronized (this.getClass()) {
            if (aliasEnums == null) {
                aliasEnums = new Hashtable();
            }
        }
        aliasEnums.put(code, this);
        aliasEnums.put(title, this);
    }

    public static EnuProvince valueOfAlias(String alias) {
        return aliasEnums.get(alias);
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}
