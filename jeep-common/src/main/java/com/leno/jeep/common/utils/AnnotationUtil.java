package com.leno.jeep.common.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>注解</p>
 *
 * @author: XianGuo
 * @date: 2018年05月11日
 */
public class AnnotationUtil {


    public static Annotation[] getMethodAnnotation(Class<?> tClass, String methodName) {
        Method[] methods = tClass.getMethods();
        for (Method method : methods) {
            if (methodName.equals(method.getName())) {
                return method.getAnnotations();
            }
        }
        return null;
    }

    public static Annotation[] getFieldAnnotation(Class<?> tClass, String fieldName) {
        Field[] fields = tClass.getDeclaredFields();
        for (Field field : fields) {
            if (fieldName.equals(field.getName())) {
                return field.getAnnotations();
            }
        }
        return null;
    }

}
