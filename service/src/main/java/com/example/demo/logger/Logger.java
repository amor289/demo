package com.example.demo.logger;

import java.util.Map;

/**
 * 描述:
 * 通用日志记录
 *
 * @author 郭启帆
 * @create 2019-08-27 11:45
 */
public class Logger {

    public static void main(String[] args) {
        Person aa = new Person();
        aa.setName("amor949");
        aa.setAge("23");
        Person bb = new Person();
        bb.setName("大笨蛋");
        bb.setAge("20");
        Person cc = new Person();
        cc.setName("小大笨蛋");
        cc.setAge("1");
        bb.setChild(cc);
        aa.setChild(bb);
        String addLogs = LogUtils.getAddLogs(aa, null);
        System.out.println(addLogs);

        /*Map<String, String> updateLogs = LogUtils.getUpdateLogs(aa, bb, null);
        updateLogs.forEach((k,v)->System.out.println(k+"="+v));*/
    }
}
