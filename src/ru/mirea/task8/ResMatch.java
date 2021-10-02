package ru.mirea.task8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResMatch {
    public static void main(String[] arg) {
        new FootballMatch().setVisible(true);
    }
}


class FootballMatch extends JFrame {
    private int milan = 0;
    private int real = 0;
    JButton buttonM = new JButton("AC Milan");
    JButton buttonR = new JButton("Real Madrid");

    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    JLabel textScore = new JLabel("Result: " + milan + " X " + real);
    JLabel textLast = new JLabel("Last Scorer: N/A");
    JLabel textWinner = new JLabel("Winner: DRAW");

    public FootballMatch() {
        setLayout(null);
        buttonM.setBounds(15, 300, 150, 40);
        buttonR.setBounds(220, 300, 150, 40);

        buttonM.setFont(fnt);
        buttonR.setFont(fnt);

        buttonM.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                milan++;
                textScore.setText("Result: " + milan + " X " + real);
                textLast.setText("Last Scorer: AC Milan");
                if(milan > real) { textWinner.setText("Winner: AC Milan"); }
                else if (milan == real) { textWinner.setText("Winner: DRAW"); }
                else { textWinner.setText("Winner: Real Madrid"); }
            }
        });
        buttonR.addMouseListener(new MouseAdapter() {
        @Override
            public void mousePressed(MouseEvent event) {
            real++;
            textScore.setText("Result: " + milan + " X " + real);
            textLast.setText("Last Scorer: Real Madrid");
            if(milan > real) { textWinner.setText("Winner: AC Milan"); }
            else if (milan == real) { textWinner.setText("Winner: DRAW"); }
            else { textWinner.setText("Winner: Real Madrid"); }
        }
        });

        textScore.setBounds(90, 20, 150, 100);
        textLast.setBounds(90, 50, 300, 100);
        textWinner.setBounds(90, 80, 300, 100);

        textScore.setFont(fnt);
        textLast.setFont(fnt);
        textWinner.setFont(fnt);

        add(buttonM);
        add(buttonR);
        add(textScore);
        add(textLast);
        add(textWinner);
        setSize(400, 400);
    }
}