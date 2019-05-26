package com.commons.exception;

public class DataException extends RuntimeException{

    private static final long serialVersionUID = 5529370571063261675L;
    public DataException(){
        super();
    }
    
    public DataException(String message, Throwable cause){
        super(message,cause);
    }
    
    public DataException(String message){
        super(message);
    }
    

}
