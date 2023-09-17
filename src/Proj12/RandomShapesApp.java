package Proj12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesApp extends JPanel {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private final Shape[] shapes;

    public RandomShapesApp() {
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int widthOrRadius = random.nextInt(50) + 20;
            int height = random.nextInt(50) + 20;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                shapes[i] = new Circle(x, y, widthOrRadius, color);
            } else {
                shapes[i] = new Rectangle(x, y, widthOrRadius, height, color);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(new RandomShapesApp());
        frame.setVisible(true);
    }
}