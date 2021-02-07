package Lab4;
import java.util.Scanner;
public class HW03 {
    public static void main(String[] args) {
        double num;
        Scanner scan = new Scanner(System.in);
        

        do{
            System.out.print("Enter  positive number or -1 to Quit : ");
            num = scan.nextInt();

            if(num / 2 == 0){
                System.out.println("Number " + num + " is prime number");
            }
            else{
                System.out.println("Number " + num + " is not prime number");
            }

        }while(num != -1);
    }
}
