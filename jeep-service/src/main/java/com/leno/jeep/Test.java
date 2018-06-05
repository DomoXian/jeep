package com.leno.jeep;

import com.alibaba.fastjson.JSON;
import com.leno.jeep.common.annotation.NotNull;
import com.leno.jeep.common.utils.AnnotationUtil;

import javax.validation.constraints.NotBlank;

/**
 * <p>TODO</p>
 *
 * @author: XianGuo
 * @date: 2018年04月26日
 */
@NotNull(value = "大爷的")
public class Test {

    @NotNull("这个值不能为空")
    private String str = "";


    @Deprecated
    @NotBlank
    public void test(){

    }

    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(AnnotationUtil.getMethodAnnotation(Test.class,"test")));
        System.out.println(JSON.toJSONString(AnnotationUtil.getFieldAnnotation(Test.class,"str")));
    }
}
