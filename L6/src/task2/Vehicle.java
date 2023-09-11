package task2;

public class Vehicle {
    void print() {};

    class Wheel {
        public void print() {
            System.out.println("Inner class Wheel");
        }
    }
    class Door {
        public void print() {
            System.out.println("Inner class Door");
        }
    }
}
