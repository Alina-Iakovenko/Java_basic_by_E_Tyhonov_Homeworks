package task3;

public class Main {
    public static void main(String[] args) {
        // Создание собственного словаря на основе Map
        MyDictionary<String, String> dict = new MyDictionary<>();
        dict.addMeth("123", "Hello");
        dict.addMeth("234", "World");

        System.out.println(dict.getDictionary());
        System.out.println("Index = " + dict.indexOfMeth("123"));
        System.out.println("Count = " + dict.count());
    }
}
