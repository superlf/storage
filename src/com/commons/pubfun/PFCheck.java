package com.commons.pubfun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ${} on 2019/6/5.
 */
public class PFCheck {

    //校验字符串为数字
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("([\\+\\-])?([0-9])+(.[0-9])?([0-9])*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }



}
