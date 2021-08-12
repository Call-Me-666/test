package org.zjx.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期测试类
 */
public class DateTest {

    static final int hn = 60 * 60 * 1000;
    static final int mn = 60 * 1000;
    static final int sn = 1000;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws ParseException {
//        Calendar calendar = new GregorianCalendar();
//        calendar.set(2021, 8, 13, 0, 0, 0);
//        Date xx = calendar.getTime();

        Date date1 = simpleDateFormat.parse("2021-07-11 01:20:54");


        for (int i = 0; i < 24; i++) {
            Date dateStart = new Date(date1.getTime() - (i * hn));
            long value = dateStart.getTime() + (59 * mn) + (59 * sn);
            Date date2 = new Date(value);
            System.out.println("起始时间：" + simpleDateFormat2.format(dateStart) + "---------结束时间：" + simpleDateFormat2.format(date2));
        }
    }
}
