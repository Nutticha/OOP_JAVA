package Lab4;

// File Name : Lab4_2.java
import java.util.Scanner;

public class Lab4_2 {
    static int num1, num2;
    static double result;
    static char operator;
    static boolean done;
    static String message;

    public Lab4_2(){
        num1 = 0;
        num2 = 0;
        result = 0;
        operator = 'x';
        done = true;
        message = " ";

    }

    public static void input(){
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Enter first value : ");
        num1 = scan.nextInt();
        System.out.print("Enter second value : ");
        num2 = scan.nextInt();
        System.out.print("Enter operator(+, -, *, /, %) : ");
        operator = scan.next().charAt(0);
        Calc(num1, num2, operator);
    }

    public static void Calc(int num1 , int num2 , char operator){
        switch (operator) {
            case '+':
                result = num1 + num2;
                message = "result = num1 + num2 = ";
                break;
            case '-':
                result = num1 - num2;
                message = "result = num1 - num2 = ";
                break;
            case '*':
                result = num1 * num2;
                message = "result = num1 * num2 = ";
                break;
            case '/':
                result = (double) num1 / num2;
                message = "result = num1 / num2 = ";
                break;
            case '%':
                result = num1 % num2;
                message = "result = num1 % num2 = ";
                break;
            default:
                done = false;
        }

    }

    public static void show_data(boolean done){
        if (done){
            System.out.println(message + result);
        }
        
    else{
        System.out.println("Invalid Operator.");
    }
        
    }
    public static void main(String[] args) {
        Lab4_2 load = new Lab4_2();
        System.out.println("Program Calculator.");
        load.input();
        load.show_data(done);
        
        
        
    }
}
