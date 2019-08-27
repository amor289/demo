package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(1560614400000L);
        Instant instant = Instant.ofEpochMilli(1560614400000L);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());


        LocalDateTime localDateTime1 = localDateTime.withHour(2);
        LocalDateTime localDateTime2 = localDateTime.plusHours(2);
        LocalDateTime localDateTime3 = localDateTime.plusYears(1);
        LocalDateTime of = LocalDateTime.of(localDateTime3.toLocalDate(), LocalTime.MAX);
        long l1 = of.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Duration duration = Duration.between(localDateTime, localDateTime1);
        Instant instant2 = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        long l = duration.toDays();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        LocalTime localTime = localDateTime.toLocalTime();
    }

    @Test
    public void test() {
        String str = "1234";
        Integer integer = 1;
        changeStr(str);
        changeInt(integer);
        System.out.println(str);
        System.out.println(integer);
    }
    @Test
    public void test1() {
        Integer a=1;
        System.out.println(a!=null);
    }

    private void changeInt(Integer integer) {
        integer++;
    }

    public static void changeStr(String str) {
        str="change yes or not?";
    }

}
