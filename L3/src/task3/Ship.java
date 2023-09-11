package task3;

public class Ship extends Vehicle {
    int passengers;
    String port;


    public Ship(String coordinates, long price, int speed, int year, int passengers, String port ) {
        super(coordinates, price, speed, year);
        System.out.println(String.format("Passengers: %d", this.passengers = passengers));
        System.out.println(String.format("Port: %s", this.port = port));
    }
}
