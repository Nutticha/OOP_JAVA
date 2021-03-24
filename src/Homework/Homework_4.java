package Homework;
import java.util.Scanner;
public class Homework_4 {
  static float hours , rate ;
  static float salary;
  public Homework_4() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter hours work : ");
    hours = scan.nextFloat();
    System.out.print("Enter hourly rate : ");
    rate = scan.nextFloat();
    salary = (hours <= 40) ? (hours * rate) : (rate * (1.5f * hours - 20));
  }
  public static void main(String[] args) {   
   Homework_4 s = new Homework_4();
      System.out.println("Employee get salary : " + s.salary);
      }     
}
