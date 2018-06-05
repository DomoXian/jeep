package com.leno.jeep.dal.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class JeepCityDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * jeep_city.city_id
     */
    private Long cityId;

    /**
     * 
     * jeep_city.city_name
     */
    private String cityName;

    /**
     * 城市简称
     * jeep_city.city_short_name
     */
    private String cityShortName;

    /**
     * 
     * jeep_city.city_sort
     */
    private Integer citySort;

    /**
     * 
     * jeep_city.prov_id
     */
    private Long provId;

    /**
     * 
     * jeep_city.city_index
     */
    private String cityIndex;

    /**
     *
     * jeep_city.status
     */
    @JSONField(serialize = false)
    private Integer status;

    /**
     *
     * jeep_city.gmt_create
     */
    @JSONField(serialize = false)
    private Date gmtCreate;

    /**
     *
     * jeep_city.gmt_modified
     */
    @JSONField(serialize = false)
    private Date gmtModified;

    /**
     * 经度
     * jeep_city.longitude
     */
    private java.math.BigDecimal longitude;

    /**
     * 纬度
     * jeep_city.latitude
     */
    private java.math.BigDecimal latitude;

}