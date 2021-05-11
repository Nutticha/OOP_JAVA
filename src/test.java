import java.util.Scanner;
public class test {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float score;
        String Grade;

        System.out.println("******** Grade Calculation ********");
        System.out.print("Enter score : ");
        score = scan.nextFloat();

        if(score >= 80){
            Grade = "A";
       }
       else if(score >= 75){
            Grade = "B+";
       }
       else if(score >= 70){
            Grade = "B";
       }
       else if(score >= 65){
            Grade = "C+";
       }
       else if(score >= 60){
            Grade = "C";
       }
       else if(score >= 55){
            Grade = "D+";
       }
       else if(score >= 50){
            Grade = "D";
       }
       else{
            Grade = "F";
       }        

       System.out.println("Score :" + score + " Grade : " + Grade);
    }
    
}
