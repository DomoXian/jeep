package com.leno.jeep.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UserDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * user.user_id
     */
    private Integer userId;

    /**
     * 用户姓名
     * user.user_name
     */
    private String userName;

}