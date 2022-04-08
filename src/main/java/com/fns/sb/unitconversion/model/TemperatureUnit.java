package com.fns.sb.unitconversion.model;

public enum TemperatureUnit {
    CELSIUS("celsius"),
    KELVIN("kelvin"),
    FAHRENHEIT("fahrenheit"),
    RANKINE("rankine");

    public final String unit;

    private TemperatureUnit(String unit) {
        this.unit = unit;
    }
}
