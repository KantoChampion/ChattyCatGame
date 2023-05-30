package org.digiplox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chatty Cat - Developed by Vijay, Alan, Arsalan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);

        frame.setVisible(true);
    }
}

class GamePanel extends JPanel implements ActionListener {
    private Timer timer;

    public GamePanel() {
        timer = new Timer(20, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Game logic goes here
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Drawing code goes here
    }
}
