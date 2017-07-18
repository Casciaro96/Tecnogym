package it.unisalento.pps.View;


import it.unisalento.pps.View.ActionListener.ActionDisciplina;
import it.unisalento.pps.View.Panel.LoginPanel;
import it.unisalento.pps.View.Panel.SportPanel;
import it.unisalento.pps.View.Panel.AggiungiDisciplina;

import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {

    LoginPanel loginPanel = new LoginPanel();
    SportPanel sportPanel = new SportPanel();
    AggiungiDisciplina aggiungiDisciplina = new AggiungiDisciplina();
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

        //-------------------------action listener----------------------------------------

        ActionDisciplina actiondisciplina = new ActionDisciplina(this);

        aggiungiDisciplina.getConfermaButton().addActionListener(actiondisciplina);
        aggiungiDisciplina.getConfermaButton().setActionCommand(ActionDisciplina.AGGIUNGI);

    }


    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    public SportPanel getSportPanel() {
        return sportPanel;
    }

    public AggiungiDisciplina getAggiungiDisciplina() {
        return aggiungiDisciplina;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JPanel getPrimaryPanel() {
        return primaryPanel;
    }

    public JFrame getDeepFrame() {
        return deepFrame;
    }




}

