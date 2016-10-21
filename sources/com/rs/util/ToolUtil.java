package com.rs.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 */
public class ToolUtil {
    /**
     * 取得系统日期带横线
     *
     * @return
     */
    public static String getDateDash() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    /**
     * 取得系统日期
     *
     * @return
     */
    public static String getDate() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    /**
     * 取得系统时间
     *
     * @return
     */
    public static String getTime() {
        return new SimpleDateFormat("HHmmss").format(new Date());
    }

    /**
     * 取得系统时间带冒号
     *
     * @return
     */
    public static String getTimeColon() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    /**
     * 取得系统时间包含毫秒
     *
     * @return
     */
    public static String getTimeMsec() {
        return new SimpleDateFormat("HHmmssSSS").format(new Date());
    }

    /**
     * 取得系统日期和时间
     *
     * @return
     */
    public static String getDateTime() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }

    /**
     * 取得系统日期和时间包含横线和冒号
     *
     * @return
     */
    public static String getDateTimeDashColon() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    /**
     * 取得系统日期和时间包含毫秒
     *
     * @return
     */
    public static String getDateTimeMsec() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
    }
}
