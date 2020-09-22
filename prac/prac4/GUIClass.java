package com.company;

import javax.swing.*;
import java.awt.*;

public class GUIClass extends JFrame {
    JButton madridButton = new JButton("Real Madrid");
    JButton milanButton = new JButton("AC Milan");
    static int milanScore = 0;
    static int madridScore = 0;
    static String lastScorerTeam = "N/A", winner = "DRAW";
    GUIClass(){
        super("Madrid vs Milan");
        setLocation(200,200);
        setLayout(new GridLayout(2,3));
        JLabel resultLabel = new JLabel("Result: " + madridScore +" X " + milanScore );
        JLabel winnerLabel = new JLabel("Winner: " + winner);
        JLabel lastScorerLabel = new JLabel("Last Scorer: " + lastScorerTeam);
        madridButton.addActionListener(e -> {
            madridScore++;
            lastScorerTeam = "Real Madrid";
            resultLabel.setText("Result: " + madridScore + " X " + milanScore );
            lastScorerLabel.setText("Last Scorer: " + lastScorerTeam);
            if(madridScore > milanScore){
                winner = "Real Madrid";
                winnerLabel.setText("Winner: " + winner);
            } else if(milanScore == madridScore) {
                winner = "DRAW";
                winnerLabel.setText("Winner: " + winner);
            }
        });
        milanButton.addActionListener(e -> {
            milanScore++;
            lastScorerTeam = "AC Milan";
            resultLabel.setText("Result: " + madridScore + " X " + milanScore);
            lastScorerLabel.setText("Last Scorer: " + lastScorerTeam);
            if(milanScore > madridScore){
                winner = "AC Milan";
                winnerLabel.setText("Winner: " + winner);
            } else if(milanScore == madridScore) {
                winner = "DRAW";
                winnerLabel.setText("Winner: " + winner);
            }
        });
        add(madridButton);
        add(resultLabel);
        add(milanButton);
        add(lastScorerLabel);
        add(winnerLabel);
        setSize(500,400);
        setVisible(true);
    }
}
