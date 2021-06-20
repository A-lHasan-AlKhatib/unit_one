package shapes_oop;

import java.util.Scanner;

public abstract class Shape {

    protected Scanner scanner = new Scanner(System.in);

    public abstract void printArea();

    public abstract void printCircumference();
}
