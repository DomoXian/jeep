package com.leno.jeep.dal.manager.impl;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.CarMsgDO;
import com.leno.jeep.dal.query.CarMsgQuery;
import com.leno.jeep.dal.mapper.moyu.ext.CarMsgExtMapper;
import com.leno.jeep.dal.manager.CarMsgManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for CarMsg.
 */

@Component
public class CarMsgManagerImpl implements CarMsgManager{

    
    @Autowired
    protected CarMsgExtMapper carMsgExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CarMsgQuery query){
        return carMsgExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(CarMsgQuery query){
        return carMsgExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CarMsgDO record){
        return carMsgExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CarMsgDO record){
        return carMsgExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CarMsgDO> selectByQuery(CarMsgQuery query){
        return carMsgExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CarMsgDO> selectByQueryWithPage(CarMsgQuery query) {
        PageResult<CarMsgDO> result = new PageResult<CarMsgDO>();
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
    public CarMsgDO selectByPrimaryKey(Long id){
        return carMsgExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( CarMsgDO record,  CarMsgQuery query){
        return carMsgExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( CarMsgDO record,  CarMsgQuery query){

        return carMsgExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CarMsgDO record){
        return carMsgExtMapper.updateByPrimaryKeySelective(record);
    }
}