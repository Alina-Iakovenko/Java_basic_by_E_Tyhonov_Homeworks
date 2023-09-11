package task2;

public enum Animal {
    DOG(10), CAT(1), MOUSE(0), HORSE(15);
    private int age;
    Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ": age = " + age;
    }
}
