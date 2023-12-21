package Practice_2.Exercise_3;

public class Circle {
    private Point center;
    private double r;
    public Circle (Point center, double r) {
        this.center = center;
        this.r = r;
    }
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
