package com.leno.jeep.dal.mapper.jeep.ext;

import com.leno.jeep.dal.mapper.jeep.JeepUserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for JeepUser.
 */

@Mapper
@Repository
public interface JeepUserExtMapper extends JeepUserMapper {

}