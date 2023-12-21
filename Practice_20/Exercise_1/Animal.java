package Practice_20.Exercise_1;

import java.io.Serializable;

public class Animal implements Serializable {
    int age;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
