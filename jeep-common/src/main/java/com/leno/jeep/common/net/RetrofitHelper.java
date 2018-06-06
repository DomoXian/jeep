package com.leno.jeep.common.net;

import com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * <p>retrofit工具类</p>
 *
 * @author: XianGuo
 * @date: 2018年04月18日
 */
public class RetrofitHelper {


    private static final String DEFAULT_BASE_URL = "http://localhost:8080/";

    private static OkHttpClient okHttpClient;

    private static HashMap<String, Object> map = new HashMap<>();

    private static HashMap<String, Retrofit> retrofitMap = new HashMap<>();

    public static OkHttpClient getClient() {
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient
                    .Builder()
                    //超时设置
                    .connectTimeout(20, TimeUnit.SECONDS)
                    .readTimeout(20, TimeUnit.SECONDS)
                    .writeTimeout(20, TimeUnit.SECONDS)
                    .build();
        }
        return okHttpClient;
    }

    public static Retrofit getRetrofit(String baseUrl) {
        Retrofit retrofit = retrofitMap.get(baseUrl);
        if (retrofit == null) {
            retrofit = createRetrofit(baseUrl);
            retrofitMap.put(baseUrl, retrofit);
        }
        return retrofit;
    }

    private static Retrofit createRetrofit(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(StringConverterFactory.create())
                .addConverterFactory(new Retrofit2ConverterFactory())
                .client(getClient())
                .build();
    }

    /**
     * 解析service
     */
    @SuppressWarnings("unchecked")
    public static <T> T invoke(Class<T> tClass, String baseUrl) {

        String key = tClass.getName();
        if (map.containsKey(key)) {
            return (T) map.get(key);
        }
        T target = getRetrofit(baseUrl).create(tClass);
        map.put(key, target);
        return target;
    }

    /**
     * 解析service
     */
    @SuppressWarnings("unchecked")
    public static <T> T invoke(Class<T> tClass) {
        return invoke(tClass, DEFAULT_BASE_URL);
    }

    /**
     * 获取执行结果
     */
    public static <T> T getExecuteBody(Call<T> tCall) {
        if (tCall == null) {
            return null;
        }
        try {
            return tCall.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



}
