package com.leno.jeep.dal.mapper.moyu.ext;

import com.leno.jeep.dal.mapper.moyu.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for User.
 */

@Mapper
@Repository
public interface UserExtMapper extends UserMapper {

}