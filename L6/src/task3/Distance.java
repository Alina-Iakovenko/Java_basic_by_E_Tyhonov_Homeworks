package task3;

public class Distance {
    double distance;
    public void print() {};

    static class Converter {
        static double mToKm(double distance) {
            return distance*0.001;
        }
        static double mToMile(double distance) {
            return distance*0.0006213;
        }
        static double kmToM(double distance) {
            return distance*1000;
        }
        static double kmToMile(double distance) {
            return distance/8;
        }
        static double mileToM(double distance) {
            return distance*1609.344;
        }
        static double mileToKm(double distance) {
            return distance*1.609344;
        }
    }

    public static void main(String[] args) {
//        Distance.Converter conv = new Converter();
        System.out.println(Converter.kmToM(10));
    }
}
