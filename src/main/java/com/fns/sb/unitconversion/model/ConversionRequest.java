package com.fns.sb.unitconversion.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ConversionRequest {

    double inputValue;
    @NotEmpty
    String inputUnit;
    @NotEmpty
    String targetUnit;
}
