package com.login.service;

import com.bean.schema.User;

public interface LoginService {
    
    public User login(User user);
    
    public boolean loginOut(User user);

}
