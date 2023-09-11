package task2;

public class BadPupil extends Pupil {
    @Override
    void study() {
        super.study();
        System.out.println("Bad");
    }

    @Override
    void read() {
        super.read();
        System.out.println("Bad");
    }

    @Override
    void write() {
        super.write();
        System.out.println("Bad");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("Bad");
    }
}
