package com.company;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Main extends JFrame implements ActionListener {
    JTextField textField;
    String num_tmep = "";
    JLabel label = new JLabel("Enter number");
    JLabel label2 = new JLabel();
    JButton addBtn,subBtn,mulBtn,divBtn,eqBtn;
    JPanel panel = new JPanel();
    JButton Btn0 , Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,dotBtn,clearBtn,backBtn;
    Calc cal  = new Calc();
    int done = 0;

    public Main(){
        Container c = new Container();
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label);
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(160,30));

        c.add(textField);
        label2.setForeground(Color.ORANGE);
        c.add(label2);
        addBtn = new JButton("+");
        addBtn.addActionListener(this);
        c.add(addBtn);

        subBtn = new JButton("-");
        subBtn.addActionListener(this);
        c.add(subBtn);

        mulBtn = new JButton("*");
        mulBtn.addActionListener(this);
        c.add(mulBtn);

        divBtn = new JButton("/");
        divBtn.addActionListener(this);
        c.add(divBtn);

        Btn0 = new JButton("0");
        Btn0.addActionListener(this);
        c.add(Btn0);
        Btn1 = new JButton("1");
        Btn1.addActionListener(this);
        c.add(Btn1);
        Btn2 = new JButton("2");
        Btn2.addActionListener(this);
        c.add(Btn2);
        Btn3 = new JButton("3");
        Btn3.addActionListener(this);
        c.add(Btn3);
        Btn4 = new JButton("4");
        Btn4.addActionListener(this);
        c.add(Btn4);
        Btn5 = new JButton("5");
        Btn5.addActionListener(this);
        c.add(Btn5);
        Btn6 = new JButton("6");
        Btn6.addActionListener(this);
        c.add(Btn6);
        Btn7 = new JButton("7");
        Btn7.addActionListener(this);
        c.add(Btn7);
        Btn8 = new JButton("8");
        Btn8.addActionListener(this);
        c.add(Btn8);
        Btn9 = new JButton("9");
        Btn9.addActionListener(this);
        c.add(Btn9);
        dotBtn = new JButton(".");
        dotBtn.addActionListener(this);
        c.add(dotBtn);
        clearBtn = new JButton("C");
        clearBtn.addActionListener(this);
        c.add(clearBtn);
        backBtn = new JButton("B");
        backBtn.addActionListener(this);
        c.add(backBtn);


        eqBtn = new JButton("=");
        eqBtn.addActionListener(this);
        c.add(eqBtn);







    }


    public void actionPerformed(ActionEvent event) {

        if(event.getSource() == Btn0){
            num_tmep += "0";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn1){
            num_tmep += "1";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn2){
            num_tmep += "2";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn3){
            num_tmep += "3";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn4){
            num_tmep += "4";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn5){
            num_tmep += "5";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn6){
            num_tmep += "6";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn7){
            num_tmep += "7";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn8){
            num_tmep += "8";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == Btn9){
            num_tmep += "9";
            textField.setText(num_tmep);
        }
        else if(event.getSource() == clearBtn){
            num_tmep = "";
            done = 0;
            label2.setText("");
            textField.setText("");
        }
        else if(event.getSource() == dotBtn){
            if(done == 0) {
                num_tmep += ".";
                done = 1;
            }
            textField.setText(num_tmep);

        }
        else if(event.getSource()==backBtn){
            num_tmep = num_tmep.substring(0,num_tmep.length()-1);
            done = 0;
            textField.setText(num_tmep);
        }
        else if(event.getSource() == addBtn){
            float value = Float.parseFloat(textField.getText());

            cal.setValue(value);
            label2.setText(textField.getText() + "+");
            num_tmep = "";
            done = 0;
            textField.setText("");
        }
        else if(event.getSource() == subBtn){
            float value = Float.parseFloat(textField.getText());
            cal.setValue(value);
            label2.setText(textField.getText() + "-");
            num_tmep = "";
            done = 0;
            textField.setText("");
        }
        else if(event.getSource() == mulBtn){
            float value = Float.parseFloat(textField.getText());
            cal.setValue(value);
            label2.setText(textField.getText() + "*");
            num_tmep = "";
            done = 0;
            textField.setText("");
        }
        else if(event.getSource() == divBtn){
            float value = Float.parseFloat(textField.getText());
            cal.setValue(value);
            label2.setText(textField.getText() + "/");
            num_tmep = "";
            done = 0;
            textField.setText("");
        }


        // Equal Button
        else if(event.getSource() == eqBtn){
            float value = Float.parseFloat(textField.getText());
            String x = label2.getText();
            for(int i = 0; i<x.length();i++){
                if(x.charAt(i) == '+'){
                    textField.setText(Float.toString(cal.add(value)));
                }
                else if(x.charAt(i) == '-'){
                    textField.setText(Float.toString(cal.sub(value)));
                }
                else if(x.charAt(i) == '*'){
                    textField.setText(Float.toString(cal.mul(value)));
                }
                else if(x.charAt(i) == '/'){
                    textField.setText(Float.toString(cal.div(value)));
                }
            }
            num_tmep="";
            done = 0;
            label2.setText("");
        }


    }

    public static void main(String[] args) {
	    Main window = new Main();
	    window.setTitle("Calculate");
	    window.setSize(310,320);
	    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    window.setResizable(false);
	    window.setVisible(true);
    }


}
