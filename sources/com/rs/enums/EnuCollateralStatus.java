package com.rs.enums;

import java.util.Hashtable;

/**
 * 押品信息状态
 */
public enum EnuCollateralStatus {
    STATUS_0("0", "草稿"),
    STATUS_1("1", "待审核"),
    STATUS_2("2", "退回"),
    STATUS_3("3", "已发布"),
    STATUS_4("4", "待完成"),
    STATUS_5("5", "已完成");

    private String code = null;
    private String title = null;
    private static Hashtable<String, EnuCollateralStatus> aliasEnums;

    EnuCollateralStatus(String code, String title) {
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

    public static EnuCollateralStatus valueOfAlias(String alias) {
        return aliasEnums.get(alias);
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }
}
