package com.leno.jeep.dal.manager;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.JeepCityDO;
import com.leno.jeep.dal.query.JeepCityQuery;

import java.util.List;


/**
 * Manager for JeepCity.
 */
public interface JeepCityManager {
    /**
     * query count by query condition.
     */
    int countByQuery(JeepCityQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(JeepCityQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(JeepCityDO record);

    /**
     * insert selective.
     */
    long insertSelective(JeepCityDO record);

    /**
     * select by query condition.
     */
    List<JeepCityDO> selectByQuery(JeepCityQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<JeepCityDO> selectByQueryWithPage(JeepCityQuery query);

    /**
     * select by primary key.
     */
    JeepCityDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective( JeepCityDO record,  JeepCityQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(JeepCityDO record, JeepCityQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(JeepCityDO record);
}