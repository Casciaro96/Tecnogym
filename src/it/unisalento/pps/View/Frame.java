package it.unisalento.pps.View;


import it.unisalento.pps.View.Panel.LoginPanel;
import it.unisalento.pps.View.Panel.SportPanel;
import it.unisalento.pps.View.Panel.AggiungiDisciplina;

import javax.swing.*;
import java.awt.*;



/**
 * Created by SARA on 04/07/2017.
 */
public class Frame extends JFrame{

    LoginPanel loginPanel = new LoginPanel();
    SportPanel sportPanel = new SportPanel();
    AggiungiDisciplina aggiungiDisciplina =new AggiungiDisciplina();
    JPanel mainPanel = new JPanel();
    JPanel primaryPanel = new JPanel();
    JFrame deepFrame = new JFrame();

    public Frame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        primaryPanel.setLayout(new BorderLayout());

        mainPanel.add(aggiungiDisciplina.getAggiungiDisciplina());
        mainPanel.add(loginPanel.getLoginPanel());
        mainPanel.add(sportPanel.getSportPanel());

        primaryPanel.add(mainPanel, BorderLayout.CENTER);

        deepFrame.setContentPane(primaryPanel);
        deepFrame.setVisible(true);

        deepFrame.pack();

    }

}
