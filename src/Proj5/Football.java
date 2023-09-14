package Proj5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Football {

    static JButton AC_Milan = new JButton("AC Milan");
    static JButton Real_Madrid = new JButton("Real Madrid");

    static JPanel panel = new JPanel();

    static JLabel Score = new JLabel("Result: 0 X 0");
    static JLabel Last_Team = new JLabel("Last Scorer: N/A");
    static JLabel Winner = new JLabel("Winner: DRAW");

    static Box box = Box.createVerticalBox();
    public static class MilanButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String[] s1 = Score.getText().split(" ");
            String[] s2 = Last_Team.getText().split(" ");
            Score.setText(s1[0]+" "+(Integer.parseInt(s1[1])+1)+" " + s1[2] + " "+ s1[3]);
            Last_Team.setText(s2[0]+" "+s2[1]+" AC Milan");
            if (Integer.parseInt(s1[1])+1>Integer.parseInt(s1[3]))
            {
                Winner.setText("Winner: AC Milan");
            }
            else if (Integer.parseInt(s1[1])+1==Integer.parseInt(s1[3]))
            {
                Winner.setText("Winner: DRAW");
            }
            else Winner.setText("Winner: RealMadrid");
        }
    }
    public static class MadridButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String[] s1 = Score.getText().split(" ");
            String[] s2 = Last_Team.getText().split(" ");
            Score.setText(s1[0]+" "+s1[1]+" " + s1[2] + " "+ (Integer.parseInt(s1[3])+1));
            Last_Team.setText(s2[0]+" "+s2[1]+" RealMadrid");
            if (Integer.parseInt(s1[1])>Integer.parseInt(s1[3])+1)
            {
                Winner.setText("Winner: AC Milan");
            }
            else if (Integer.parseInt(s1[1])==Integer.parseInt(s1[3])+1)
            {
                Winner.setText("Winner: DRAW");
            }
            else Winner.setText("Winner: RealMadrid");
        }
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(10,10);
        panel.add(AC_Milan);
        panel.add(Real_Madrid);
        box.add(panel);
        box.add(Score);
        box.add(Last_Team);
        box.add(Winner);
        frame.setSize(500,500);
        frame.add(box);
        frame.setVisible(true);

        AC_Milan.addActionListener(new MilanButtonActionListener());
        Real_Madrid.addActionListener(new MadridButtonActionListener());
    }
}

