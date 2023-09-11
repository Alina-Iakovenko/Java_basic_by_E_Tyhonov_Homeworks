package task2;

import java.util.Scanner;
//import task2.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Put side1: ");
        double side1 = sc.nextDouble();
        System.out.println("Put side2: ");
        double side2 = sc.nextDouble();

        System.out.println(rectangle.areaCalculator(side1, side2));
        System.out.println(rectangle.perimeterCalculator(side1, side2));
    }
}