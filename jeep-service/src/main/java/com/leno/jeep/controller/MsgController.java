package com.leno.jeep.controller;

import com.leno.jeep.common.base.Result;
import com.leno.jeep.service.MsgService;
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

    @GetMapping("/getMsgList.json")
    public Result getMsgList(){
        return msgService.getCarMsgList();
    }

}
