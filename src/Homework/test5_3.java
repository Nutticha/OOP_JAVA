package Homework;
import javax.swing.JOptionPane;
public class test5_3 {
    public static void main(String[] args) {
        int value;
        String output = "";
        int num , num1;
        String s1, s2;
         

        s1 = JOptionPane.showInputDialog("Enter start number: ");
        s2 = JOptionPane.showInputDialog("Enter end number :");

        num = Integer.parseInt(s1);
        num1 = Integer.parseInt(s2);
        // loop 20 times
        for (int counter = 1; counter <= 20; counter++) {
            
            value = num + (int)(Math.random() * ((num1 - num) + 1));
            output += value + " "; // append value to output
            // if counter divisible by 5, append newline to String output
            if (counter % 5 == 0)
                output += "\n";
        } // end for
        JOptionPane.showMessageDialog(null, output, "20 Random Numbers from" + num + "to" + num1, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); // terminate application
    }
}
