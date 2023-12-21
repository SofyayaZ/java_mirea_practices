package Practice_2.Exercise_3;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.print("Enter the number of circles: ");
        Scanner inFromUser = new Scanner(System.in);
        int size = inFromUser.nextInt();
        Tester test = new Tester(size);
        double r;
        Point center;
        double x;
        double y;
        for (int i = 0; i < size; i++) {
            center = new Point(0.0, 0.0);
            System.out.print("Enter the radius of the " + (i+1) + " circle: ");
            r = inFromUser.nextDouble();
            System.out.print("Enter the x coordinate of the center of the " + (i+1) + " circle: ");
            x = inFromUser.nextDouble();
            System.out.print("Enter the y coordinate of the center of the " + (i+1) + " circle: ");
            y = inFromUser.nextDouble();
            center = new Point(x,y);
            test.addCircle(new Circle(center, r));
        }
        test.printCircles();

    }
}
