package task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________________________" + "\n" + "Plane A548" + "\n" + "__________________________");
        Plane a = new Plane("2.35.65489", 5_000_000_000L, 200, 2001, 10_000, 450);
        System.out.println("__________________________" + "\n" + "Car Toyota" + "\n" + "__________________________");
        Car toyota = new Car("54.789.4665", 2_000_000L, 250,2020);
        System.out.println("__________________________" + "\n" + "Ship Admiral" + "\n" + "__________________________");
        Ship admiral = new Ship("6568.789.32479", 4_500_000_000L, 70,1998, 1600, "Odesa");
    }
}
