package Homework;
public class Homework_array_grade {
     public static void main(String[] args) {
         int[] score = new int[7];
         double total = 0;
         String Grade;
         System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("|"+"   Student " + "\t\t" + "mind"+ "\t\t" + "Homework"+ "\t" + "Subtest"+ "\t\t"+ "Midterm"+ "\t\t" + "Final" + "\t\t" + "All Score" + "\t" + "Grade" + "\t"+ "|");
         System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
          for(int i = 1 ; i <= 40 ; i++){
               score[1] = (int)(Math.random() * 5);
               score[2] = (int)(Math.random() * 15);
               score[3] = (int)(Math.random() * 10);
               score[4] = (int)(Math.random() * 35);
               score[5] = (int)(Math.random() * 35);
               total = score[1] + score[2] + score[3] + score[4] + score[5] + score[6];
               
               if(total >= 80){
                    Grade = "A";
               }
               else if(total >= 75){
                    Grade = "B+";
               }
               else if(total >= 70){
                    Grade = "B";
               }
               else if(total >= 65){
                    Grade = "C+";
               }
               else if(total >= 60){
                    Grade = "C";
               }
               else if(total >= 55){
                    Grade = "D+";
               }
               else if(total >= 50){
                    Grade = "D";
               }
               else{
                    Grade = "F";
               }        
          System.out.println("|\t" +i + "\t\t" + score[1] + "\t\t" + score[2]+ "\t\t" + score[3]+ "\t\t" + score[4]+ "\t\t" + score[5]+ "\t\t" + total + "\t\t" + Grade +"\t|");
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");       
    }        
}
