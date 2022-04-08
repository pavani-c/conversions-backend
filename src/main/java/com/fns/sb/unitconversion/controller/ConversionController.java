package com.fns.sb.unitconversion.controller;

import com.fns.sb.unitconversion.model.ConversionAPIResponse;
import com.fns.sb.unitconversion.model.ConversionRequest;
import com.fns.sb.unitconversion.service.ConversionService;
import lombok.extern.slf4j.Slf4j;
import com.fns.sb.unitconversion.model.ConversionResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping(path = "/unit/api")
@Slf4j
public class ConversionController {
    private ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostMapping("/temperature/convert")
    ResponseEntity<ConversionAPIResponse> tempConvert(@RequestBody @Valid ConversionRequest request) {
        log.info("Temperature Conversion Request " + request);
        ConversionResponse resp = conversionService.tempConvert(request.getInputValue(), request.getInputUnit(), request.getTargetUnit());
        return ResponseEntity.ok(ConversionAPIResponse.success(resp));
    }

    @PostMapping("/volume/convert")
    ResponseEntity<ConversionAPIResponse> volConvert(@RequestBody @Valid ConversionRequest request) {
        log.info("Volume Conversion Request " + request);
        ConversionResponse response = conversionService.volumeConvert(request.getInputValue(), request.getInputUnit(), request.getTargetUnit());
        return ResponseEntity.ok(ConversionAPIResponse.success(response));
    }

}