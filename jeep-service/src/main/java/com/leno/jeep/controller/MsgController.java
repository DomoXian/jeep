package com.leno.jeep.controller;

import com.leno.jeep.common.Result;
import com.leno.jeep.service.MsgService;
import com.leno.jeep.service.WebCrawlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>测试响应式</p>
 *
 * @author: XianGuo
 * @date: 2018年03月28日
 */
@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    private MsgService msgService;

    @Autowired
    private WebCrawlService webCrawlService;

    @GetMapping("/getMsgList.json")
    public Result getMsgList() {
        return msgService.getCarMsgList();
    }

    @GetMapping("/getCrawlResume.json")
    public Result getCrawlList() {
        new Thread(() -> webCrawlService.webCrawlResumeList()).start();
        return Result.getSuccessResult("成功");
    }



}
