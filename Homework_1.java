import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float f, c;
        System.out.println("******** Degree calculation ********");
        System.out.print("Enter Celsius : ");
        c = scan.nextFloat();
        
        f =(9/5)*c+32;
        System.out.println("Fahrenheit : " + f);
        }
    
}
