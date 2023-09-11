package task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> list = new ArrayList<T>();

    public List<T> getList() {
        return list;
    }
//    метод добавления элемента,
    public void addMeth(T t) {
        list.add(t);
    }

//    индексатор для получения значения
//    элемента по указанному индексу
    public int indexOfMeth(T t) {
        return list.indexOf(t);

    }
//    свойство только для чтения для получения
//    общего количества    элементов
    public int count() {
        return list.size();
    }


}
