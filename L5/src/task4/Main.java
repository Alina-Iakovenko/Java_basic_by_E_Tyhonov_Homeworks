package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            integers.add(i);
        }
//        System.out.println(integers);  друкує в рядок з комами. Через ітератор друкує стовпчиком

        ListIterator<Integer> iterator = integers.listIterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next()+1;
            System.out.println(item);
        }
    }

}
