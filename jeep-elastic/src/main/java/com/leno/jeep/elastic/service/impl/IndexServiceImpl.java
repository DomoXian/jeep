package com.leno.jeep.elastic.service.impl;

import com.leno.jeep.common.Result;
import com.leno.jeep.common.enums.RestCodeEnum;
import com.leno.jeep.common.utils.ResourceUtil;
import com.leno.jeep.elastic.service.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.admin.indices.alias.Alias;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;


/**
 * <p>索引相关服务</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
@Service
@Slf4j
public class IndexServiceImpl implements IndexService {


    @Autowired
    private RestHighLevelClient client;

    @Override
    public Result createIndex(String indexName) {
        log.info("创建索引，索引别名：{}",indexName);
        // 读取配置文件
        String realIndexName = indexName + System.currentTimeMillis();
        CreateIndexRequest request = new CreateIndexRequest(realIndexName);
        request.alias(new Alias(indexName));
        String sourcePath = "index/" + indexName + "_mapping.json";
        String source = ResourceUtil.getSystemResourceAsString(sourcePath);
        if (source == null) {
            return Result.getFailResult(RestCodeEnum.FAIL.getCode(), "没有配置mapping.json文件");
        }
        request.source(source, XContentType.JSON);
        try {
            client.indices().create(request);
            return Result.getSuccessResult(realIndexName);
        } catch (IOException e) {
            e.printStackTrace();
            log.error("创建索引失败", e);
        }

        return Result.getFailResult(RestCodeEnum.FAIL.getCode(),"创建索引失败");
    }

    @Override
    public Result syncIndexData(String indexName){

        BulkRequest request = new BulkRequest();
        client.bulkAsync(request, new ActionListener<BulkResponse>() {
            @Override
            public void onResponse(BulkResponse bulkItemResponses) {
                log.info("输入成功：");
            }

            @Override
            public void onFailure(Exception e) {
                log.error("同步失败：{}",e);
            }
        });
        return null;
    }
}
