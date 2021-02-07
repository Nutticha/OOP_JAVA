import java.util.Scanner;
public class triskaidekaphobia {
    public static void main(String[] args) {
    int player1 , player2;
    int num1 = 13;

    Scanner scan = new Scanner(System.in);
    System.out.print("Input Your number :  ");
    
    
        while(num1 <= 13){
            do{
  
                System.out.print("Input number 1 , 2 or 3 (player1) :");
                player1 = scan.nextInt();
            
                if(player1 == 1 || player1 == 2 || player1 == 3){
                num1 = num1 - player1;
               
            }
            }while(!(player1 == 1 || player1 == 2 || player1 == 3));
            if(num1 <= 0){
                System.out.println("player1 Win!");
                break;
            }
            do{
                System.out.print("Input number 1 , 2 or 3 (player2) :");
                player2 = scan.nextInt();

                if(player2 == 1 || player2 == 2 || player2 == 3){
                    num1 = num1 - player2;
                }
            }while(!(player2 == 1 || player2 == 2 || player2 == 3));
            if(num1 <= 0){
                System.out.println("player2 Win!");
                break;
            }
        }
    }
}
