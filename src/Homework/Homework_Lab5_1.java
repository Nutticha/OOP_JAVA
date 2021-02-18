package Homework;
import javax.swing.JOptionPane;
public class Homework_Lab5_1 {
  static double num , score , total , total1 , ave , ave1;
  static String num1 ,   score1;

  public static void main(String[] args) {
   
    num1 = JOptionPane.showInputDialog("Enter number of score :");
    num = Double.parseDouble(num1); 
    ave =  getScore(num);
    ave1 = average(num , ave);
    String output = " Average score is " + ave1 ;
        JOptionPane.showMessageDialog(null, output, "Sumation", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    
  }

  public static double getScore(double n){
     for(int i = 1 ; i <= n ; i++ ){
         score1 = JOptionPane.showInputDialog("Enter score " + i +" :");
         score = Double.parseDouble(score1);
         total += score ;
         
     }
     return (total);
  }

  public static double average(double n , double t  ){
      
    total1 = t/n;
    return(total1);

 }

 
    
}
