package com.coderbdk.unitconv.core.conversion;


import com.coderbdk.unitconv.core.unit.LengthUnit;

public class LengthConverter implements UnitConverter<LengthUnit> {
    @Override
    public double convertTo(double value, LengthUnit fromUnit, LengthUnit toUnit) {
        if (fromUnit == null || toUnit == null) {
            throw new IllegalArgumentException("Unit cannot be null.");
        }
        if (fromUnit == toUnit) {
            return value;
        }
        double valueInMeter = fromUnit.toMeter(value);
        return toUnit.fromMeter(valueInMeter);
    }
}