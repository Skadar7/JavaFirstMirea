package ru.mirea.task8.img;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Img {
    public static void main(String[] args) throws IOException{
        String imagePath = "C:\\Users\\Denis\\Desktop\\Картинки И Фотки\\pja8ci0dav4.yPLoy.jpg";
        BufferedImage myPicture = ImageIO.read(new File(imagePath));

        JLabel picLabel = new JLabel(new ImageIcon(myPicture));

        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);

        JFrame f = new JFrame();
        f.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
        f.add(jPanel);
        f.setVisible(true);
    }
}
