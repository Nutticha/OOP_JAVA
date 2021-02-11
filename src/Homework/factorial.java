package Homework;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int num = 1;
        int count = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input nember :  ");
        num = scan.nextInt();

        for(int i = 1 ; i <= num ; i++){
              count *= i;
              if(i == 1){
                  System.out.print(i);
              }
              else{
                  System.out.print("*" + i);
              }

              
        }
        System.out.println(" : " + count );


    }
}
