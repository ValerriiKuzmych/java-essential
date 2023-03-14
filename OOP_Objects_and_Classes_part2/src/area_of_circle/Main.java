package area_of_circle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");

        double area = sc.nextDouble();

        MyArea.methodAreaOfCircle(area);


    }
}
