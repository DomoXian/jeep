package com.leno.jeep.dal.mapper.jeep;

import com.leno.jeep.dal.model.JeepCityDO;
import com.leno.jeep.dal.query.JeepCityQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for JeepCity.
 */
 @Mapper
 @Repository
public interface JeepCityMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(JeepCityQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(JeepCityQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(JeepCityDO record);

    /**
     * insert selective.
     */
    int insertSelective(JeepCityDO record);

    /**
     * select by query condition.
     */
    List<JeepCityDO> selectByQuery(JeepCityQuery query);

    /**
     * select by primary key.
     */
    JeepCityDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") JeepCityDO record, @Param("query") JeepCityQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") JeepCityDO record, @Param("query") JeepCityQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(JeepCityDO record);
}