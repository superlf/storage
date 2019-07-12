package com.commons.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogForDao {

    @Around(value = "execution(* com..*DaoImpl.*(..))")
    public void log(){
        
    }
}
