package com.example.demo.logger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述:
 * 日志注解
 *
 * @author 郭启帆
 * @create 2019-08-27 11:48
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface LogField {
    /**
     * 列名
     */
    String name() default "";

    /**
     * 实体属性列名
     */
    String entityName() default "";

}
