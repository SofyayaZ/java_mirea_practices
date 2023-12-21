package Practice_12.Exercise_1;


import java.awt.*;
class Circle extends Shape {
    private int r;
    public Circle (Color color, int x, int y, int r) {
        super (color, x, y);
        this.r = r;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,r,r);
    }
}

