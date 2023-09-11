package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        private int proKey = 123;
        private int expKey = 456;
        private int userKey;


        DocumentWorker userType = new DocumentWorker();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key number, please! ");
        userKey = sc.nextInt();


        if (userKey == proKey) {
            userType = new ProDocumentWorker();
        }
        else if (userKey == expKey) {
            userType = new ExpertDocumentWorker();
        }

        userType.openDocument();
        userType.editDocument();
        userType.saveDocument();

    }
}
