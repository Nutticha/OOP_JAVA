package Homework;
import java.util.Random;
import javax.swing.JOptionPane;

public class Homework_array_grade {
   static int jps ,  hw ,  test ,  mid ,  final1 , total;

    
    public static void main(String[] args) {
        
    }

    public void RandomScore(int jps , int hw , int test , int mid , int final1){
        
        
        for(int i = 0 ; i < 40 ; i++){
             jps = (int)(Math.random() * 5);
             
            
             System.out.println(jps);
        }

    }
    

    
}
