package com.leno.jeep.dal.manager.impl;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.JeepCityDO;
import com.leno.jeep.dal.query.JeepCityQuery;
import com.leno.jeep.dal.mapper.jeep.ext.JeepCityExtMapper;
import com.leno.jeep.dal.manager.JeepCityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for JeepCity.
 */

@Component
public class JeepCityManagerImpl implements JeepCityManager{

    
    @Autowired
    protected JeepCityExtMapper jeepCityExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(JeepCityQuery query){
        return jeepCityExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(JeepCityQuery query){
        return jeepCityExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(JeepCityDO record){
        return jeepCityExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(JeepCityDO record){
        return jeepCityExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<JeepCityDO> selectByQuery(JeepCityQuery query){
        return jeepCityExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<JeepCityDO> selectByQueryWithPage(JeepCityQuery query) {
        PageResult<JeepCityDO> result = new PageResult<JeepCityDO>();
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
    public JeepCityDO selectByPrimaryKey(Long id){
        return jeepCityExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( JeepCityDO record,  JeepCityQuery query){
        return jeepCityExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( JeepCityDO record,  JeepCityQuery query){

        return jeepCityExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(JeepCityDO record){
        return jeepCityExtMapper.updateByPrimaryKeySelective(record);
    }
}