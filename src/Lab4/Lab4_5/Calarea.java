package Lab4.Lab4_5;

import java.util.Scanner;
public class Calarea {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int num ;
        float width , length;
        float base,height;
        double result = 0;
        double root = 0.5;
    
        System.out.println( "Rectangle Area or Triangle Area" );
        System.out.print("Select 1.Rectangle or 2.Triangle : ");
        num = scan.nextInt();

        switch(num){

            case 1 : System.out.println( "Rectangle Area" );
            System.out.print( "Enter width : " );
            width = scan.nextFloat();
            System.out.print( "Enter length : " );
            length = scan.nextFloat();

            result = width * length;
            System.out.print( "Rectangle Area : " + result );

            break;


            case 2 : System.out.println( "Triangle Area" );
            System.out.print( "Enter base : " );
            base = scan.nextFloat();
            System.out.print( "Enter height : " );
            height = scan.nextFloat();

            result =  root *  base * height ;
            System.out.print( "Triangle Area : " + result );
            break;


        default : System.out.println( "Error" );
        }




    }
    

}
