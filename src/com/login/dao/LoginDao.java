package com.login.dao;

import java.util.Map;

import com.bean.schema.LoginLog;
import com.bean.schema.User;

public interface LoginDao {
    
    /** 用户登陆校验 */
    public User login(User user);
    
    /** 增加登陆日志信息 */
    public boolean addLoginLog(LoginLog loginLog);
    
    /** 更新登出时间信心 
     * @throws Exception */
    public boolean loginOut(Map<String,Object> map) ;
    

}
