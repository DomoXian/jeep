package com.leno.jeep.service;

import com.leno.jeep.common.Result;
import com.leno.jeep.dal.model.CarMsgDO;

import java.util.List;

/**
 * <p>测试</p>
 *
 * @author: XianGuo
 * @date: 2018年04月12日
 */
public interface MsgService {


    Result<List<CarMsgDO>> getCarMsgList();
}
