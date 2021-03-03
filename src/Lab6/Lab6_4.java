package Lab6;



// File name : Lab6_4.java
import javax.swing.JOptionPane;


public class Lab6_4 {
    public static void main(String[] args) {
        int data[][];
        int row, col;
        row = Integer.parseInt(JOptionPane.showInputDialog("Enter number row : "));
        col = Integer.parseInt(JOptionPane.showInputDialog("Enter number column : "));
        data = new int[row][col];
        setData(data);
        String output = displayData(data);
        
        JOptionPane.showMessageDialog(null, output , "displayData", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
    }

    public static void setData(int data[][]) {
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data[i].length; j++)
                data[i][j] = rnd(10, 20);
    }

    public static String displayData(int data[][]) {
        String output = "";
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++){
               output +=  data[i][j] + " ";
              
                
            }
                /*System.out.print(data[i][j] + " ");
            System.out.println();*/
            
        }
        return output;
    }

    

    public static int rnd(int st, int ed) {
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset));
    }
}
