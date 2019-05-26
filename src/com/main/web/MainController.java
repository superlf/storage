package com.main.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/sys")
public class MainController {
    
    @GetMapping("/main")
    public static String index(HttpServletRequest request){
        return "jsp/main/main";
    }

}
