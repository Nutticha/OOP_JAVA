package Homework;
import java.awt.*;
import java.awt.event.*;

public class Draw extends Frame implements MouseMotionListener{
    Draw(){
        addMouseMotionListener(this);

        setSize(300 , 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(), e.getY(), 20, 20);

    }

    public void mouseMoved(MouseEvent e){}

    public static void main(String[] args) {
         new Draw();
    }

}
