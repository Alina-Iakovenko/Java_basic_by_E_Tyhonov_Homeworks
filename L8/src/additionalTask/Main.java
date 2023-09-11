package additionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArithmeticException{
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.println(String.format("Your numbers are %f and %f.", a, b));
        System.out.print("Enter operation: ");
        String operation = sc.next();

        switch (operation) {
            case "+":
                System.out.println(calculator.add(a,b));
                break;
            case "-":
                System.out.println(calculator.sub(a,b));
                break;
            case "*":
                System.out.println(calculator.mul(a,b));
                break;
            case "/":
                try{
                    System.out.println(calculator.div(a,b));
                }
                catch (ArithmeticException e) {
                    System.out.println(e);
                }
                break;
            default: System.out.println("You`ve choosed unexisted operation. Try again");
        }
    }
}
