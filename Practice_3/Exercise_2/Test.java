package Practice_3.Exercise_2;

import java.util.Scanner;
import java.util.Random;
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
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            r = rand.nextDouble(100);
            x = rand.nextDouble();
            y = rand.nextDouble();
            center = new Point(x,y);
            test.addCircle(new Circle(center, r));
        }
        test.printCircles();
        test.sortCircles();
        System.out.println("Sorted circles: ");
        test.printCircles();
    }
}
