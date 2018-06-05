package com.leno.jeep.ao;

import com.leno.jeep.dal.model.JeepCityDO;
import com.leno.jeep.dal.model.JeepProvinceDO;

import java.util.List;

/**
 * <p>TODO</p>
 *
 * @author: XianGuo
 * @date: 2018年05月30日
 */
public interface AreaAO {

    /**
     * 获取身份信息
     */
    List<JeepProvinceDO> getProvince();

    /**
     * 获取城市信息
     */
    List<JeepCityDO> getCity();
}
