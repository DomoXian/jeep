package com.leno.jeep.elastic.net;

import retrofit2.Call;
import retrofit2.http.PUT;
import retrofit2.http.Url;

/**
 * <p>搜索相关http服务</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
public interface EsHttpService {

    /**
     * 创建索引
     */
    @PUT
    Call<String> createIndex(@Url String indexName, Object body);
}
