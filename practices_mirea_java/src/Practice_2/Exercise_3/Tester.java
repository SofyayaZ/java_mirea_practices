package Practice_2.Exercise_3;

import java.lang.*;
public class Tester {
    private int size;
    private Circle[] circles;

    public Tester(int size){
        this.size = 0;
        circles = new Circle[size];
    }
    public void addCircle(Circle circle) {
        if (size < circles.length) {
            circles[size++] = circle;
        }
    }
    public void printCircles() {
        for (int i = 0; i < size; i++) {
            System.out.println("circle " + (i+1) + "{ " + circles[i].toString() + "}");
        }
    }
}
