package task2;

public class Car {
    private final int year;
    String color;

    public Car() {
        this.year = 1900;
        this.color = "black";
    }

    public Car(int year) {
        this.year = year;
        this.color = "black";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
