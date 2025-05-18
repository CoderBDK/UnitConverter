package com.coderbdk.unitconverter.core.conversion;


import static org.junit.Assert.assertEquals;

import com.coderbdk.unitconv.core.conversion.LengthConverter;
import com.coderbdk.unitconv.core.conversion.UnitConverter;
import com.coderbdk.unitconv.core.unit.LengthUnit;

import org.junit.Test;

public class LengthUnitTest {
    private final UnitConverter<LengthUnit> converter = new LengthConverter();
    private static final double DELTA = 1e-9;

    @Test
    public void testMeterToMeter() {
        double result = converter.convertTo(1, LengthUnit.METER, LengthUnit.METER);
        assertEquals(1, result, DELTA);
    }

    @Test
    public void testCentimeterToMeter() {
        double result = converter.convertTo(100, LengthUnit.CENTIMETER, LengthUnit.METER);
        assertEquals(1, result, DELTA);
    }

    @Test
    public void testKilometerToMeter() {
        double result = converter.convertTo(1, LengthUnit.KILOMETER, LengthUnit.METER);
        assertEquals(1000, result, DELTA);
    }

    @Test
    public void testFootToMeter() {
        double result = converter.convertTo(1, LengthUnit.FOOT, LengthUnit.METER);
        assertEquals(0.3048, result, DELTA);
    }

    @Test
    public void testInchToMeter() {
        double result = converter.convertTo(12, LengthUnit.INCH, LengthUnit.METER);
        assertEquals(0.3048, result, DELTA);
    }

    @Test
    public void testMeterFromMeter() {
        double result = converter.convertTo(1, LengthUnit.METER, LengthUnit.METER);
        assertEquals(1, result, DELTA);
    }

    @Test
    public void testCentimeterFromMeter() {
        double result = converter.convertTo(1, LengthUnit.METER, LengthUnit.CENTIMETER);
        assertEquals(100, result, DELTA);
    }

    @Test
    public void testKilometerFromMeter() {
        double result =  converter.convertTo(1000, LengthUnit.METER, LengthUnit.KILOMETER);
        assertEquals(1, result, DELTA);
    }

    @Test
    public void testFootFromMeter() {
        double result = converter.convertTo(0.3048, LengthUnit.METER, LengthUnit.FOOT);
        assertEquals(1, result, DELTA);
    }

    @Test
    public void testInchFromMeter() {
        double result = converter.convertTo(0.3048, LengthUnit.METER, LengthUnit.INCH);
        assertEquals(12, result, DELTA);
    }

    @Test
    public void testGetName() {
        assertEquals("meter", LengthUnit.METER.getName());
        assertEquals("centimeter", LengthUnit.CENTIMETER.getName());
        assertEquals("kilometer", LengthUnit.KILOMETER.getName());
        assertEquals("foot", LengthUnit.FOOT.getName());
        assertEquals("inch", LengthUnit.INCH.getName());
    }
}