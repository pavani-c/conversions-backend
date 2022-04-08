package com.fns.sb.unitconversion.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include. NON_NULL)
public class ConversionAPIResponse<T> {
    boolean status;
    String errorCode;
    String errorMessage;
    T data;

    public ConversionAPIResponse() {
    }

    public ConversionAPIResponse(boolean success, String errorCode, String errorMessage) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ConversionAPIResponse(boolean success, T data) {
        this.status = success;
        this.data = data;
    }

    public static ConversionAPIResponse success(Object data){
        return  new ConversionAPIResponse(true,data);
    }

    public static ConversionAPIResponse fail(String errorCode, String errorMessage){
        ConversionAPIResponse successResponse = new ConversionAPIResponse(false,errorCode,errorMessage);
        return successResponse;
    }


}
