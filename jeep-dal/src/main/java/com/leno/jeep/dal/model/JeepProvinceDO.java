package com.leno.jeep.dal.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class JeepProvinceDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * jeep_province.province_id
     */
    private Long provinceId;

    /**
     * 
     * jeep_province.province_name
     */
    private String provinceName;

    /**
     * 省份简称，不是单字的简称，类似于“新疆”
     * jeep_province.province_short_name
     */
    private String provinceShortName;

    /**
     * 
     * jeep_province.province_sort
     */
    private Integer provinceSort;

    /**
     * 索引字母
     * jeep_province.province_index
     */
    private String provinceIndex;

    /**
     * 
     * jeep_province.remarks
     */
    private String remarks;

    /**
     *
     * jeep_province.status
     */
    @JSONField(serialize = false)
    private Integer status;

    /**
     *
     * jeep_province.gmt_create
     */
    @JSONField(serialize = false)
    private Date gmtCreate;

    /**
     *
     * jeep_province.gmt_modified
     */
    @JSONField(serialize = false)
    private Date gmtModified;

}