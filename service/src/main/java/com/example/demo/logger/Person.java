package com.example.demo.logger;

import lombok.Data;

import java.util.List;

/**
 * 描述:
 * 日志实体
 *
 * @author 郭启帆
 * @create 2019-08-27 14:28
 */
@Data
public class Person {

    @LogField(name = "姓名", entityName = "真实姓名")
    private String name;

    @LogField(name = "年龄", entityName = "真实年龄")
    private String age;

    @LogField(name = "孩子", entityName = "孩子")
    private List<Person> child;

}
