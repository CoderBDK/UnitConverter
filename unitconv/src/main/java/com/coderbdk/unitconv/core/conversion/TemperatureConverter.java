package com.coderbdk.unitconv.core.conversion;


import com.coderbdk.unitconv.core.exception.UnitConversionException;
import com.coderbdk.unitconv.core.unit.TemperatureUnit;

public class TemperatureConverter implements UnitConverter<TemperatureUnit> {

    @Override
    public double convertTo(double value, TemperatureUnit fromUnit, TemperatureUnit toUnit) {
        if (fromUnit == null || toUnit == null) {
            throw new IllegalArgumentException("Units cannot be null.");
        }
        if (fromUnit == toUnit) {
            return value;
        }

        double celsiusValue;
        switch (fromUnit) {
            case CELSIUS:
                celsiusValue = value;
                break;
            case FAHRENHEIT:
                celsiusValue = (value - 32) * 5.0 / 9.0;
                break;
            case KELVIN:
                celsiusValue = value - 273.15;
                break;
            default:
                throw new UnitConversionException("Unsupported unit: " + fromUnit);
        }

        switch (toUnit) {
            case CELSIUS:
                return celsiusValue;
            case FAHRENHEIT:
                return (celsiusValue * 9.0 / 5.0) + 32;
            case KELVIN:
                return celsiusValue + 273.15;
            default:
                throw new UnitConversionException("Unsupported unit: " + toUnit);
        }
    }
}