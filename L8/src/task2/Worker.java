package task2;

import java.util.Comparator;

public class Worker {
    String fullName;
    String position;
    int year;

    public Worker(String fullName, String position, int year) {
        this.fullName = fullName;
        this.position = position;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Full Name: " + this.fullName
                + ", position: " + this.position
                + ", experience from: " + this.year + "\n";
    }

    public static Comparator<Worker> workerComparator = new Comparator<Worker>() {
        @Override
        public int compare(Worker o1, Worker o2) {
            String workerName1 = o1.fullName.toUpperCase();
            String workerName2 = o2.fullName.toUpperCase();
            return workerName1.compareTo(workerName2);
        }
    };
}
