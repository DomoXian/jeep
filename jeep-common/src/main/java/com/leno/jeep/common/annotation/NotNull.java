package com.leno.jeep.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>空注解</p>
 *
 * @author: XianGuo
 * @date: 2018年05月11日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface NotNull {

    String value() default "";
}
