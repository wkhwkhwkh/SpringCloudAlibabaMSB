package com.utan;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 日期处理
 */
public class TestDate {
    //main方法，程序入口
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date instanceof java.sql.Date);
        System.out.println(date);
        System.out.println(date.toGMTString());  //过时
        System.out.println(date.toLocaleString());
        System.out.println(date.getTime()); //1970到现在毫秒数
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(System.currentTimeMillis()); //衡量算法执行时间

        Date date2 = new java.sql.Date(1621658962643L);
        System.out.println(date2);


        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //DateFormat是SimpleDateFormat父类,是个抽象类
        String dateStr = simpleDateFormat.format(new Date());
        System.out.println(dateStr);

        Calendar calendar = new GregorianCalendar();
        Calendar calendar2 = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.getActualMaximum(Calendar.DATE));//获取当月日期最大天数
        System.out.println(calendar.getActualMinimum(Calendar.DATE));//获取当月日期最小天数

        //set 可以改变内容
        calendar.set(Calendar.YEAR,1990);
        calendar.set(Calendar.MONTH,6);
        calendar.set(Calendar.DATE,6);
        System.out.println(calendar);


        //String -------> Calendar
        calendar.setTime(java.sql.Date.valueOf("2020-4-5"));
        System.out.println(calendar.get(Calendar.YEAR));




        //jdk1.8后的日期处理
        LocalDate localDate = LocalDate.now();//日期
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();//时间
        System.out.println(localTime);

        LocalDateTime localDateTime  =LocalDateTime.now();//日期时间
        System.out.println(localDateTime);


        System.out.println(LocalDate.of(2020,11,12));//of方法设置日期
        System.out.println(LocalTime.of(10,11,12));//of方法设置时间
        System.out.println(LocalDateTime.of(2020,11,12,11,11,11));//of方法设置日期时间


        //LocalDateTime常用方法get..方法
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        //LocalDateTime常用方法with..方法(不可变性)  和Calendar对象很像,区别Calendar对象改时间后本身就变了,而LocalDateTime改了之后赋给新的对象,原先的不会变
        LocalDateTime localDateTime2 = localDateTime.withMonth(8);
        System.out.println(localDateTime);//没变
        System.out.println(localDateTime2);//变了


        //提供了加减的操作:
        LocalDateTime localDateTime3 = localDateTime.plusMonths(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);



        //String和LocalDateTime相互转换,借助
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        //LocalDateTime转String
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);


        TemporalAccessor localDateTime4 = dateTimeFormatter.parse("2020年11月12日 11时11分11秒");
        System.out.println(localDateTime4);
    }
}
