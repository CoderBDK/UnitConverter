package com.coderbdk.unitconv.core.unit;


import com.coderbdk.unitconv.core.conversion.Unit;

public enum AreaUnit implements Unit {
    SQUARE_METER("square meter", 1.0),
    SQUARE_CENTIMETER("square centimeter", 0.0001),
    SQUARE_KILOMETER("square kilometer", 1000000.0),
    SQUARE_FOOT("square foot", 0.092903),
    SQUARE_INCH("square inch", 0.00064516);

    private final String name;
    private final double toSquareMeter;

    AreaUnit(String name, double toSquareMeter) {
        this.name = name;
        this.toSquareMeter = toSquareMeter;
    }

    public double toSquareMeter(double value) {
        return value * toSquareMeter;
    }

    public double fromSquareMeter(double value) {
        return value / toSquareMeter;
    }

    @Override
    public String getName() {
        return name;
    }
}