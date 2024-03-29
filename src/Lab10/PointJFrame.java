package Lab10;

// File Name : PointJFrame.java
import javax.swing.*;
import java.awt.*;

public class PointJFrame extends javax.swing.JFrame {
    int size;
    Point p[];

    public PointJFrame() {
        super("Program Inheritance Point");
        String input; // user's input
        // obtain user's choice
        input = JOptionPane.showInputDialog("Enter number of point : ");
        size = Integer.parseInt(input); // convert input to int
        p = new Point[size];
        for (int n = 0; n < p.length; n++) {
            int x = 5 + (int) (Math.random() * 300);
            int y = 5 + (int) (Math.random() * 200);
            p[n] = new Point(x, y);
        }
    } // end method init
      // draw shapes on applet's background

    public void paint(Graphics g) {
        super.paint(g); // call paint method inherited
        for (int n = 0; n < p.length; n++) {
            // set color
            g.setColor(new Color(255, 0, 0));
            // plot point
            g.drawLine(p[n].getX(), p[n].getY(), p[n].getX(), p[n].getY());
        } // end for
          // showStatus("จานวน ํ Object : "+ Point.getCount());
    } // end method paint

    public static void main(String[] args) {
        PointJFrame test = new PointJFrame();
        test.setSize(640, 480);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}