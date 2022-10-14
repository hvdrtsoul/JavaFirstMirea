package ru.mirea.task5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TestGif {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 100);


        Image image = Toolkit.getDefaultToolkit().createImage("C:\\Вуз\\Архитектура\\Quartus\\Lab1\\pepe_aynen_aynen.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);

        frame.add(label);
        frame.setVisible(true);
    }
}
