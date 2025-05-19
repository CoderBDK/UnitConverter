package com.coderbdk.unitconv.core.conversion;

import com.coderbdk.unitconv.core.unit.VolumeUnit;

public class VolumeConverter implements UnitConverter<VolumeUnit> {

    @Override
    public double convertTo(double value, VolumeUnit fromUnit, VolumeUnit toUnit) {
        if (fromUnit == null || toUnit == null) {
            throw new IllegalArgumentException("Units cannot be null.");
        }
        if (fromUnit == toUnit) {
            return value;
        }
        double valueInLiter = fromUnit.toLiter(value);
        return toUnit.fromLiter(valueInLiter);
    }
}
