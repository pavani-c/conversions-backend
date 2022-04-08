package com.fns.sb.unitconversion.model;

public enum VolumeUnit {
    LITERS("liters"),
    GALLONS("gallons"),
    TABLESPOONS("tablespoons"),
    CUBIC_INCHES("cubic_inches"),
    CUPS("cups"),
    CUBIC_FEET("cubic_feet");

    public final String unit;

    VolumeUnit(String unit) {
        this.unit = unit;
    }
}
