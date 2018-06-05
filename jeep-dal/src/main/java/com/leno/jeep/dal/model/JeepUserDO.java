package com.leno.jeep.dal.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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
    private Integer userSex;

    /**
     * 头发
     * jeep_user.user_hair
     */
    private String userHair;

    /**
     * 脸型
     * jeep_user.user_face
     */
    private String userFace;

    /**
     * 腿
     * jeep_user.user_leg
     */
    private String userLeg;

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