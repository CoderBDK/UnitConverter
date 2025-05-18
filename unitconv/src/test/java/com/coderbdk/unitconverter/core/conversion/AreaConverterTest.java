package com.coderbdk.unitconverter.core.conversion;


import static org.junit.Assert.assertEquals;

import com.coderbdk.unitconv.core.conversion.AreaConverter;
import com.coderbdk.unitconv.core.conversion.UnitConverter;
import com.coderbdk.unitconv.core.unit.AreaUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AreaConverterTest {

    private final UnitConverter<AreaUnit> converter = new AreaConverter();

    private static final double DELTA = 1e-9;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testSquareMeterToSquareCentimeter() {
        double result = converter.convertTo(1, AreaUnit.SQUARE_METER, AreaUnit.SQUARE_CENTIMETER);
        assertEquals(10000, result, DELTA);
    }

    @Test
    public void testSquareKilometerToSquareMeter() {
        double result = converter.convertTo(1, AreaUnit.SQUARE_KILOMETER, AreaUnit.SQUARE_METER);
        assertEquals(1000000, result, DELTA);
    }

    @Test
    public void testSquareFootToSquareInch() {
        double result = converter.convertTo(1, AreaUnit.SQUARE_FOOT, AreaUnit.SQUARE_INCH);
        assertEquals(144, result, DELTA);
    }

    @Test
    public void testSameUnitConversion() {
        double result = converter.convertTo(5, AreaUnit.SQUARE_METER, AreaUnit.SQUARE_METER);
        assertEquals(5, result, DELTA);
    }

    @Test
    public void testNullFromUnit() {
        expectedException.expect(IllegalArgumentException.class);
        converter.convertTo(1, null, AreaUnit.SQUARE_METER);
    }

    @Test
    public void testNullToUnit() {
        expectedException.expect(IllegalArgumentException.class);
        converter.convertTo(1, AreaUnit.SQUARE_METER, null);
    }
}