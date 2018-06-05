package com.leno.jeep.dal.manager.impl;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.JeepProvinceDO;
import com.leno.jeep.dal.query.JeepProvinceQuery;
import com.leno.jeep.dal.mapper.jeep.ext.JeepProvinceExtMapper;
import com.leno.jeep.dal.manager.JeepProvinceManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for JeepProvince.
 */

@Component
public class JeepProvinceManagerImpl implements JeepProvinceManager{

    
    @Autowired
    protected JeepProvinceExtMapper jeepProvinceExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(JeepProvinceQuery query){
        return jeepProvinceExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(JeepProvinceQuery query){
        return jeepProvinceExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(JeepProvinceDO record){
        return jeepProvinceExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(JeepProvinceDO record){
        return jeepProvinceExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<JeepProvinceDO> selectByQuery(JeepProvinceQuery query){
        return jeepProvinceExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<JeepProvinceDO> selectByQueryWithPage(JeepProvinceQuery query) {
        PageResult<JeepProvinceDO> result = new PageResult<JeepProvinceDO>();
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
    public JeepProvinceDO selectByPrimaryKey(Long id){
        return jeepProvinceExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( JeepProvinceDO record,  JeepProvinceQuery query){
        return jeepProvinceExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( JeepProvinceDO record,  JeepProvinceQuery query){

        return jeepProvinceExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(JeepProvinceDO record){
        return jeepProvinceExtMapper.updateByPrimaryKeySelective(record);
    }
}