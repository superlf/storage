package com.commons.pubfun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PFDate {
    
    static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
    static SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
    static SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
    
    /** 获取当前日期(String) */
    public static String getCurryDate(){
        String date = sdf1.format(new Date());
        return date;
    }
    /** 获取当前日期(Date) */
    public static Date getCurrentDate(){
        Date date = null;
        try {
            date = sdf1.parse(getCurryDate());
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return date;
        }
    }
    
    
    /** 获取当前时间(String) */
    public static String getCurryTime(){
        String Time = sdf2.format(new Date());
        return Time;
    }
    /** 获取当前日期(Date) */
    public static Date getCurrentTime(){
        Date date = null;
        try {
            date = sdf2.parse(getCurryTime());
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return date;
        }
    }
    
    
    
    /** 获取当前日期和时间(String) */
    public static String getCurryDateTime(){
        String DateTime = sdf3.format(new Date());
        return DateTime;
    }
    /** 获取当前日期和时间(Date) */
    public static Date getCurrentDateTime(){
        Date date = null;
        try {
            date = sdf3.parse(getCurryDateTime());
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return date;
        }
    }
    
    /** 计算两个日期相差的天数 */
    
    /** 计算两个日期加上固定天数后的日期 */
   
    
    public static void main(String[] args) {
        System.out.println( PFDate.getCurrentDate());
        System.out.println( PFDate.getCurryDate());
    }
    

    
    

}
