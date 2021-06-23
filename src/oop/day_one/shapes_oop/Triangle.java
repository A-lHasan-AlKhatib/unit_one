package oop.day_one.shapes_oop;

import java.util.Arrays;

public class Triangle extends Shape {

    public Triangle(int calcType) {
        if (calcType == 1)
            printArea();
        else
            printCircumference();
    }

    @Override
    public void printArea() {
        System.out.println("Enter the base length:");
        double base = super.scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = super.scanner.nextDouble();

        System.out.println("Area of the triangle = " + ((1.0 / 2.0)) * base * height);
    }

    @Override
    public void printCircumference() {

        double[] sides = new double[3];

        System.out.println("Enter the length of the 3 sides:");

        for (int i = 0; i < sides.length; i++) {
            sides[i] = super.scanner.nextDouble();
        }

        System.out.println("Circumference of the triangle = " + Arrays.stream(sides).sum());
    }
}
