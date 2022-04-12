package com.fns.sb.unitconversion.util;

public class ConversionUtil {


    /*TEMPERATURE CONVERSIONS*/
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double celsiusToRankine(double celsius) {
        return (celsius * 9 / 5) + 491.67;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }
    public static double fahrenheitToRankine(double fahrenheit) {
        return (fahrenheit - 32) + 491.67;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
    public static double kelvinToRankine(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 491.67;
    }
    public static double kelvinToVNumber(double kelvin) {
        if(kelvin>=0 && kelvin<255.37)
            return 0;
        else if(kelvin>=255.37 && kelvin<273.15)
            return 1;
        else if(kelvin>=273.15 && kelvin<373.13)
            return 2;
        else if(kelvin>=373.13)
            return 3;
        return 0;
    }

    public static double rankineToCelsius(double rankine) {
        return (rankine - 491.67) * 5 / 9;
    }
    public static double rankineToFahrenheit(double rankine) {
        return (rankine - 491.67) + 32;
    }
    public static double rankineToKelvin(double rankine) {
        return (rankine - 491.67) * 5 / 9 + 273.15;
    }


    /*VOLUME CONVERSIONS*/
    public static double litersToTablespoons(double liters){
        return liters*67.628;
    }
    public static double litersToCubicInches(double liters){
        return liters* 61.024;
    }
    public static double litersToCups(double liters){
        return liters* 4.167;
    }
    public static double litersToCubicFeet(double liters){
        return liters*28.317;
    }
    public static double litersToGallons(double liters){
        return liters/3.785;
    }

    public static double tablespoonsToLiters(double tablespoons){
        return tablespoons/203;
    }
    public static double tablespoonsToCubicInches(double tablespoons){
        return tablespoons/ 3.325;
    }
    public static double tablespoonsToCups(double tablespoons){
        return tablespoons/ 48.692;
    }
    public static double tablespoonsToCubicFeet(double tablespoons){
        return tablespoons/ 5745;
    }
    public static double tablespoonsToGallons(double tablespoons){
        return tablespoons/ 768;
    }

    public static double cubicInchesToLiters(double cubicInches){
        return cubicInches/61.024;
    }
    public static double cubicInchesToTableSpoons(double cubicInches){
        return cubicInches*1.108;
    }
    public static double cubicInchesToCups(double cubicInches){
        return cubicInches*14.646;
    }
    public static double cubicInchesToCubicFeet(double cubicInches){
        return cubicInches/1728;
    }
    public static double cubicInchesToGallons(double cubicInches){
        return cubicInches/231;
    }

    public static double cupsToLiters(double cups){
        return cups/4.167;
    }
    public static double cupsToTableSpoons(double cups){
        return cups*16.231;
    }
    public static double cupsToCubicInches(double cups){
        return cups*14.646;
    }
    public static double cupsToCubicFeet(double cups){
        return cups/118;
    }
    public static double cupsToGallons(double cups){
        return cups/15.773;
    }

    public static double cubicFeetToLiters(double cubicFeet){
        return cubicFeet*28.317;
    }
    public static double cubicFeetToTableSpoons(double cubicFeet){
        return cubicFeet*1915;
    }
    public static double cubicFeetToCubicInches(double cubicFeet){
        return cubicFeet*1728;
    }
    public static double cubicFeetToCups(double cubicFeet){
        return cubicFeet*118;
    }
    public static double cubicFeetToGallons(double cubicFeet){
        return cubicFeet*7.481;
    }

    public static double gallonsToLiters(double gallons){
        return gallons*3.785;
    }
    public static double gallonsToTableSpoons(double gallons){
        return gallons*256;
    }
    public static double gallonsToCubicInches(double gallons){
        return gallons*231;
    }
    public static double gallonsToCups(double gallons){
        return gallons*15.773;
    }
    public static double gallonsToCubicFeet(double gallons){
        return gallons/7.481;
    }
}
