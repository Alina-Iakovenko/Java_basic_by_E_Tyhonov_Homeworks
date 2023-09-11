package task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom[] a = new ClassRoom[4];
        a[0] = new ClassRoom(new ExcelentPupil());
        a[1] = new ClassRoom(new GoodPupil());
        a[2] = new ClassRoom(new Pupil());
        a[3] = new ClassRoom(new BadPupil());

//        Pupil c = new Pupil();
//        c.relax();
//
//        Pupil d = new ExcelentPupil();
//        d.study();

    }
}
