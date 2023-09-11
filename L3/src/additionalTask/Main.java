package additionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color for text: ");
        String color = sc.nextLine();
        Printer printing = new Printer();

        if (color.equalsIgnoreCase("red")) {
            printing = new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            printing = new Blue();
        } else {
            printing = new Printer();
        }

        printing.print("text");
    }

}
