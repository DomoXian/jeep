package com.leno.jeep.simple.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * <p>短url工具</p>
 *
 */
public class Codec {

    private HashMap<String, String> map = new HashMap<>();


    /**
     * 加密
     */
    public String encode(String longUrl) {
        for (HashMap.Entry<String, String> item : map.entrySet()) {
            if (item.getValue().equals(longUrl)) {
                return item.getKey();
            }
        }
        String shortUrl = "";
        while (map.get(shortUrl) != null) {
            shortUrl = getShortRandomUrl();
        }
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    /**
     * 解密
     */
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    /**
     * 随机url
     */
    public String getShortRandomUrl() {

        // 26个大写字母和10个数字
        String randomStr = "http://tinyurl.com/";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int tempI = random.nextInt(36);
            if (tempI < 10) {
                randomStr = randomStr + tempI;
            } else {
                char tempC = (char) ('A' + tempI - 10);
                randomStr = randomStr + tempC;
            }
        }
        return randomStr;
    }

    /**
     * 随机url
     */
    public String getLongRandomUrl() {

        // 26个大写字母和10个数字
        String randomStr = "https://leetcode.com/problems/design-tinyurl/";
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int tempI = random.nextInt(36);
            if (tempI < 10) {
                randomStr = randomStr + tempI;
            } else {
                char tempC = (char) ('A' + tempI - 10);
                randomStr = randomStr + tempC;
            }
        }
        return randomStr;
    }

    public static void main(String[] args) {
        Codec demo = new Codec();
        List<String> urlList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            urlList.add(demo.getLongRandomUrl());
        }

        for (String item : urlList) {
            System.out.println("原来的长链接：" + item);
            String shortUrl = demo.encode(item);
            System.out.println("短url：" + shortUrl);

            String longUrl = demo.decode(shortUrl);
            System.out.println("解码url：" + longUrl);


            System.out.println("=======================");
        }


    }

}
