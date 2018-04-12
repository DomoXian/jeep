package com.leno.jeep.dal.mapper.moyu;

import com.leno.jeep.dal.model.CarMsgDO;
import com.leno.jeep.dal.query.CarMsgQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for CarMsg.
 */
 @Mapper
 @Repository
public interface CarMsgMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(CarMsgQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(CarMsgQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarMsgDO record);

    /**
     * insert selective.
     */
    int insertSelective(CarMsgDO record);

    /**
     * select by query condition.
     */
    List<CarMsgDO> selectByQuery(CarMsgQuery query);

    /**
     * select by primary key.
     */
    CarMsgDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") CarMsgDO record, @Param("query") CarMsgQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") CarMsgDO record, @Param("query") CarMsgQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarMsgDO record);
}