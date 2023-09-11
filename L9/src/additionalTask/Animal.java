package additionalTask;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    Boolean tail;

    @Override
    public String toString() {
        return "Animal: " +
                "name: " + name + '\'' +
                ", age: " + age +
                ", tail:" + tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(tail, animal.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
