import java.util.Scanner;
public class Homework_4 {
    float salary;
    
    public Home(float hours, float rate) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter hours work : ");
        hours = scan.nextFloat();
        System.out.print("Enter hourly rate : ");
        rate = scan.nextFloat();
}
     public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter hours work : ");
        hours = scan.nextFloat();
        System.out.print("Enter hourly rate : ");
        rate = scan.nextFloat();*/
        Homework_4 home = new Home( );

        salary = (hours <= 40) ? (hours*rate) :
        (rate * (1.5f * hours - 20));
        System.out.println("Employee get salary : " + salary);
        }
}
