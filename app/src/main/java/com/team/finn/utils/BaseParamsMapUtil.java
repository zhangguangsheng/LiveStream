package com.team.finn.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p/>
 * <p/>
 * 日期：2016/2/25
 * <p/>
 * 描述信息：请求网络参数封装类
 * <p/>
 * 备注信息:
 */
public class BaseParamsMapUtil {

    /**
     * 公共的参数集合
     *
     * @return
     */
    public static Map<String, String> getParamsMap() {
        Map<String, String> paramsmap = new LinkedHashMap<>();
        paramsmap.put("client_sys", "android");
        paramsmap.put("aid", "android1");
        return paramsmap;
    }


}
