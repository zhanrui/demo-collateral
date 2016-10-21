package com.rs.enums;

import java.util.Hashtable;

/**
 * 区域位置-市
 */
public enum EnuCity {
    CITY_0("0", "济南市"),
    CITY_1("1", "青岛市"),
    CITY_2("2", "淄博市"),
    CITY_3("3", "枣庄市"),
    CITY_4("4", "东营市"),
    CITY_5("5", "烟台市"),
    CITY_6("6", "潍坊市"),
    CITY_7("7", "济宁市"),
    CITY_8("8", "泰安市"),
    CITY_9("9", "威海市"),
    CITY_10("10", "日照市"),
    CITY_11("11", "滨州市"),
    CITY_12("12", "德州市"),
    CITY_13("13", "聊城市"),
    CITY_14("14", "临沂市"),
    CITY_15("15", "菏泽市"),
    CITY_16("16", "莱芜市");

    private String code = null;
    private String title = null;
    private static Hashtable<String, EnuCity> aliasEnums;

    EnuCity(String code, String title) {
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

    public static EnuCity valueOfAlias(String alias) {
        return aliasEnums.get(alias);
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}
