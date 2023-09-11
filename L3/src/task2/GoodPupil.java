package task2;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        super.study();
        System.out.println("Good");
    }

    @Override
    void read() {
        super.read();
        System.out.println("Good");
    }

    @Override
    void write() {
        super.write();
        System.out.println("Good");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("Good");
    }
}
