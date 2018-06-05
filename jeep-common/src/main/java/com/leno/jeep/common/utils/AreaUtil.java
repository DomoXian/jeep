package com.leno.jeep.common.utils;

import lombok.Data;

/**
 * <p>地区工具类</p>
 *
 * @author: XianGuo
 * @date: 2018年05月30日
 */
public class AreaUtil {


    /**
     * 省份信息
     */
    @Data
    private static class CityItem {
        /**
         * 城市id
         */
        private Integer cityId;

        /**
         * 城市名
         */
        private String cityName;

        /**
         * 城市简称
         */
        private String cityShortName;

        /**
         * 排名
         */
        private Integer citySort;

        /**
         * 省份id
         */
        private Integer provId;

        /**
         * 城市前缀
         */
        private String cityIndex;

        /**
         * 经度
         */
        private java.math.BigDecimal longitude;

        /**
         * 纬度
         */
        private java.math.BigDecimal latitude;
    }


    /**
     * 省份
     */
    @Data
    private static class ProvinceItem {

        /**
         * id
         */
        private Integer provinceId;

        /**
         * 省份名称
         */
        private String provinceName;

        /**
         * 省份简称，不是单字的简称，类似于“新疆”
         */
        private String provinceShortName;

        /**
         * 身份缩写
         */
        private Integer provinceSort;

        /**
         * 索引字母
         */
        private String provinceIndex;

        /**
         * 备注
         */
        private String remarks;

    }
}
