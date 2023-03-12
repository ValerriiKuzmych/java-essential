package rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        double side1, side2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the side 1: ");

        side1 = sc.nextDouble();

        System.out.print("\nEnter the size of the side 2: ");

        side2 = sc.nextDouble();

        System.out.print("Area = " + rectangle.areaCalculator(side1, side2));
        System.out.print("\nPerimeter = " + rectangle.perimeterCalculator(side1, side2));




    }
}
