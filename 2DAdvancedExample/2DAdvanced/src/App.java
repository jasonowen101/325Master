import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Simple2DGraphicsDemo {

    private static final int RECTANGLE = 0;
    private static final int OVAL = 1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("2D Graphics Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());

            JPanel canvas = new JPanel() {
                private final List<ShapeInfo> shapes = new ArrayList<>();

                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;

                    for (ShapeInfo shape : shapes) {
                        g2d.setColor(shape.color);

                        if (shape.shapeType == RECTANGLE) {
                            g2d.fillRect(shape.x, shape.y, shape.width, shape.height);
                        } else if (shape.shapeType == OVAL) {
                            g2d.fillOval(shape.x, shape.y, shape.width, shape.height);
                        }
                    }
                }

                private void addRandomShape(int shapeType) {
                    int width = (int) (Math.random() * 100) + 50;
                    int height = (int) (Math.random() * 100) + 50;
                    int x = (int) (Math.random() * (getWidth() - width));
                    int y = (int) (Math.random() * (getHeight() - height));
                    Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

                    shapes.add(new ShapeInfo(shapeType, x, y, width, height, color));
                }

                {
                    JComboBox<String> shapeComboBox = new JComboBox<>(new String[]{"Rectangle", "Oval"});
                    JButton drawButton = new JButton("Draw Shape");

                    shapeComboBox.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Handle shape selection if needed
                        }
                    });

                    drawButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int selectedShape = shapeComboBox.getSelectedIndex();
                            addRandomShape(selectedShape);
                            repaint();
                        }
                    });

                    JPanel controlPanel = new JPanel();
                    controlPanel.add(new JLabel("Select Shape:"));
                    controlPanel.add(shapeComboBox);
                    controlPanel.add(drawButton);

                    frame.add(canvas, BorderLayout.CENTER);
                    frame.add(controlPanel, BorderLayout.SOUTH);
                    frame.setVisible(true);
                }
            });
        });
    }

    private static class ShapeInfo {
        private int shapeType;
        private int x, y, width, height;
        private Color color;

        // Constructor
        public ShapeInfo(int shapeType, int x, int y, int width, int height, Color color) {
            this.shapeType = shapeType;
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;

            // Now, you've used the constructor locally
            // You can perform actions with the shape object
            System.out.println("Created a shape of type " + shapeType +
                    " at position (" + x + ", " + y + ") with dimensions " + width + "x" + height +
                    " and color " + color);
        }
    }
}
