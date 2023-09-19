package Practice_2.Exercise_6;

import java.lang.*;
public class Circle {
    private double x;
    private double y;
    private double r;
    public Circle (double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Circle() {
        this.x = 0.0;
        this.y = 0.0;
        this.r = 1.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getL() {
        return 2*Math.PI*r;
    }
    public double getS() {
        return Math.PI*r*r;
    }

    public void compare(Circle c) {
        if (this.r > c.getR()) {
            System.out.println("The first circle is bigger than the second one");
        }
        else {
            System.out.println("The second circle is bigger than the first one");
        }
    }
}
