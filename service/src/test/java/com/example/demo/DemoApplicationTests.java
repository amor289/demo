package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.logger.Person;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.event.ItemEvent;
import java.lang.reflect.Field;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private ArrayList ArrayList;

    @Test
    public void contextLoads() {
        // 毫秒转LocalDateTime
        Instant instant = Instant.ofEpochMilli(1560614400000L);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        //格式化
        String s = localDateTime.toLocalDate().toString();
        //日期是星期几
        String s1 = localDateTime.toLocalDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        String format = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));


        String format2 = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));

        String format3 = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        String format4 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String format5 = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String format6 = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String format7 = localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format8 = localDateTime.format(DateTimeFormatter.ISO_DATE);
        String format9 = localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME);

        //String format9 = localDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);


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
        List<Integer> list = Arrays.asList(1,1,1,1);
        Integer result = list.stream().reduce(2, Integer::sum, Integer::sum);
        System.out.println(result);
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE);
        long count = list.stream().reduce(0L, Long::sum, (a, b) -> 0L);
        System.out.println(count);
    }

    private void changeInt(Integer integer) {
        integer++;
    }

    public static void changeStr(String str) {
        str = "change yes or not?";
    }

}
