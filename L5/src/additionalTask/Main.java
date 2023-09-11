package additionalTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("a");
        teachers.add("b");
        teachers.add("c");
        teachers.add("d");
        teachers.add("e");
        teachers.add("f");
        teachers.add("g");

        System.out.println(teachers.size());
        System.out.println("index of the best teacher is " + teachers.indexOf("d"));
        System.out.println("index of the worse teacher is " + teachers.indexOf("g"));
        System.out.println(teachers.contains("i"));

    }
}
