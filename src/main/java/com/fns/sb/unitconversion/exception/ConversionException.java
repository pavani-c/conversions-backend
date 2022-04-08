package com.fns.sb.unitconversion.exception;

public class ConversionException extends RuntimeException{
    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ConversionException(String msg){
        super(msg);
    }
    public ConversionException(String msg,String code){
        super(msg);
        this.code=code;
    }

}


