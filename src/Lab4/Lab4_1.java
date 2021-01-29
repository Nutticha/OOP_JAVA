package Lab4;

// File Name : Lab4_1.java
import java.util.Scanner;



public class Lab4_1 {
    int score;
    String grade;
    Scanner scan = new Scanner(System.in);
    
    public Lab4_1(){
        score = 0;
        grade = "A";
    }

    public static void Calcgrade(int score){
        Lab4_1 load = new Lab4_1();

        if ((score >= 0) && (score <= 100)) {
            
            if (score >= 80){
                load.grade = "A";
            }
                
            else if (score >= 75){
                load.grade = "B+";
            }
               
            else if (score >= 70){
                load.grade = "B";
            }
                
            else if (score >= 65){
                load.grade = "C+";
            }
                
            else if (score >= 60){
                load.grade = "C";
            }
                
            else if (score >= 55){
                load.grade = "D+";
            }
                
            else if (score >= 50){
                load.grade = "D";
            }
                
            else{
                load.grade = "F";
            }
                
            System.out.println("Student gradde is " + load.grade); 
            
        } else {
            System.out.println("Invalid student score.");
        }
        
    }

    public static void main(String[] args) {
        
        Lab4_1 load = new Lab4_1();
        System.out.println("Program Calculate grade.");
        System.out.print("Enter student score : ");
        load.score = load.scan.nextInt();
        load.Calcgrade(load.score);
        System.out.println("End Program.");
        
    }
}