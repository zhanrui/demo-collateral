package com.rs.enums;

import java.util.Hashtable;

/**
 * 所属单位
 */
public enum EnuUnit {
    UNIT_0("0", "单位一"),
    UNIT_1("1", "单位二"),
    UNIT_2("2", "单位三"),
    UNIT_3("3", "单位四"),
    UNIT_4("4", "单位五"),
    UNIT_5("5", "单位六"),
    UNIT_6("6", "单位七"),
    UNIT_7("7", "单位八"),
    UNIT_8("8", "单位九"),
    UNIT_9("9", "单位十");

    private String code = null;
    private String title = null;
    private static Hashtable<String, EnuUnit> aliasEnums;

    EnuUnit(String code, String title) {
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

    public static EnuUnit valueOfAlias(String alias) {
        return aliasEnums.get(alias);
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}
