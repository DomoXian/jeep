package com.leno.jeep.dal.mapper.jeep;

import com.leno.jeep.dal.model.JeepProvinceDO;
import com.leno.jeep.dal.query.JeepProvinceQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for JeepProvince.
 */
 @Mapper
 @Repository
public interface JeepProvinceMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(JeepProvinceQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(JeepProvinceQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(JeepProvinceDO record);

    /**
     * insert selective.
     */
    int insertSelective(JeepProvinceDO record);

    /**
     * select by query condition.
     */
    List<JeepProvinceDO> selectByQuery(JeepProvinceQuery query);

    /**
     * select by primary key.
     */
    JeepProvinceDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") JeepProvinceDO record, @Param("query") JeepProvinceQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") JeepProvinceDO record, @Param("query") JeepProvinceQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(JeepProvinceDO record);
}