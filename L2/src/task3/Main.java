package task3;

public class Main {
    public static void main(String[] args) {
        Car car0 = new Car();
        car0.color = "some color";

        Car car1 = new Car(2001);
        Car car2 = new Car(2002, 2002);
        Car car3 = new Car(2003, 2003, 2003);
        Car car4 = new Car(2004, 2004, 2004, "2004");

        System.out.println("Car0 information:" +"\n" + car0.getCarInfo() +"\n");
        System.out.println("Car1 information:" +"\n" + car1.getCarInfo() +"\n");
        System.out.println("Car2 information:" +"\n" + car2.getCarInfo() +"\n");
        System.out.println("Car3 information:" +"\n" + car3.getCarInfo() +"\n");
        System.out.println("Car4 information:" +"\n" + car4.getCarInfo());

    }
}
