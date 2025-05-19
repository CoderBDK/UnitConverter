package com.coderbdk.unitconv.core.unit;

import com.coderbdk.unitconv.core.conversion.Unit;

public enum VolumeUnit implements Unit {
    LITER("liter", 1.0),
    MILLILITER("milliliter", 0.001),
    CUBIC_METER("cubic meter", 1000.0),
    CUBIC_CENTIMETER("cubic centimeter", 0.001),
    GALLON("gallon", 3.78541);

    private final String name;
    private final double toLiter;

    VolumeUnit(String name, double toLiter) {
        this.name = name;
        this.toLiter = toLiter;
    }

    public double toLiter(double value) {
        return value * toLiter;
    }

    public double fromLiter(double value) {
        return value / toLiter;
    }

    @Override
    public String getName() {
        return name;
    }
}