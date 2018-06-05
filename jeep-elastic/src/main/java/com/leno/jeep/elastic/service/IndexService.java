package com.leno.jeep.elastic.service;

import com.leno.jeep.common.Result;

/**
 * <p>创建索引</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
public interface IndexService {

    /**
     * 创建索引
     */
    Result createIndex(String indexName);

    Result syncIndexData(String indexName);
}
