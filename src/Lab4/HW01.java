package Lab4;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args){
        final int PER_LINE = 5;
        int start, end, mult, count = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter start number : ");
        start = scan.nextInt();

        System.out.print("Enter an upper limit : ");
        end = scan.nextInt();
        System.out.println();
        
        if(start < end){
            for(int i = start; i <= end; i++){
                if(i % 3 == 0 && i % 5 ==0){
                    System.out.println(i + "\t");
                    count++ ;
                }
                if (count % PER_LINE == 0)
                    System.out.println();
        }
        }
        
    }
}
