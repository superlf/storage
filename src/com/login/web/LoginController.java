package com.login.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.schema.User;
import com.login.service.LoginService;
import com.login.service.impl.LoginServiceImpl;

@Controller
@RequestMapping("/sys")
public class LoginController {

    private static final String SESSION_USER ="session_user";
    private LoginService loginService = new LoginServiceImpl();
    Logger log = Logger.getLogger(getClass());
    
    
    
    @PostMapping("/login")
    public String login(User user,HttpServletRequest request){
        this.log.info("LoginInfo:"+"Account:"+user.getAccount()+ "Password:"+user.getPassword());
        
        user = this.loginService.login(user);
        
        HttpSession session = request.getSession();
        session.setAttribute(SESSION_USER, user);
        
        return "redirect:/sys/main";
    }

    @GetMapping("/loginout")
    public String loginout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        
        return "redirect:/index";
        
        
    }
    
    
    

}
