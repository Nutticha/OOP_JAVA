package Homework;
import javax.swing.JOptionPane;
public class Homework_Lab5_3 {
    static int num;
    static String num1 , star ,Char;

    public static void main(String[] args) {
        do{
            num1 = JOptionPane.showInputDialog("Enter number or endprogram -1 :");
            num = Integer.parseInt(num1);
    
        }while(num != -1);
        
       Char = printChar(num);
       String output = num + " : " + Char ;
        JOptionPane.showMessageDialog(null, output, "Histogram", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static String printChar(int n) {
        
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                star += " * ";
            }
          star += " ";
        }

        return star;

    }

    
}
