package com.commons.utils;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class LoginInterceptor extends HandlerInterceptorAdapter{
    private final static String SESSION_USER ="session_user";
    private static String remoteAddr ;
    

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        LoginInterceptor.remoteAddr = request.getRemoteAddr();
        System.out.println("请求地址:"+remoteAddr);
        
        HttpSession session = request.getSession();
        if(session.getAttribute(SESSION_USER)==null){
            
            /** 解决浏览器回退时跳转 */
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.write(" <script type='text/javascript'>alert('您没有登录，请重新登录');window.top.location.href='"+ request.getContextPath() + "/index';</script>");
            out.flush();
            out.close();

            return false;
        }
        return true;
    }
    
    public static String getIPAddrs(){
        return remoteAddr;
    }
    
    


}
