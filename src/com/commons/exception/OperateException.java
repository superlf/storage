package com.commons.exception;

public class OperateException extends Exception{

    private static final long serialVersionUID = 4035012028875527690L;
    public OperateException(){
        super();
    }
    
    public OperateException(String message, Throwable cause){
        super(message,cause);
    }
    
    public OperateException(String message){
        super(message);
    }
    
}
