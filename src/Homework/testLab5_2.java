package Homework;
import javax.swing.JOptionPane;
public class testLab5_2 {
    public static void main(String[] args) {

        testLab5_2 test = new testLab5_2();
        double number1, number2, number3 , number4 , number5;
        String s1, s2, s3 , s4 , s5;
        String output;
        s1 = JOptionPane.showInputDialog("Enter first floating-point value");
        s2 = JOptionPane.showInputDialog("Enter second floating-point value");
        s3 = JOptionPane.showInputDialog("Enter third floating-point value");
        s4 = JOptionPane.showInputDialog("Enter third floating-point value");
        s5 = JOptionPane.showInputDialog("Enter third floating-point value");
        // convert user input to double values
        number1 = Double.parseDouble(s1);
        number2 = Double.parseDouble(s2);
        number3 = Double.parseDouble(s3);
        number4 = Double.parseDouble(s4);
        number5 = Double.parseDouble(s5);
        double max = test.maximum(number1, number2, number3 , number4 , number5);
        double min = test.minimum(number1, number2, number3 , number4 , number5);
        output = "number1: " + number1 + "\nnumber2: " + number2;
        output += "\nnumber3: " + number3 + "\nnumber4: " + number4;
        output += "\nnumber5: " + number5 + "\nmaximum is: " + max;
        output += "\nminimum is: " + min;
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }

    public  double maximum(double x, double y, double z , double a , double b) {
        return Math.max(x, Math.max(y, (Math.max(z,(Math.max(a, b))))));
    } // end method maximum

    public  double minimum(double x, double y, double z , double a , double b) {
        return Math.min(x, Math.min(y, (Math.min(z, (Math.min(a, b))))));
    } // end method minimum
}

