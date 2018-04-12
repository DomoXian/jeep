package com.leno.jeep.dal.manager;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.JeepUserDO;
import com.leno.jeep.dal.query.JeepUserQuery;

import java.util.List;


/**
 * Manager for JeepUser.
 */
public interface JeepUserManager {
    /**
     * query count by query condition.
     */
    int countByQuery(JeepUserQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(JeepUserQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(JeepUserDO record);

    /**
     * insert selective.
     */
    long insertSelective(JeepUserDO record);

    /**
     * select by query condition.
     */
    List<JeepUserDO> selectByQuery(JeepUserQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<JeepUserDO> selectByQueryWithPage(JeepUserQuery query);

    /**
     * select by primary key.
     */
    JeepUserDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective( JeepUserDO record,  JeepUserQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(JeepUserDO record, JeepUserQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(JeepUserDO record);
}