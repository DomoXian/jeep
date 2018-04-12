package com.leno.jeep.dal.mapper.jeep;

import com.leno.jeep.dal.model.JeepUserDO;
import com.leno.jeep.dal.query.JeepUserQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for JeepUser.
 */
 @Mapper
 @Repository
public interface JeepUserMapper {
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
    int insertSelective(JeepUserDO record);

    /**
     * select by query condition.
     */
    List<JeepUserDO> selectByQuery(JeepUserQuery query);

    /**
     * select by primary key.
     */
    JeepUserDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") JeepUserDO record, @Param("query") JeepUserQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") JeepUserDO record, @Param("query") JeepUserQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(JeepUserDO record);
}