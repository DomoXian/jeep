package com.leno.jeep.dal.manager;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.FiveResumeDO;
import com.leno.jeep.dal.query.FiveResumeQuery;

import java.util.List;


/**
 * Manager for FiveResume.
 */
public interface FiveResumeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(FiveResumeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(FiveResumeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(FiveResumeDO record);

    /**
     * insert selective.
     */
    long insertSelective(FiveResumeDO record);

    /**
     * select by query condition.
     */
    List<FiveResumeDO> selectByQuery(FiveResumeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<FiveResumeDO> selectByQueryWithPage(FiveResumeQuery query);

    /**
     * select by primary key.
     */
    FiveResumeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective( FiveResumeDO record,  FiveResumeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(FiveResumeDO record, FiveResumeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(FiveResumeDO record);
}