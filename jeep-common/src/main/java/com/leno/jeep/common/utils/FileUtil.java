package com.leno.jeep.common.utils;

import com.alibaba.fastjson.JSONObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p>文件工具类</p>
 *
 * @author: XianGuo
 * @date: 2018年05月07日
 */
public class FileUtil {


    /**
     * 读取文件
     */
    public static void copyFile(String oldFileName, String newFileName) {
        try {
            FileInputStream input = new FileInputStream(oldFileName);
            FileChannel inputChannel = input.getChannel();

            FileOutputStream output = new FileOutputStream(newFileName);
            FileChannel outChannel = output.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (inputChannel.read(buffer) != -1) {
                buffer.flip();
                outChannel.write(buffer);
                buffer.clear();
            }
            input.close();
            inputChannel.close();
            output.close();
            outChannel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成json字符串问价
     */
    public static <T> void JsonFile(T target, String fileName) {
        String json = JSONObject.toJSONString(target);
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
            writer.append(json);
            writer.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
