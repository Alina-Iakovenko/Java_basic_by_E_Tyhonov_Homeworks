package additionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.println(String.format("Your numbers are %f and %f.", a, b));
        Calculator calc = new Calculator();
        System.out.println("a + b = " + calc.add(a,b));
        System.out.println("a - b = " + calc.sub(a,b));
        System.out.println("a * b = " + calc.mul(a,b));
        System.out.println("a / b = " + calc.div(a,b));

//       Lesson 8 additionalTask
    }

}
