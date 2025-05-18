# UnitConverter

A simple and versatile Java library for converting between various units of measurement, including length, area. Easily extendable with new unit types.

## Features

* Length conversion (`LengthConverter`, `LengthUnit`)
* Area conversion (`AreaConverter`, `AreaUnit`)

## Unit Conversions

```java
// Length conversion
double meters = 10;
double centimeters = LengthConverter.convertTo(meters, LengthUnit.METER, LengthUnit.CENTIMETER);
System.out.println(meters + " meters = " + centimeters + " centimeters");

// Area conversion
double squareMeters = 5;
double squareFeet = AreaConverter.convertTo(squareMeters, AreaUnit.SQUARE_METER, AreaUnit.SQUARE_FOOT);
System.out.println(squareMeters + " square meters = " + squareFeet + " square feet");
```

## Installion
### 1. Clone the repository
```bash
https://github.com/CoderBDK/UnitConverter.git
```
## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
