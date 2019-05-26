package com.login.service.impl;

import com.bean.schema.LoginLog;
import com.bean.schema.User;
import com.commons.pubfun.PFDate;
import com.commons.pubfun.PFSerialno;
import com.commons.utils.LoginInterceptor;
import com.login.dao.LoginDao;
import com.login.dao.impl.LoginDaoImpl;
import com.login.service.LoginService;

public class LoginServiceImpl implements LoginService {

    private LoginDao loginDao = new LoginDaoImpl();
    
    @Override
    public User login(User user) {
        
        user = this.loginDao.login(user);
        
        if(user == null){
            throw new RuntimeException("用户名或密码错误!");
        }else{
            LoginLog ll = new LoginLog();
            ll.setLogin_id(PFSerialno.makeNo("LOGINLOG",10));//登陆日志信息
            ll.setLogin_date(PFDate.getCurrentDate());//登陆日期
            ll.setAccount(user.getAccount());//登陆账号
            ll.setLogin_time(PFDate.getCurryTime());//登陆时间
            ll.setLogin_ip(LoginInterceptor.getIPAddrs());//IP地址
            
            if(!this.loginDao.addLoginLog(ll)){
                throw new RuntimeException("插入登陆日志异常！");
            }
            
            return user;
        }
    }

}
