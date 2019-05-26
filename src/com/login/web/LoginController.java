package com.login.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.schema.User;
import com.login.service.LoginService;
import com.login.service.impl.LoginServiceImpl;

@Controller
@RequestMapping("/sys")
public class LoginController {
    
    
    LoginService ls = new LoginServiceImpl();
    
    @PostMapping("/login")
    public String login(User user){
        System.out.println("账号："+user.getAccount()+ "密码："+user.getPassword());
        user = this.ls.login(user);
        
        
        return "index.jsp";
    }

    
    
    

}
