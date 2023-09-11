package additionalTask;

import java.util.Scanner;

public class Calculator {
  
    double add(double a, double b) {
        return a+b;
    }

    double sub(double a, double b) {
        return a-b;
    }

    double mul(double a, double b) {
        return a*b;
    }


    double div(double a, double b) {
         if (b == 0) {
            throw new ArithmeticException("/ by 0.");
         }
         return a/b;
    }

}


