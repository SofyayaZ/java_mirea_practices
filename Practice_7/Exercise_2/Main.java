package Practice_7.Exercise_2;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 2, 1, 1);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
        System.out.println(rectangle.SpeedTest());
    }
}
