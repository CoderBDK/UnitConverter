package com.coderbdk.unitconv.core.conversion;

import com.coderbdk.unitconv.core.unit.AreaUnit;

public class AreaConverter implements UnitConverter<AreaUnit> {

    @Override
    public double convertTo(double value, AreaUnit fromUnit, AreaUnit toUnit) {
        if (fromUnit == null || toUnit == null) {
            throw new IllegalArgumentException("Unit cannot be null.");
        }
        if (fromUnit == toUnit) {
            return value;
        }
        double valueInSquareMeter = fromUnit.toSquareMeter(value);
        return toUnit.fromSquareMeter(valueInSquareMeter);
    }
}