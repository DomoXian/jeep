package com.leno.jeep.common.utils;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>资源工具类</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
public class ResourceUtil {


    /**
     * 从资源读取流
     */
    public static InputStream getSystemResourceAsStream(String resourcePath) {
        return ClassLoader.getSystemResourceAsStream(resourcePath);
    }

    /**
     * 读取字符串
     */
    public static String getSystemResourceAsString(String resourcePath) {
        InputStream inputStream = getSystemResourceAsStream(resourcePath);
        if (inputStream == null) {
            return null;
        }
        try {
            String s = JSON.parseObject(inputStream, String.class);
            inputStream.close();
            return s;
        } catch (IOException e) {
            System.err.println("读取字符串异常");
            e.printStackTrace();
        }
        return null;
    }
}
