package ru.mirea.task5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGui {

    static int milanScore = 0;
    static int madridScore = 0;

    public static void main(String[] args) {
        int counter = 0;
        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 100);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(600, 100));
        JLabel resultText = new JLabel("Result: 0 X 0");
        JLabel lastScorerText = new JLabel("Last Scorer: N/A");
        JLabel winnerText = new JLabel("Winner: DRAW");
        JButton milanButton = new JButton("AC Milan");
        JButton realButton = new JButton("Real Madrid");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstGui.milanScore += 1;
                resultText.setText(String.format("Result: %d X % d", FirstGui.milanScore, FirstGui.madridScore));
                lastScorerText.setText("Last Scorer: AC Milan");

                if(FirstGui.milanScore > FirstGui.madridScore)
                {
                    winnerText.setText("Winner: AC Milan");
                }
                else if(FirstGui.milanScore < FirstGui.madridScore)
                {
                    winnerText.setText("Winner: Real Madrid");
                }
                else
                {
                    winnerText.setText("Winner: DRAW");
                }
            }
        });

        realButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstGui.madridScore += 1;

                resultText.setText(String.format("Result: %d X % d", FirstGui.milanScore, FirstGui.madridScore));
                lastScorerText.setText("Last Scorer: Real Madrid");

                if(FirstGui.milanScore > FirstGui.madridScore)
                {
                    winnerText.setText("Winner: AC Milan");
                }
                else if(FirstGui.milanScore < FirstGui.madridScore)
                {
                    winnerText.setText("Winner: Real Madrid");
                }
                else
                {
                    winnerText.setText("Winner: DRAW");
                }
            }
        });

        panel.add(milanButton);
        panel.add(realButton);
        panel.add(resultText);
        panel.add(lastScorerText);
        panel.add(winnerText);

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.pack();
        frame.setVisible(true);
    }

}
