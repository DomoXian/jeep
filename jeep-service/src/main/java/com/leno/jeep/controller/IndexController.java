package com.leno.jeep.controller;

import com.leno.jeep.common.Result;
import com.leno.jeep.elastic.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>索引控制器</p>
 *
 * @author: XianGuo
 * @date: 2018年05月02日
 */
@RestController
@RequestMapping("/index")
public class IndexController {


    @Autowired
    private IndexService indexService;

    /**
     * 创建索引
     */
    @GetMapping("createIndex.json")
    public Result createIndex(@RequestParam String indexName){
        return indexService.createIndex(indexName);
    }

    /**
     * 同步索引数据
     */
    @GetMapping("syncIndexData.json")
    public Result syncIndexData(@RequestParam String indexName){
        return indexService.syncIndexData(indexName);
    }
}
