package task2;

import task2.AbstractHandler;
import task2.DOCHandler;
import task2.TXTHandler;
import task2.XMLHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String docType;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of document, please! ");
        docType = sc.nextLine();

        AbstractHandler handler = null;
        if (docType.equalsIgnoreCase("XML")) {
            handler = new XMLHandler();
        }
        else if (docType.equalsIgnoreCase("TXT")) {
            handler = new TXTHandler();
        }
        if (docType.equalsIgnoreCase("DOC")) {
            handler = new DOCHandler();
        }

        handler.open();
        handler.create();
        handler.change();
        handler.save();
    }
}