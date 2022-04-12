package com.fns.sb.unitconversion.model;

public enum TemperatureUnit {
    CELSIUS("celsius"),
    KELVIN("kelvin"),
    FAHRENHEIT("fahrenheit"),
    RANKINE("rankine"),
    VNUMBER("vnumber");

    public final String unit;

    private TemperatureUnit(String unit) {
        this.unit = unit;
    }
}
