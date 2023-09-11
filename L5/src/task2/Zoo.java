package task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "elephant");
        zoo.add("zebra");
        zoo.add("flamingo");
        zoo.add("crocodile");
        zoo.add("wolf");
        zoo.add("fox");
        zoo.add("horse");
        zoo.add("bear");

        for (String animal: zoo) {
            System.out.println(animal);
        }
    }

}
