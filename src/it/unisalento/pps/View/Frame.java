package it.unisalento.pps.View;


import it.unisalento.pps.View.ActionListener.ActionDisciplina;
import it.unisalento.pps.View.ActionListener.ActionLogin;
import it.unisalento.pps.View.Panel.InformazioniPanel;
import it.unisalento.pps.View.Panel.LoginPanel;
import it.unisalento.pps.View.Panel.SportPanel;
import it.unisalento.pps.View.Panel.AggiungiDisciplina;

import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {

    InformazioniPanel informazioniPanel = new InformazioniPanel();
    LoginPanel loginPanel = new LoginPanel();
    SportPanel sportPanel = new SportPanel();
    AggiungiDisciplina aggiungiDisciplina = new AggiungiDisciplina();
    JPanel centerPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel primaryPanel = new JPanel();
    JFrame deepFrame = new JFrame();

    public Frame() {
        Dimension dim = new Dimension(1200, 600);
        deepFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        deepFrame.setMinimumSize(dim);
        primaryPanel.setLayout(new BorderLayout());

        informazioniPanel.info();

        centerPanel.add(aggiungiDisciplina.getAggiungiDisciplina());
        centerPanel.add(loginPanel.getLoginPanel());
        centerPanel.add(sportPanel.getSportPanel());

        southPanel.add(informazioniPanel.getInformazioniPanel());

        primaryPanel.add(centerPanel, BorderLayout.CENTER);
        primaryPanel.add(southPanel, BorderLayout.SOUTH);



        deepFrame.setContentPane(primaryPanel);
        deepFrame.setVisible(true);

        deepFrame.pack();



        //-------------------------action listener----------------------------------------

        ActionDisciplina actiondisciplina = new ActionDisciplina(this);
        aggiungiDisciplina.getConfermaButton().addActionListener(actiondisciplina);
        aggiungiDisciplina.getConfermaButton().setActionCommand(ActionDisciplina.AGGIUNGI);

        ActionLogin actionlogin = new ActionLogin(this);
        loginPanel.getLoginButton().addActionListener(actionlogin);
        loginPanel.getLoginButton().setActionCommand(ActionLogin.LOGIN);

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

    public JPanel getcenterPanel() {
        return centerPanel;
    }

    public JPanel getPrimaryPanel() {
        return primaryPanel;
    }

    public JFrame getDeepFrame() {
        return deepFrame;
    }




}

