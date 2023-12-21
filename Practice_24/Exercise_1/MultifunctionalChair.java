package Practice_24.Exercise_1;

public class MultifunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on multifunctional chair.");
    }
    public int sum(int a, int b) {
        return a+b;
    }
}
