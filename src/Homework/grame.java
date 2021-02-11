package Homework;

import java.util.Scanner;
public class grame {
    public static void main(String[] args) {
        String grame = "m";
        String ch;
        Scanner scan = new Scanner(System.in);

        System.out.println("Alphabet game !!");

        do{
            System.out.print("Input Your alphabet :  ");
            ch = scan.next();
            if(ch != grame){
                System.out.println("You guess  new");
            }
            else if(ch == grame){
                System.out.println("You win!");
            }

        

        }while(ch != "-1");
        
        System.out.println("End grame!");
    }
    
}
