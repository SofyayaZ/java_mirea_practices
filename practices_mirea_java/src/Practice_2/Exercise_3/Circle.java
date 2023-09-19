package Practice_2.Exercise_3;

import Practice_2.Exercise_3.Point;
import java.lang.*;
public class Circle {
    private Point center;
    private double r;
    public Circle (Point center, double r) {
        this.center = center;
        this.r = r;
    }
    public Circle() {
        center.setXY(0.0, 0.0);
        r = 1.0;
    }
    public void setCenter(double x, double y) {
        this.center.setXY(x, y);
    };
    public String getCenter() {return "x = " + center.getX() + ", y = " + center.getY(); };
    public double getR() {return r; };
    public void setR(double r) {this.r = r; };
    @Override
    public String toString() {
        return "Circle{ " +
                "x = " + center.getX() +
                ", y = " + center.getY() +
                ", r = " + r + '\'' +
                '}';
    }
}
