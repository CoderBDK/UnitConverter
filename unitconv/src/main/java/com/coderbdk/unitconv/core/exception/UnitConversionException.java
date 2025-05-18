package com.coderbdk.unitconv.core.exception;

public class UnitConversionException extends RuntimeException {
    public UnitConversionException(String message) {
        super(message);
    }

    public UnitConversionException(String message, Throwable cause) {
        super(message, cause);
    }
}