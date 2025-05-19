package com.coderbdk.unitconv.core.unit;


import com.coderbdk.unitconv.core.conversion.Unit;

public enum TemperatureUnit implements Unit {
    CELSIUS("Celsius"),
    FAHRENHEIT("Fahrenheit"),
    KELVIN("Kelvin");

    private final String name;

    TemperatureUnit(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}