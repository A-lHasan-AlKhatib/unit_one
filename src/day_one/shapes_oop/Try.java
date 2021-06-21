package day_one.shapes_oop;

import java.util.Scanner;

public class Try {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the shape\n1-Circle\n2-Square\n3-Triangle\n4-Rectangle\nShape: ");
        int shapeType = scanner.nextInt();

        System.out.print("\nSelect what to calculate:\n1-Area\n2-Circumference\nType: ");
        int whatToCalc = scanner.nextInt();

        System.out.println();

        switch (shapeType) {
            case 1:
                new Circle(whatToCalc);
                break;
            case 2:
                new Square(whatToCalc);
                break;
            case 3:
                new Triangle(whatToCalc);
                break;
            case 4:
                new Rectangle(whatToCalc);
                break;
            default:
                System.out.println("wrong input!");
        }
    }
}
