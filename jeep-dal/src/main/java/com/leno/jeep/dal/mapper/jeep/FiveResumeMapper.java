package com.leno.jeep.dal.mapper.jeep;

import com.leno.jeep.dal.model.FiveResumeDO;
import com.leno.jeep.dal.query.FiveResumeQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for FiveResume.
 */
 @Mapper
 @Repository
public interface FiveResumeMapper {
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
    int insertSelective(FiveResumeDO record);

    /**
     * select by query condition.
     */
    List<FiveResumeDO> selectByQuery(FiveResumeQuery query);

    /**
     * select by primary key.
     */
    FiveResumeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") FiveResumeDO record, @Param("query") FiveResumeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") FiveResumeDO record, @Param("query") FiveResumeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(FiveResumeDO record);
}