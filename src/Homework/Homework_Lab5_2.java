package Homework;
import javax.swing.JOptionPane;
public class Homework_Lab5_2 {
    String input;
	long number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework_Lab5_2 load = new Homework_Lab5_2();
		load.input = JOptionPane.showInputDialog(null,"Enter number : ");
		load.number = Long.parseLong(load.input);
		JOptionPane.showMessageDialog(null,"Number digit of "+load.number+" is " + countDigit(load.number));
	}
	public static int countDigit(long number){
		if(number == 0){
			return 0;
		}
		return 1+ countDigit(number / 10);
	}

    
}
