package task3;

public class Plane extends Vehicle{
    double height;
    int passengers;
    public Plane(String coordinates, long price, int speed, int year, double height, int passengers) {
        super(coordinates, price, speed, year);
        System.out.println(String.format("Height: %f", this.height = height));
        System.out.println(String.format("Passengers: %d", this.passengers = passengers));
    }

}
