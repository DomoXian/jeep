package com.leno.jeep.dal.manager;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.JeepProvinceDO;
import com.leno.jeep.dal.query.JeepProvinceQuery;

import java.util.List;


/**
 * Manager for JeepProvince.
 */
public interface JeepProvinceManager {
    /**
     * query count by query condition.
     */
    int countByQuery(JeepProvinceQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(JeepProvinceQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(JeepProvinceDO record);

    /**
     * insert selective.
     */
    long insertSelective(JeepProvinceDO record);

    /**
     * select by query condition.
     */
    List<JeepProvinceDO> selectByQuery(JeepProvinceQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<JeepProvinceDO> selectByQueryWithPage(JeepProvinceQuery query);

    /**
     * select by primary key.
     */
    JeepProvinceDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective( JeepProvinceDO record,  JeepProvinceQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(JeepProvinceDO record, JeepProvinceQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(JeepProvinceDO record);
}