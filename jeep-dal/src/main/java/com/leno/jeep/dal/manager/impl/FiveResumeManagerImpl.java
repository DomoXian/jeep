package com.leno.jeep.dal.manager.impl;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.FiveResumeDO;
import com.leno.jeep.dal.query.FiveResumeQuery;
import com.leno.jeep.dal.mapper.jeep.ext.FiveResumeExtMapper;
import com.leno.jeep.dal.manager.FiveResumeManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for FiveResume.
 */

@Component
public class FiveResumeManagerImpl implements FiveResumeManager{

    
    @Autowired
    protected FiveResumeExtMapper fiveResumeExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(FiveResumeQuery query){
        return fiveResumeExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(FiveResumeQuery query){
        return fiveResumeExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(FiveResumeDO record){
        return fiveResumeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(FiveResumeDO record){
        return fiveResumeExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<FiveResumeDO> selectByQuery(FiveResumeQuery query){
        return fiveResumeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<FiveResumeDO> selectByQueryWithPage(FiveResumeQuery query) {
        PageResult<FiveResumeDO> result = new PageResult<FiveResumeDO>();
        result.setPageSize(query.getPageSize());
        result.setPageNo(query.getPageNo());
        result.setTotalCount(this.countByQuery(query));
        result.setResult(this.selectByQuery(query));
        return result;
    }

    /**
     * select by primary key.
     */
    @Override
    public FiveResumeDO selectByPrimaryKey(Long id){
        return fiveResumeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( FiveResumeDO record,  FiveResumeQuery query){
        return fiveResumeExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( FiveResumeDO record,  FiveResumeQuery query){

        return fiveResumeExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(FiveResumeDO record){
        return fiveResumeExtMapper.updateByPrimaryKeySelective(record);
    }
}