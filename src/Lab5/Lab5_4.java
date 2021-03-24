package Lab5;

// File name : Lab5_4.java
import javax.swing.JOptionPane;
public class Lab5_4 {
    public static void main(String[] args) {
        int num , num1;
        String s1 , s2;
        s1 = JOptionPane.showInputDialog("Enter Start number :");
        num = Integer.parseInt(s1);
        s2 = JOptionPane.showInputDialog("Enter End number :");
        num1 = Integer.parseInt(s2);
        int sum = Sumation(num , num1);
        String output = " Sum of " + num +" to " + num1 + " is " + sum;
        JOptionPane.showMessageDialog(null, output, "Sumation", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static int Sumation(int n , int n1) {
        if (n1 > n)
    
            return (n1 + Sumation(n , (n1 - 1)));
        else
            return (n);
        
    }
}
