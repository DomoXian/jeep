package com.leno.jeep.dal.manager;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.CarMsgDO;
import com.leno.jeep.dal.query.CarMsgQuery;

import java.util.List;


/**
 * Manager for CarMsg.
 */
public interface CarMsgManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CarMsgQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(CarMsgQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarMsgDO record);

    /**
     * insert selective.
     */
    long insertSelective(CarMsgDO record);

    /**
     * select by query condition.
     */
    List<CarMsgDO> selectByQuery(CarMsgQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CarMsgDO> selectByQueryWithPage(CarMsgQuery query);

    /**
     * select by primary key.
     */
    CarMsgDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective( CarMsgDO record,  CarMsgQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(CarMsgDO record, CarMsgQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarMsgDO record);
}