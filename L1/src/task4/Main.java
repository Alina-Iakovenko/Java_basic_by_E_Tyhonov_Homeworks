package task4;

public class Main {
    public static void main(String[] args) {
        Computer[] comps = new Computer[5];
//        comps[0] = new Computer();
//        comps[1] = new Computer();
//        comps[2] = new Computer();
//        comps[3] = new Computer();
//        comps[4] = new Computer();

        for (int i = 0; i < 5; i++) {
            comps[i] = new Computer();
            comps[i].compName = "Comp #" + i;
        }
        for (Computer item : comps) {
            System.out.println("detail: " + item.compName);
        }


    }
}
