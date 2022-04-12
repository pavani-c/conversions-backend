package com.fns.sb.unitconversion.service;

import com.fns.sb.unitconversion.exception.ConversionException;
import com.fns.sb.unitconversion.model.TemperatureUnit;
import com.fns.sb.unitconversion.model.ConversionResponse;
import com.fns.sb.unitconversion.model.VolumeUnit;
import com.fns.sb.unitconversion.util.ConversionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ConversionService {

    public ConversionResponse tempConvert(double inputValue, String sourceUnit, String targetUnit) {
        if(StringUtils.isBlank(sourceUnit) || StringUtils.isBlank(targetUnit)){
            throw new ConversionException("Invalid Temparature Unit");
        }

        double targetValue=0;

        if(sourceUnit.equalsIgnoreCase(targetUnit)){
            targetValue = inputValue;
            return  ConversionResponse.convert(targetValue);
        }

        if(TemperatureUnit.CELSIUS.unit.equalsIgnoreCase(sourceUnit)){
            switch(TemperatureUnit.valueOf(targetUnit.toUpperCase())){
                case FAHRENHEIT:
                    targetValue = ConversionUtil.celsiusToFahrenheit(inputValue);
                    break;
                case KELVIN:
                    targetValue = ConversionUtil.celsiusToKelvin(inputValue);
                    break;
                case RANKINE:
                    targetValue = ConversionUtil.celsiusToRankine(inputValue);
                    break;
            }
        }else if(TemperatureUnit.FAHRENHEIT.unit.equalsIgnoreCase(sourceUnit)){
            switch(TemperatureUnit.valueOf(targetUnit.toUpperCase())){
                case CELSIUS:
                    targetValue = ConversionUtil.fahrenheitToCelsius(inputValue);
                    break;
                case KELVIN:
                    targetValue = ConversionUtil.fahrenheitToKelvin(inputValue);
                    break;
                case RANKINE:
                    targetValue = ConversionUtil.fahrenheitToRankine(inputValue);
                    break;
            }
        }else if(TemperatureUnit.RANKINE.unit.equalsIgnoreCase(sourceUnit)){
            switch(TemperatureUnit.valueOf(targetUnit.toUpperCase())){
                case CELSIUS:
                    targetValue = ConversionUtil.rankineToCelsius(inputValue);
                    break;
                case FAHRENHEIT:
                    targetValue = ConversionUtil.rankineToFahrenheit(inputValue);
                    break;
                case KELVIN:
                    targetValue = ConversionUtil.rankineToKelvin(inputValue);
                    break;
            }
        }else if(TemperatureUnit.KELVIN.unit.equalsIgnoreCase(sourceUnit)){
            switch(TemperatureUnit.valueOf(targetUnit.toUpperCase())){
                case CELSIUS:
                    targetValue = ConversionUtil.kelvinToCelsius(inputValue);
                    break;
                case FAHRENHEIT:
                    targetValue = ConversionUtil.kelvinToFahrenheit(inputValue);
                    break;
                case RANKINE:
                    targetValue =  ConversionUtil.kelvinToRankine(inputValue);
                    break;
                case VNUMBER:
                    targetValue =  ConversionUtil.kelvinToVNumber(inputValue);
                    break;
            }
        }

        return ConversionResponse.convert(targetValue);
    }

    public ConversionResponse volumeConvert(double inputValue, String sourceUnit, String targetUnit) {
        if(StringUtils.isBlank(sourceUnit) || StringUtils.isBlank(targetUnit)){
            throw new ConversionException("Invalid Volume Unit");
        }

        double targetValue=0;

        if(sourceUnit.equalsIgnoreCase(targetUnit)){
            targetValue = inputValue;
            return  ConversionResponse.convert(targetValue);
        }

        if(VolumeUnit.LITERS.unit.equalsIgnoreCase(sourceUnit)){
            switch(VolumeUnit.valueOf(targetUnit.toUpperCase())){
                case CUBIC_FEET:
                    targetValue = ConversionUtil.litersToCubicFeet(inputValue);
                    break;
                case CUBIC_INCHES:
                    targetValue = ConversionUtil.litersToCubicInches(inputValue);
                    break;
                case CUPS:
                    targetValue = ConversionUtil.litersToCups(inputValue);
                    break;
                case GALLONS:
                    targetValue = ConversionUtil.litersToGallons(inputValue);
                    break;
                case TABLESPOONS:
                    targetValue = ConversionUtil.litersToTablespoons(inputValue);
                    break;

            }
        }else if(VolumeUnit.TABLESPOONS.unit.equalsIgnoreCase(sourceUnit)){
            switch(VolumeUnit.valueOf(targetUnit.toUpperCase())){
                case LITERS:
                    targetValue = ConversionUtil.tablespoonsToLiters(inputValue);
                    break;
                case CUBIC_FEET:
                    targetValue = ConversionUtil.tablespoonsToCubicFeet(inputValue);
                    break;
                case CUBIC_INCHES:
                    targetValue = ConversionUtil.tablespoonsToCubicInches(inputValue);
                    break;
                case CUPS:
                    targetValue = ConversionUtil.tablespoonsToCups(inputValue);
                    break;
                case GALLONS:
                    targetValue = ConversionUtil.tablespoonsToGallons(inputValue);
                    break;
            }
        }else if(VolumeUnit.CUBIC_INCHES.unit.equalsIgnoreCase(sourceUnit)){
            switch(VolumeUnit.valueOf(targetUnit.toUpperCase())){
                case LITERS:
                    targetValue = ConversionUtil.cubicInchesToLiters(inputValue);
                    break;
                case CUBIC_FEET:
                    targetValue = ConversionUtil.cubicInchesToCubicFeet(inputValue);
                    break;
                case CUPS:
                    targetValue = ConversionUtil.cubicInchesToCups(inputValue);
                    break;
                case GALLONS:
                    targetValue = ConversionUtil.cubicInchesToGallons(inputValue);
                    break;
                case TABLESPOONS:
                    targetValue = ConversionUtil.cubicInchesToTableSpoons(inputValue);
                    break;
            }
        }else if(VolumeUnit.CUPS.unit.equalsIgnoreCase(sourceUnit)){
            switch(VolumeUnit.valueOf(targetUnit.toUpperCase())){
                case LITERS:
                    targetValue = ConversionUtil.cupsToLiters(inputValue);
                    break;
                case CUBIC_FEET:
                    targetValue = ConversionUtil.cupsToCubicFeet(inputValue);
                    break;
                case CUBIC_INCHES:
                    targetValue = ConversionUtil.cupsToCubicInches(inputValue);
                    break;
                case GALLONS:
                    targetValue = ConversionUtil.cupsToGallons(inputValue);
                    break;
                case TABLESPOONS:
                    targetValue = ConversionUtil.cupsToTableSpoons(inputValue);
                    break;
            }
        }else if(VolumeUnit.CUBIC_FEET.unit.equalsIgnoreCase(sourceUnit)){
            switch(VolumeUnit.valueOf(targetUnit.toUpperCase())){
                case LITERS:
                    targetValue = ConversionUtil.cubicFeetToLiters(inputValue);
                    break;
                case CUBIC_INCHES:
                    targetValue = ConversionUtil.cubicFeetToCubicInches(inputValue);
                    break;
                case CUPS:
                    targetValue = ConversionUtil.cubicFeetToCups(inputValue);
                    break;
                case GALLONS:
                    targetValue = ConversionUtil.cubicFeetToGallons(inputValue);
                    break;
                case TABLESPOONS:
                    targetValue = ConversionUtil.cubicFeetToTableSpoons(inputValue);
                    break;
            }
        }else if(VolumeUnit.GALLONS.unit.equalsIgnoreCase(sourceUnit)){
            switch(VolumeUnit.valueOf(targetUnit.toUpperCase())){
                case LITERS:
                    targetValue = ConversionUtil.gallonsToLiters(inputValue);
                    break;
                case CUBIC_FEET:
                    targetValue = ConversionUtil.gallonsToCubicFeet(inputValue);
                    break;
                case CUBIC_INCHES:
                    targetValue = ConversionUtil.gallonsToCubicInches(inputValue);
                    break;
                case CUPS:
                    targetValue = ConversionUtil.gallonsToCups(inputValue);
                    break;
                case TABLESPOONS:
                    targetValue = ConversionUtil.gallonsToTableSpoons(inputValue);
                    break;
            }
        }
        return ConversionResponse.convert(targetValue);
    }
}
