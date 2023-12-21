package Practice_24.Exercise_1;

public class VictorianChair implements Chair {
    private int age;
    @Override
    public void sit() {
        System.out.println("Sitting on a Victorian chair.");
    }
    public VictorianChair(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
