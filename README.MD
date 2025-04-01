# Polygon Class System

This project demonstrates a class hierarchy for polygons, including an interface and concrete classes for various polygon types like quadrilaterals, squares, rectangles, and trapeziums.

## Features

- **Polygon Interface**: Defines methods to get the name, number of sides, and total interior angle sum.
- **Quadrilateral Class**: Handles calculations for different quadrilaterals (Square, Rectangle, Trapezium) using method overloading.
- **Inheritance & Polymorphism**: Demonstrates the use of inheritance and method overriding.
- **Method Overloading**: Multiple `getArea()` methods for different quadrilaterals.
- **Abstraction**: Polygon interface abstracts common behaviors.

## Classes

1. **Polygon Interface**: Defines `getName()`, `getNumberOfSides()`, and `totalIntAngleSum()`.
2. **Quadrilateral Class**: Contains methods for calculating the area of squares, rectangles, and trapeziums.
3. **Square Class**: Uses `getArea()` method from `Quadrilateral`.
4. **Rectangle Class**: Uses `getArea()` method and creates an instance of `Quadrilateral`.
5. **Trapezium Class**: Implements the `Polygon` interface and calculates area.

## Usage

1. Clone the repo.
2. Compile and run the Java files.
3. Use the `main()` methods in the respective classes (`Square`, `Rectangle`, or `Trapezium`) to test functionality.

## Concepts Applied

- **Inheritance**
- **Polymorphism**
- **Abstraction**
- **Method Overloading**
- **Method Overriding**
