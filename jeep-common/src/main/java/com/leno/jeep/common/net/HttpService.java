package com.leno.jeep.common.net;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * <p>网络</p>
 *
 * @author: XianGuo
 * @date: 2018年04月22日
 */
public interface HttpService {

    @GET("http://www.500d.me/cvresume/{id}/")
    Call<String> webCrawler(@Path("id") Long id);

    @GET("https://raw.githubusercontent.com/LenoXian/common-data/master/city.json")
    Call<String> getCityInfo();

    @GET("https://raw.githubusercontent.com/LenoXian/common-data/master/province.json")
    Call<String> getProvinceInfo();
}
