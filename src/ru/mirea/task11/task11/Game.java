package ru.mirea.task11.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {
    public static void main(String[] args) {
        new ResGame().setVisible(true);
    }

}

class ResGame extends JFrame {
    Random rnd = new Random();
    int mdig = rnd.nextInt((20)+1);
    int cnt = 0;

    JButton buttonM = new JButton("Enter");
    JTextArea jta1 = new JTextArea(10,25);

    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    JLabel textScore = new JLabel("Введите число");
    JLabel textScore1 = new JLabel("111");

    public ResGame() {
        setLayout(null);
        buttonM.setBounds(120, 300, 150, 40);
        jta1.setBounds(30, 100, 320,20);
        buttonM.setFont(fnt);

        textScore.setBounds(125, 20, 250, 100);
        textScore.setFont(fnt);
        textScore1.setBounds(50, 150, 250,100);
        textScore1.setFont(fnt);
        add(jta1);
        add(buttonM);
        add(textScore);
        add(textScore1);

        buttonM.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int enteredData = Integer.valueOf(jta1.getText());
                if (cnt == 3) {
                    textScore1.setText("Число попыток закончилось!");
                    return;
                }
                if (enteredData > mdig) {
                    textScore1.setText("Загаданное число меньше");
                }
                else if (enteredData < mdig){
                    textScore1.setText("Загаданное число больше");
                }
                else {
                    textScore1.setText("Вы угадали!");
                }
                ++cnt;

            }
        });
        setSize(400, 400);
    }
}
