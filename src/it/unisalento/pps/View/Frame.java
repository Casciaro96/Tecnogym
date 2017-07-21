package it.unisalento.pps.View;


import it.unisalento.pps.View.ActionListener.ActionDisciplina;
import it.unisalento.pps.View.ActionListener.ActionHome;
import it.unisalento.pps.View.Panel.*;

import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {

    InformazioniPanel informazioniPanel = new InformazioniPanel();
    LoginPanel loginPanel = new LoginPanel();
    SportPanel sportPanel = new SportPanel();
    RegistrazionePanel registrazionePanel = new RegistrazionePanel();
    GestorePanel gestorePanel = new GestorePanel();
    HomePanel homePanel = new HomePanel();

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
        centerPanel.add(registrazionePanel.getRegistrazionePanel());
        centerPanel.add(loginPanel.getLoginPanel());
        centerPanel.add(sportPanel.getSportPanel());
        centerPanel.add(gestorePanel.getGestorePanel());
        centerPanel.add(homePanel.getHomePanel());

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

        ActionHome actionlogin = new ActionHome(this);

        loginPanel.getLoginButton().addActionListener(actionlogin);
        loginPanel.getLoginButton().setActionCommand(ActionHome.LOGIN);

        homePanel.getLoginButton().addActionListener(actionlogin);
        homePanel.getLoginButton().setActionCommand(ActionHome.ACCEDI);

        homePanel.getSinginButton().addActionListener(actionlogin);
        homePanel.getSinginButton().setActionCommand(ActionHome.SINGIN);

        registrazionePanel.getConfermaRegistrazioneButton().addActionListener(actionlogin);
        registrazionePanel.getConfermaRegistrazioneButton().setActionCommand(ActionHome.CONFERMA);

    }

    public GestorePanel getGestorePanel() {
        return gestorePanel;
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

    public RegistrazionePanel getRegistazionePanel() {return registrazionePanel; }

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

