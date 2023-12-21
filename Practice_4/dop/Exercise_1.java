package Practice_4.dop;

class Shape {
    public String getType() {
        return "Shape";
    }
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }
    @Override
    public String toString() {
        return "This is " + getType();
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String getType() {
        return "Circle";
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public String getType() {
        return "Rectangle";
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    @Override
    public String getType() {
        return "Square";
    }
}

public class Exercise_1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(5);

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimetr: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetr: " + rectangle.getPerimeter());

        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimetr: " + square.getPerimeter());
    }
}