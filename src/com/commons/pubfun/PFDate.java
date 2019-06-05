package com.commons.pubfun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PFDate {
    
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
    private static SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");

    /** String日期格式化为Date类型  */
    public static Date StringToDate(String sDate){
        Date date = null;
        try {
            if(sDate.indexOf("-") != -1){
                date = sdf1.parse(sDate);
            }else {
                date = sdf3.parse(sDate);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return date;
    }

    public static String DateToString(Date sDate){
        String tdate = sdf1.format(sDate);
        return tdate;
    }



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


    /** 计算日期加上日之后的日期 */

    /**
     *  根据标志获取 月份的首尾天
     *  sDate 日期
     *  flag 首尾标志
     */
    public static String getFirstDate(String sDate,String flag){

        Date tDate = PFDate.StringToDate(sDate);
        GregorianCalendar mCalendar = new GregorianCalendar();
        mCalendar.setTime(tDate);
        int years = mCalendar.get(Calendar.YEAR);
        int months = mCalendar.get(Calendar.MONTH);
        int days ;
        if(flag.equals("FIRST")){
            days = mCalendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        }else if(flag.equals("LAST")){
            days = mCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        }else {
            throw new RuntimeException("日期转换参数不对！");
        }
        mCalendar.set(years,months,days);
        return  PFDate.DateToString(mCalendar.getTime());
    }

    
    public static void main(String[] args) {
        System.out.println( PFDate.getCurrentDate());
        System.out.println( PFDate.getCurryDate());
    }
    

    
    

}
