package Practice_2.Exercise_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c_1 = new Circle();
        Circle c_2 = new Circle(5.0, 3.0, 2.6);
        c_1.setR(4.7);
        c_1.setX(3.907);
        c_1.setY(2.1);
        System.out.println("c_2.r = " + c_2.getR());
        System.out.println("c_1.r = " + c_1.getR());
        c_1.compare(c_2);
    }
}
