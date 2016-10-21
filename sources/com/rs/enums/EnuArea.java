package com.rs.enums;

import java.util.Hashtable;

/**
 * 区域位置-区
 */
public enum EnuArea {
    AREA_0("0", "市南区"),
    AREA_1("1", "市北区"),
    AREA_2("2", "李沧区"),
    AREA_3("3", "崂山区"),
    AREA_4("4", "黄岛"),
    AREA_5("5", "城阳"),
    AREA_6("6", "即墨"),
    AREA_7("7", "胶州"),
    AREA_8("8", "平度"),
    AREA_9("9", "莱西");

    private String code = null;
    private String title = null;
    private static Hashtable<String, EnuArea> aliasEnums;

    EnuArea(String code, String title) {
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

    public static EnuArea valueOfAlias(String alias) {
        return aliasEnums.get(alias);
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}
