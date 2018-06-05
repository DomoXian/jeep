package com.leno.jeep.common.utils;

import java.io.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>同步数据上一次位置</p>
 *
 * @author: XianGuo
 * @date: 2018年04月13日
 */
public class LastValueHelper {

    private static String DIR_PATH = "/opt/dwj/lastValue/";

    private static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>(3);


    /**
     * 根据key 获取上一次同步的值
     */
    public static String getLastValue(String key) {
        String value = map.get(key);

        if (value == null || value.trim().length() == 0) {
            File file = new File(DIR_PATH + key + ".json");
            FileInputStream fis = null;
            InputStreamReader reader = null;
            try {
                fis = new FileInputStream(file);
                reader = new InputStreamReader(fis, "UTF-8");
                StringBuilder sb = new StringBuilder();
                while (reader.ready()) {
                    char c = (char) reader.read();
                    sb.append(c);
                }
                value = sb.toString();
            } catch (Exception e) {
                System.out.println("正则初始化文件...位置"+file.getPath());
                setLastValue(key,"");
            } finally {

                try {
                    if (reader != null) {
                        reader.close();
                    }
                    if (fis != null) {
                        fis.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        if(value!=null){
           value =  value.replaceAll(" ","").replaceAll("\n","");
        }

        return value;

    }

    /**
     * 写lastValue
     */
    public static void setLastValue(String key, String lastValue) {
        map.put(key,lastValue);
        File file = new File(DIR_PATH + key + ".json");
        File partnerFile = file.getParentFile();
        // 创建文件夹
        if (!partnerFile.exists()) {
            if (!partnerFile.mkdirs()) {
                System.err.println("创建文件夹失败！请使用chown设置/opt文件的权限");
                return;
            }
        }
        FileOutputStream fop = null;
        OutputStreamWriter writer = null;
        try {
            fop = new FileOutputStream(file);
            writer = new OutputStreamWriter(fop, "UTF-8");
            writer.append(lastValue);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



}
