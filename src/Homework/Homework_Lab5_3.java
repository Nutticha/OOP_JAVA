package Homework;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Homework_Lab5_3 {
	String input;
	int num = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTextArea outputArea = new JTextArea();
		Homework_Lab5_3 load = new Homework_Lab5_3();
		String output ;
		while(load.num != -1){
			load.input = JOptionPane.showInputDialog(null,"Enter number : ");
			load.num = Integer.parseInt(load.input);
			output = printChar(load.num);
			if(load.num>=0){
				outputArea.append(load.num + " : " + output + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, outputArea,"Histogram",JOptionPane.INFORMATION_MESSAGE);
	}
	public static String printChar(int num){
		String s ="";
		for(int i=1;i<=num;i++){
				s+="*";
		}
		return s;
	}
}