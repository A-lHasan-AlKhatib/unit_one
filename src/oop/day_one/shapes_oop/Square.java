package oop.day_one.shapes_oop;

public class Square extends Shape {
    private final double length;

    public Square(int calcType) {
        System.out.println("Enter the length of the square: ");
        length = super.scanner.nextDouble();

        if (calcType == 1)
            printArea();
        else
            printCircumference();
    }


    @Override
    public void printArea() {
        System.out.println("Area of the square = " + (length * length));
    }

    @Override
    public void printCircumference() {
        System.out.println("Circumference of the square = " + (4 * length));
    }
}