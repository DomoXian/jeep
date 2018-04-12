package com.leno.jeep.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class JeepUserDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * jeep_user.user_id
     */
    private Long userId;

    /**
     * 用户姓名
     * jeep_user.user_name
     */
    private String userName;

    /**
     * 
     * jeep_user.user_age
     */
    private Integer userAge;

    /**
     * 用户姓名 0 男 1 女 2 人妖
     * jeep_user.user_sex
     */
    private Boolean userSex;

    /**
     * 
     * jeep_user.gmt_create
     */
    private Date gmtCreate;

    /**
     * 
     * jeep_user.gmt_modified
     */
    private Date gmtModified;

}