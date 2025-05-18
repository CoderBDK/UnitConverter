package com.coderbdk.unitconv.core.conversion;

public interface UnitConverter<U extends Unit> {
    double convertTo(double value, U fromUnit, U toUnit);
}