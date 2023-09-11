package additionalTask;



import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Address myAdr = new Address();

        System.out.println("Enter your index: ");
        myAdr.setIndex(Integer.parseInt(sc.next()));
        System.out.println("Enter your country: ");
        myAdr.setCountry(sc.next());
        System.out.println("Enter your city: ");
        myAdr.setCity(sc.next());
        System.out.println("Enter your street: ");
        myAdr.setStreet(sc.next());
        System.out.println("Enter your house: ");
        myAdr.setHouse(sc.next());
        System.out.println("Enter your apartment: ");
        myAdr.setApartment(sc.next());

        System.out.println(myAdr.getAddress());
    }



}
