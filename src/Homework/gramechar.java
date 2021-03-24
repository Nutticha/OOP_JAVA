package Homework;
import java.util.Scanner;
public class gramechar {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x ="M",y;

        System.out.println("Welcome to the Game");
        do{
            System.out.print("Ente your Charector : ");
            y = scan.nextLine();
        }while(!y.equals(x));
        System.out.println("You win!");
    }
}