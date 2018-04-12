package com.leno.jeep.common.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.leno.jeep.common.RestCodeEnum;
import lombok.Data;

/**
 * 用于包装API的返回数据
 *
 * @author xianguo
 */
@Data
public class Result<T> {

    private int code = RestCodeEnum.SUCCESS.getCode();

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer total;


    public void setRestCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setRestCodeEnum(RestCodeEnum restCodeEnum) {
        this.setRestCode(restCodeEnum.getCode(), restCodeEnum.getDesc());
    }

    public static <T> Result<T> getSuccessResult(T data) {
        Result<T> restResult = new Result<>();
        restResult.setRestCodeEnum(RestCodeEnum.SUCCESS);
        restResult.setData(data);
        return restResult;
    }

    public static Result getFailResult(int code, String desc) {
        Result restResult = new Result();
        restResult.setRestCode(code, desc);
        return restResult;
    }

    public static Result getFailResult(RestCodeEnum restCodeEnum) {
        return getFailResult(restCodeEnum.getCode(), restCodeEnum.getDesc());
    }
}
