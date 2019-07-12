package com.login.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.schema.LoginLog;
import com.bean.schema.User;
import com.commons.pubfun.PFDate;
import com.commons.pubfun.PFSerialno;
import com.commons.utils.LoginInterceptor;
import com.login.dao.LoginDao;
import com.login.dao.impl.LoginDaoImpl;
import com.login.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {
    static Logger log = Logger.getLogger(LoginServiceImpl.class.getName()); 
    
    @Autowired
    private LoginDao loginDao;
    
    @Override
    public User login(User user) {
        
        user = this.loginDao.login(user);
        
        if(user == null){
            throw new RuntimeException("用户名或密码错误!");
        }else{
            LoginLog ll = new LoginLog();
            String serialno = PFSerialno.makeNo("LOGINLOG",10);
            ll.setLogin_id(serialno);//登陆日志信息
            ll.setLogin_date(PFDate.getCurrentDate());//登陆日期
            ll.setAccount(user.getUserId()+"");//登陆账号
            ll.setLogin_time(PFDate.getCurryTime());//登陆时间
            ll.setLogin_ip(LoginInterceptor.getIPAddrs());//IP地址
            
            if(!this.loginDao.addLoginLog(ll)){
                throw new RuntimeException("插入登陆日志异常！");
            }
            
            user.setSpareString2(user.getSpareString1());//上次登陆ID
            user.setSpareString1(serialno);//本次登陆ID
            return user;
        }
    }

    @Override
    public boolean loginOut(User user) {
        
        Map<String,Object> map = new HashMap<String,Object>();   
        map.put("curryDate", PFDate.getCurryDate());
        map.put("curryTime", PFDate.getCurryTime());
        map.put("loginID", user.getSpareString1());
        
        if(!this.loginDao.loginOut(map)){
            log.debug("更新登陆日志表信息出错!!");
            return false; 
        }else{
            return true; 
        }
    }
    
    
    

}
