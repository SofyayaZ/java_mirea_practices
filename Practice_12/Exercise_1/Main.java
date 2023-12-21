package Practice_12.Exercise_1;


import java.util.Random;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {

    public Main() {
        setTitle("Random Shapes");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void paint(Graphics g) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(800);
            int y = random.nextInt(700);
            int width = random.nextInt(100);
            int height = random.nextInt(100);
            int radius = random.nextInt(50);

            Shape shape;
            if (random.nextBoolean()) {
                shape = new Rectangle(color, x, y, width, height);
            } else {
                shape = new Circle(color, x, y, radius);
            }
            shape.draw(g);
        }
    }
    public static void main (String [] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}


