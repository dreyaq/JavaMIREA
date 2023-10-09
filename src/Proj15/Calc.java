package Proj15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {
    JTextField jTextField = new JTextField(15);
    JButton button_9 = new JButton("9");
    JButton button_8 = new JButton("8");
    JButton button_7 = new JButton("7");
    JButton button_6 = new JButton("6");
    JButton button_5 = new JButton("5");
    JButton button_4 = new JButton("4");
    JButton button_3 = new JButton("3");
    JButton button_2 = new JButton("2");
    JButton button_1 = new JButton("1");
    JButton button_0 = new JButton("0");
    JButton button_div = new JButton("/");
    JButton button_mult = new JButton("*");
    JButton button_sub = new JButton("-");
    JButton button_add = new JButton("+");
    JButton button_dot = new JButton(".");
    JButton button_res = new JButton("=");
    Calc(){
        super("Calc");
        setLayout(new FlowLayout());
        setSize(200,200);
        add(jTextField);
        add(button_7);
        add(button_8);
        add(button_9);
        add(button_div);

        add(button_4);
        add(button_5);
        add(button_6);
        add(button_mult);

        add(button_1);
        add(button_2);
        add(button_3);
        add(button_sub);

        add(button_0);
        add(button_dot);
        add(button_res);
        add(button_add);
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"0");
            }
        });
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"1");
            }
        });
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"2");
            }
        });
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"3");
            }
        });
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"4");
            }
        });
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"5");
            }
        });

        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"6");
            }
        });

        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"7");
            }
        });

        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"8");
            }
        });

        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"9");
            }
        });

        button_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"/");
            }
        });

        button_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"-");
            }
        });

        button_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"+");
            }
        });

        button_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"*");
            }
        });
        button_dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+".");
            }
        });

        button_res.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jTextField.getText();
                String[] numbers = ((jTextField.getText()).replaceAll("\\*","p")).replaceAll("\\/","p").replaceAll("\\+","p").replaceAll("\\-","p").split("p");
                double res=0;
                int count=0;
                for (int i=0;i<s.length();i++){
                    switch (s.charAt(i)){
                        case('*'):
                        {
                            if (count==0)
                            {
                                res=Double.parseDouble(numbers[0])*Double.parseDouble(numbers[1]);
                            }
                            else
                            {
                                res*=Double.parseDouble(numbers[count+1]);
                            }
                            count++;
                            break;
                        }
                        case('+'):
                        {
                            if (count==0)
                            {
                                res=Double.parseDouble(numbers[0])+Double.parseDouble(numbers[1]);
                            }
                            else
                            {
                                res+=Double.parseDouble(numbers[count+1]);
                            }
                            count++;
                            break;
                        }
                        case('-'):
                        {
                            if (count==0)
                            {
                                res=Double.parseDouble(numbers[0])-Double.parseDouble(numbers[1]);
                            }
                            else
                            {
                                res-=Double.parseDouble(numbers[count+1]);
                            }
                            count++;
                            break;
                        }
                        case('/'):
                        {
                            if (count==0)
                            {
                                res=Double.parseDouble(numbers[0])/Double.parseDouble(numbers[1]);
                            }
                            else
                            {
                                res/=Double.parseDouble(numbers[count+1]);
                            }
                            count++;
                            break;
                        }
                    }
                }
                jTextField.setText(String.valueOf(res));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calc();
    }
}
