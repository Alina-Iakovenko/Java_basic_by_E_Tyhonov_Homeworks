package additionalTask;

public class MyClass<T> {
    static T void factoryMethod(T t1) {
//        MyClass<T> example = new MyClass<>();
        public static <T > void factoryMethod (T t1){
            System.out.println(t1.toString());
        }
    }
        public static void main(String[] args) {
            factoryMethod(new Double(3.14));
        }

    };
}
