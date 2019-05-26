package com.login.dao;

import com.bean.schema.LoginLog;
import com.bean.schema.User;

public interface LoginDao {
    
    /** 用户登陆校验 */
    public User login(User user);
    
    /** 增加登陆日志信息 */
    public boolean addLoginLog(LoginLog loginLog);
    

}
