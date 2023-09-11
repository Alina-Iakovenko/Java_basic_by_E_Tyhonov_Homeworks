package task3;

public class Vehicle {
    String coordinates;
    long price;
    int speed;
    int year;

    public Vehicle(String coordinates, long price, int speed, int year) {
        System.out.println("Characteristic of the vehicle:" + "\n" + "__________________________");
        System.out.println(String.format("Coordinates: %s", this.coordinates = coordinates));
        System.out.println(String.format("Price: %d", this.price = price));
        System.out.println(String.format("Speed: %d", this.speed = speed));
        System.out.println(String.format("Year: %d", this.year = year));
    }
}
