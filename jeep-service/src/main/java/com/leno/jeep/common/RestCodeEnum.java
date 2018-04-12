package com.leno.jeep.common;

import com.leno.jeep.common.base.BaseEnum;

/**
 * <p>结果吗</p>
 *
 * @author: XianGuo
 * @date: 2018年04月12日
 */
public enum RestCodeEnum implements BaseEnum {
    SUCCESS(20, "成功"),
    EMPTY(0, "没有找到相关数据"),
    PARAM_ERROR(30,"参数错误"),
    FAIL(10, "请求错误");

    RestCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Integer code;

    private String desc;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
