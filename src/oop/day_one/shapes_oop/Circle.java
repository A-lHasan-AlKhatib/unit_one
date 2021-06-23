package oop.day_one.shapes_oop;

public class Circle extends Shape {
    final double radius;

    public Circle(int calcType) {
        System.out.println("Enter the radius of the circle:");
        this.radius = super.scanner.nextDouble();

        if (calcType == 1)
            printArea();
        else
            printCircumference();
    }


    @Override
    public void printArea() {
        System.out.println("Area of the circle = " + (Math.PI * radius * radius));
    }

    @Override
    public void printCircumference() {
        System.out.println("Circumference of the circle = " + (Math.PI * 2 * radius));
    }
}
