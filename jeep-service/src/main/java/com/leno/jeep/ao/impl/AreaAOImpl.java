package com.leno.jeep.ao.impl;

import com.leno.jeep.ao.AreaAO;
import com.leno.jeep.dal.manager.JeepCityManager;
import com.leno.jeep.dal.manager.JeepProvinceManager;
import com.leno.jeep.dal.model.JeepCityDO;
import com.leno.jeep.dal.model.JeepProvinceDO;
import com.leno.jeep.dal.query.JeepCityQuery;
import com.leno.jeep.dal.query.JeepProvinceQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>地区</p>
 *
 * @author: XianGuo
 * @date: 2018年05月30日
 */
@Service
public class AreaAOImpl implements AreaAO{

    @Autowired
    private JeepProvinceManager jeepProvinceManager;

    @Autowired
    private JeepCityManager jeepCityManager;

    @Override
    public List<JeepProvinceDO> getProvince() {
        return jeepProvinceManager.selectByQuery(new JeepProvinceQuery());
    }

    @Override
    public List<JeepCityDO> getCity() {
        return jeepCityManager.selectByQuery(new JeepCityQuery());
    }
}
