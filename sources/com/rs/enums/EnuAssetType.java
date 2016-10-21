package com.rs.enums;

import java.util.Hashtable;

/**
 * 押品资产类别
 */
public enum EnuAssetType {
    TYPE_0("0", "土地"),
    TYPE_1("1", "厂房"),
    TYPE_2("2", "商业用房"),
    TYPE_3("3", "住房"),
    TYPE_4("4", "机器设备"),
    TYPE_5("5", "机动车"),
    TYPE_6("6", "船舶"),
    TYPE_7("7", "股权"),
    TYPE_8("8", "林权"),
    TYPE_9("9", "钢材、有色金属、油品"),
    TYPE_10("10", "票据"),
    TYPE_11("11", "其他类押品资产");

    private String code = null;
    private String title = null;
    private static Hashtable<String, EnuAssetType> aliasEnums;

    EnuAssetType(String code, String title) {
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

    public static EnuAssetType valueOfAlias(String alias) {
        return aliasEnums.get(alias);
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}
