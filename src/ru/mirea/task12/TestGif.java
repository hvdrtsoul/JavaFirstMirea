package ru.mirea.task12;

import javax.swing.*;
import java.awt.*;

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
