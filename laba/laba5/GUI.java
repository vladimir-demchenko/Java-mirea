package com.company.laba5;

import javax.swing.*;

public class GUI extends JFrame {
    GUI(String src){
        super("Panda");
        JPanel panel = new JPanel();
        JLabel imgLabel = new JLabel();
        ImageIcon img = new ImageIcon(src);
        setSize(500,500);
        imgLabel.setIcon(new ImageIcon(img.getImage().getScaledInstance(500,500,img.getImage().SCALE_DEFAULT)));
        panel.add(imgLabel);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
