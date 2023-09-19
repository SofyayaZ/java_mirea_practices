package Practice_2.Exercise_2;

import Practice_2.Exercise_2.Ball;
import java.lang.*;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);
        Ball b = new Ball (0,0);
        b.setXY(1, 1);
        System.out.printf("x = %f, y = %f", b.getX(), b.getY());
        b.setX(2);
        b.setY(4);
        System.out.printf("\nx = %f, y = %f", b.getX(), b.getY());
        b.move(-1, -3);
        System.out.printf("\nx = %f, y = %f", b.getX(), b.getY());
        b.move(-1, -1);
        System.out.println("\n" + b.toString());
    }

}
