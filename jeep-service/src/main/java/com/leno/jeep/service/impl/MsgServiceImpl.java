package com.leno.jeep.service.impl;

import com.alibaba.fastjson.JSON;
import com.leno.jeep.common.base.Result;
import com.leno.jeep.dal.manager.CarMsgManager;
import com.leno.jeep.dal.manager.JeepUserManager;
import com.leno.jeep.dal.model.CarMsgDO;
import com.leno.jeep.dal.model.JeepUserDO;
import com.leno.jeep.dal.query.CarMsgQuery;
import com.leno.jeep.service.MsgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>消息服务实现</p>
 *
 * @author: XianGuo
 * @date: 2018年04月12日
 */
@Service
@Slf4j
public class MsgServiceImpl implements MsgService {

    @Autowired
    private CarMsgManager carMsgManager;


    @Autowired
    private JeepUserManager jeepUserManager;

    @Override
    public Result<List<CarMsgDO>> getCarMsgList() {
        Result<List<CarMsgDO>> result = new Result<>();
        CarMsgQuery query = new CarMsgQuery();
        query.setPageNo(1);
        query.setPageSize(20);
        result.setData(carMsgManager.selectByQuery(query));

        JeepUserDO userDO = jeepUserManager.selectByPrimaryKey(1L);
        log.info("user:{}", JSON.toJSONString(userDO));
        return result;
    }

}
