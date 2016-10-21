package com.rs.enums;

import java.util.Hashtable;

/**
 * 土地类型
 */
public enum EnuLandType {
    TYPE_0("0", "工业用地"),
    TYPE_1("1", "商业用地"),
    TYPE_2("2", "农业用地");

    private String code = null;
    private String title = null;
    private static Hashtable<String, EnuLandType> aliasEnums;

    EnuLandType(String code, String title) {
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

    public static EnuLandType valueOfAlias(String alias) {
        return aliasEnums.get(alias);
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}
