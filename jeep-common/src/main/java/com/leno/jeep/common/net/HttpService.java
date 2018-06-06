package com.leno.jeep.common.net;


import com.leno.jeep.common.utils.AreaHelper;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

/**
 * <p>网络</p>
 *
 * @author: XianGuo
 * @date: 2018年04月22日
 */
public interface HttpService {

    /**
     * 城市信息
     */
    @GET("https://raw.githubusercontent.com/DomoXian/common-data/master/city.json")
    Call<List<AreaHelper.CityItem>> getCityInfo();

    /**
     * 省份信息
     */
    @GET("https://raw.githubusercontent.com/DomoXian/common-data/master/province.json")
    Call<List<AreaHelper.ProvinceItem>> getProvinceInfo();
}
