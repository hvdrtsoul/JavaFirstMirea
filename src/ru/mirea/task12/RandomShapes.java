package ru.mirea.task12;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RandomShapes {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 100);

        try {
            BufferedImage image = ImageIO.read(new File(args[0])); // "C:\\Вуз\\Архитектура\\Quartus\\Lab1\\code_1.png"
            ImageIcon imageWidget = new ImageIcon(image);
            JLabel label = new JLabel(imageWidget);
            frame.getContentPane().add(label);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
