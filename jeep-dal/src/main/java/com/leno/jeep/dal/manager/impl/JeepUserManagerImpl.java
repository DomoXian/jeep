package com.leno.jeep.dal.manager.impl;

import com.leno.jeep.dal.common.PageResult;
import com.leno.jeep.dal.model.JeepUserDO;
import com.leno.jeep.dal.query.JeepUserQuery;
import com.leno.jeep.dal.mapper.jeep.ext.JeepUserExtMapper;
import com.leno.jeep.dal.manager.JeepUserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for JeepUser.
 */

@Component
public class JeepUserManagerImpl implements JeepUserManager{

    
    @Autowired
    protected JeepUserExtMapper jeepUserExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(JeepUserQuery query){
        return jeepUserExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(JeepUserQuery query){
        return jeepUserExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(JeepUserDO record){
        return jeepUserExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(JeepUserDO record){
        return jeepUserExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<JeepUserDO> selectByQuery(JeepUserQuery query){
        return jeepUserExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<JeepUserDO> selectByQueryWithPage(JeepUserQuery query) {
        PageResult<JeepUserDO> result = new PageResult<JeepUserDO>();
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
    public JeepUserDO selectByPrimaryKey(Long id){
        return jeepUserExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( JeepUserDO record,  JeepUserQuery query){
        return jeepUserExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( JeepUserDO record,  JeepUserQuery query){

        return jeepUserExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(JeepUserDO record){
        return jeepUserExtMapper.updateByPrimaryKeySelective(record);
    }
}