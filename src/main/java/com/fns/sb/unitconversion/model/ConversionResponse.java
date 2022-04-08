package com.fns.sb.unitconversion.model;

import lombok.Data;

@Data
public class ConversionResponse {
    double targetValue;

    public ConversionResponse(double targetValue) {
        this.targetValue = targetValue;
    }

    public ConversionResponse() {
    }
    public static ConversionResponse convert(double targetValue){
        return new ConversionResponse(targetValue);
    }
}
