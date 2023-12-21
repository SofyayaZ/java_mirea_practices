package Practice_12.Exercise_1;

import java.awt.*;
class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color,x,y);
        this.height = height;
        this.width = width;
    }
    public void draw (Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }
}
