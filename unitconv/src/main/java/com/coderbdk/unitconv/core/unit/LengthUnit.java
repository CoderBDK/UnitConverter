package com.coderbdk.unitconv.core.unit;


import com.coderbdk.unitconv.core.conversion.Unit;

public enum LengthUnit implements Unit {
    METER("meter", 1.0),
    CENTIMETER("centimeter", 0.01),
    KILOMETER("kilometer", 1000.0),
    FOOT("foot", 0.3048),
    INCH("inch", 0.0254);

    private final String name;
    private final double toMeter;

    LengthUnit(String name, double toMeter) {
        this.name = name;
        this.toMeter = toMeter;
    }

    public double toMeter(double value) {
        return value * toMeter;
    }

    public double fromMeter(double value) {
        return value / toMeter;
    }

    @Override
    public String getName() {
        return name;
    }
}