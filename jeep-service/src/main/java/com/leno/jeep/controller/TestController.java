package com.leno.jeep.controller;

import com.leno.jeep.common.Result;
import com.leno.jeep.common.utils.AreaHelper;
import com.leno.jeep.common.utils.ConstantUtil;
import com.leno.jeep.common.utils.ThreadPoolHelper;
import com.leno.jeep.dal.manager.JeepUserManager;
import com.leno.jeep.dal.model.JeepUserDO;
import com.leno.jeep.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>测试</p>
 *
 * @author: XianGuo
 * @date: 2018年04月26日
 */
@RestController
public class TestController {

    @GetMapping("/getGc")
    public Object getGc() {
        List<String> array = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            array.add("测试数据" + i);
        }
        return "测试回收数据";
    }


    @Autowired
    private JeepUserManager userManager;

    @GetMapping("/init")
    public Result init() {
        ThreadPoolHelper.getTaskExecutor().execute(() -> {
            for (int i = 0; i < 10000; i++) {
                JeepUserDO userDO = new JeepUserDO();
                userDO.setUserName(ConstantUtil.getRandomName());
                userDO.setUserHair(ConstantUtil.getRandomHair());
                if (i % 6 == 0) {
                    userDO.setUserFace("小脸");
                }
                if (i % 5 == 0) {
                    userDO.setUserFace("方脸");
                }
                if (i % 4 == 0) {
                    userDO.setUserFace("胖脸");
                }
                if (i % 3 == 0) {
                    userDO.setUserFace("圆脸");
                }
                if (i % 2 == 0) {
                    userDO.setUserFace("瓜子脸");
                } else {
                    userDO.setUserFace("大众脸");
                }

                userDO.setUserAge(i % 100);
                userDO.setUserSex(i % 2);
                userDO.setUserLeg(i % 2 == 0 ? "大长腿" : "小短腿");
                userManager.insertSelective(userDO);
            }
        });
        return Result.getSuccessResult("添加数据成功");
    }


    @Autowired
    private TestService testService;

    @GetMapping("testThread")
    public Result testThread() {

        for (int i = 0; i < 10000; i++) {
            testService.async(i);
        }
        return Result.getSuccessResult("初始化");
    }

    @GetMapping("/test")
    public Result test(String name,String age){
        return Result.getSuccessResult(name+age);
    }

    @GetMapping("/getCity")
    public Result getCity(String name){
        return Result.getSuccessResult(AreaHelper.getCity(name));
    }

    @GetMapping("/getProvince")
    public Result getProvince(String name){
        return Result.getSuccessResult(AreaHelper.getProvince(name));
    }
}
