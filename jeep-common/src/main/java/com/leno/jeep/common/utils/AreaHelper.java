package com.leno.jeep.common.utils;

import com.leno.jeep.common.net.HttpService;
import com.leno.jeep.common.net.RetrofitHelper;
import lombok.Data;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>地区工具类</p>
 *
 * @author: XianGuo
 * @date: 2018年05月30日
 */
public class AreaHelper {


    /**
     * 根据省份名查询省份数据
     */
    public static ProvinceItem getProvince(String provinceName) {
        return InnerHolder.getSingleton().getProvinceByName(provinceName);
    }

    /**
     * 根据省份名查询省份数据
     */
    public static CityItem getCity(String cityName) {
        return InnerHolder.getSingleton().getCityByName(cityName);
    }


    static class InnerHolder {


        private static volatile InnerHolder holder;

        // 城市信息
        private HashMap<Integer, CityItem> cityMap = null;
        private SoftReference<HashMap<Integer, CityItem>> citySoftRef = new SoftReference<>(cityMap);

        // 省份信息
        private HashMap<Integer, ProvinceItem> provinceMap = null;
        private SoftReference<HashMap<Integer, ProvinceItem>> provinceSoftRef = new SoftReference<>(provinceMap);

        public static InnerHolder getSingleton() {

            if (holder == null) {
                synchronized (InnerHolder.class) {
                    if (holder == null) {
                        holder = new InnerHolder();
                    }
                }
            }
            return holder;
        }

        /**
         * 获取城市信息
         */
        public HashMap<Integer, CityItem> getCityMap() {
            if (citySoftRef.get() == null) {
                HttpService service = RetrofitHelper.invoke(HttpService.class);
                List<CityItem> cityItemList = RetrofitHelper.getExecuteBody(service.getCityInfo());
                if (cityItemList != null && cityItemList.size() != 0) {
                    cityMap = new HashMap<>(cityItemList.size());
                    for (CityItem item : cityItemList) {
                        cityMap.put(item.getCityId(), item);
                    }
                }
                citySoftRef = new SoftReference<>(cityMap);
            }

            return cityMap;
        }

        /**
         * 获取省份信息
         */
        public HashMap<Integer, ProvinceItem> getProvinceMap() {
            if (provinceSoftRef.get() == null) {
                HttpService service = RetrofitHelper.invoke(HttpService.class);
                List<ProvinceItem> provinceItemList = RetrofitHelper.getExecuteBody(service.getProvinceInfo());
                if (provinceItemList != null && provinceItemList.size() != 0) {
                    provinceMap = new HashMap<>(provinceItemList.size());
                    for (ProvinceItem item : provinceItemList) {
                        provinceMap.put(item.getProvinceId(), item);
                    }
                }
                provinceSoftRef = new SoftReference<>(provinceMap);
            }

            return provinceMap;
        }


        /**
         * 根据城市名获取城市信息
         */
        private CityItem getCityByName(String cityName) {
            HashMap<Integer, CityItem> cityMap = getCityMap();
            for (Map.Entry<Integer, CityItem> item : cityMap.entrySet()) {
                if (item.getValue().getCityName().contains(cityName)) {
                    return item.getValue();
                }
            }
            return null;
        }


        /**
         * 根据城市名获取省份信息
         */
        private ProvinceItem getProvinceByName(String provinceName) {
            HashMap<Integer, ProvinceItem> provinceMap = getProvinceMap();
            for (Map.Entry<Integer, ProvinceItem> item : provinceMap.entrySet()) {
                if (item.getValue().getProvinceName().contains(provinceName)) {
                    return item.getValue();
                }
            }
            return null;
        }

    }


    /**
     * 省份信息
     */
    @Data
    public static class CityItem {
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
    public static class ProvinceItem {

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
