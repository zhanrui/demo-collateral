package com.rs.enums;

import java.util.Hashtable;

/**
 * 是否
 */
public enum EnuYesOrNo {
    NO("0", "否"),
    YES("1", "是");

    private String code = null;
    private String title = null;
    private static Hashtable<String, EnuYesOrNo> aliasEnums;

    EnuYesOrNo(String code, String title) {
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

    public static EnuYesOrNo valueOfAlias(String alias) {
        return aliasEnums.get(alias);
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}
