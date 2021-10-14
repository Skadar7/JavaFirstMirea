package ru.mirea.task8.animation;

import javax.swing.*;
import java.util.ArrayList;

public class Animation extends JFrame{
    int width = 1000;
    int height = 900;

    public Animation(){
        super("GUI");
        setLayout(null);
        String[] path = {
                "C:\\Users\\Denis\\Desktop\\Картинки И Фотки\\java\\LEoyqrP5jAI.jpg",
                "C:\\Users\\Denis\\Desktop\\Картинки И Фотки\\java\\QHWu7jT2CyU.jpg"
        };
        System.out.println(System.getProperty("user.dir"));
        JLabel pane1 = new JLabel(new ImageIcon(path[0]));
        JLabel pane2 = new JLabel(new ImageIcon(path[1]));
        ArrayList<JLabel> panes = new ArrayList<JLabel>();
        panes.add(pane1);
        panes.add(pane2);
        setContentPane(pane2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(width, height);
        setVisible(true);
        for (int i = 0; i >= 0; i++){
            setContentPane(panes.get(i % 2));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Animation();
    }
}
