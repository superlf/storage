package com.commons.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogForSer {
    
    /**
     * 按顺序进行解释AOP的代理表达式
     * [*]:返回类型~任意的返回类型;
     * [..]:任意包层(* 的话只能代表一层);
     * [*Con]:以Con结尾的类;
     * [.*]:代表该类下的任意方法;
     * [..]:代表任意类型个数的形参
     */
    @Around(value = "execution(* com..*ServiceImpl.*(..))")
    public void log(){
        
    }
    
    
}
