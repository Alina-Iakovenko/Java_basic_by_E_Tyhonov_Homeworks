package task4;

public class Main {
    public static void main(String[] args) {
        Car4 car40 = new Car4();
        car40.color = "default color";

        Car4 car41 = new Car4(2001);
        Car4 car42 = new Car4(2002, 2002);
        Car4 car43 = new Car4(2003, 2003, 2003);
        Car4 car44 = new Car4(2004, 2004, 2004, "color2004");

        System.out.println("Car0 information:" +"\n" + car40.getCarInfo() +"\n");
        System.out.println("Car1 information:" +"\n" + car41.getCarInfo() +"\n");
        System.out.println("Car2 information:" +"\n" + car42.getCarInfo() +"\n");
        System.out.println("Car3 information:" +"\n" + car43.getCarInfo() +"\n");
        System.out.println("Car4 information:" +"\n" + car44.getCarInfo());

    }
}
