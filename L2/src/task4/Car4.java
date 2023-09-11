package task4;

public class Car4 {
    int year;
    double speed;
    int weight;
    String color;

    public Car4() {
        this(2001, 201, 2, "color1");
    }

    public Car4(int year) {

        this.year = year;
    }

    public Car4(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car4(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car4(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }


    public String getCarInfo() {
        return "Year: " + year
                + " Speed: " + speed
                + " Weight: " + weight
                + " Color: " + color;
    }
    public int getYear() {
        return (year);
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
