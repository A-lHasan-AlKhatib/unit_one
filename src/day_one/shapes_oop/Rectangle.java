package day_one.shapes_oop;

public class Rectangle extends Shape {
    final private double width, height;

    public Rectangle(int calcType) {
        System.out.println("Enter the width of the rectangle:");
        this.width = super.scanner.nextDouble();

        System.out.println("Enter the height of the rectangle:");
        this.height = super.scanner.nextDouble();

        if (calcType == 1)
            printArea();
        else
            printCircumference();
    }

    @Override
    public void printArea() {
        System.out.println("Area of the rectangle = " + (width * height));
    }

    @Override
    public void printCircumference() {
        System.out.println("Circumference of the rectangle = " + (2 * (width + height)));
    }
}
