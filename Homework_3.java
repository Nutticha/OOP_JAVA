
import java.util.Scanner;
public class Homework_3{
    public static void main(String [] args){
        System.out.print("Enter Number : ");
        String strnum = new Scanner(System.in).nextLine();
        System.out.print(strnum.substring(0,1) + " ");
        System.out.print(strnum.substring(1,2) + " ");
        System.out.print(strnum.substring(2,3) + " ");
        System.out.print(strnum.substring(3,strnum.length()));
    }
}
    

