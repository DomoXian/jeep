package com.leno.jeep.common;

import lombok.Data;

/**
 * <p>业务结果封装</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
@Data
public class BizResult<T> {


    private String msg;

    private Integer code;

    private boolean isSuccess = true;

    private T data;

    public void setRestCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> BizResult<T> getSuccessResult(T data) {
        BizResult<T> result = new BizResult<>();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static BizResult getFailResult(String desc) {
        BizResult restResult = new BizResult();
        restResult.setRestCode(null, desc);
        restResult.setSuccess(false);
        return restResult;
    }

    public static BizResult getFailResult(int code, String desc) {
        BizResult restResult = new BizResult();
        restResult.setRestCode(code, desc);
        restResult.setSuccess(false);
        return restResult;
    }


}
