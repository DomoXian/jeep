package com.leno.jeep.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CarMsgDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * car_msg.msg_id
     */
    private Long msgId;

    /**
     * 
     * car_msg.content
     */
    private String content;

    /**
     * 微信昵称
     * car_msg.nick_name
     */
    private String nickName;

    /**
     * 车系名
     * car_msg.series_name
     */
    private String seriesName;

    /**
     * 这条消息提取出来的联系方式
     * car_msg.cell_phone_num
     */
    private String cellPhoneNum;

    /**
     * 是否删除 0 为删除 1删除
     * car_msg.is_delete
     */
    private Integer isDelete;

    /**
     * 创建时间
     * car_msg.gmt_create
     */
    private Date gmtCreate;

    /**
     * 修改时间
     * car_msg.gmt_modified
     */
    private Date gmtModified;

}