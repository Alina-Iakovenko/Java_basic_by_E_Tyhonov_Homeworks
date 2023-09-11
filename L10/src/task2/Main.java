package task2;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.addMeth("dfg");
        list.addMeth("aiek");

        System.out.println(list.getList());
        System.out.println("Index = "+list.indexOfMeth("jfns"));
        System.out.println("Index = "+list.indexOfMeth("aiek"));
        System.out.println("Count: " + list.count());
    }

}
