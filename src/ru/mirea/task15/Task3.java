package ru.mirea.task15;

import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame {
    JButton btn1 = new JButton("First button");
    JButton btn2 = new JButton("Second button");
    JTextField jta = new JTextField("Write text inside");
    JMenu menuFile = new JMenu("File");
    JMenu menuEdit = new JMenu("Edit");
    JMenu menuHelp = new JMenu("Help");
    JMenuBar m1 = new JMenuBar();
    JMenuItem save = new JMenuItem("Save me");
    JMenuItem exit = new JMenuItem("Exit from here");
    JMenuBar m2 = new JMenuBar();
    JMenuItem copy = new JMenuItem("Copycat");
    JMenuItem cut = new JMenuItem("CutInThePlace");
    JMenuItem paste = new JMenuItem("PasteTomato");
    JMenuBar m3 = new JMenuBar();

    Task3(){
        super("Task3");
        setLayout(new FlowLayout());
        setSize(200, 250);
        add(btn1);
        add(btn2);
        add(jta);
        menuFile.add(save);
        menuFile.add(exit);
        menuEdit.add(copy);
        menuEdit.add(cut);
        menuEdit.add(paste);
        m1.add(menuFile);
        m1.add(menuEdit);
        m1.add(menuHelp);
        setJMenuBar(m1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}
