package it.unisalento.pps.View;


import com.sun.xml.internal.bind.v2.TODO;
import it.unisalento.pps.View.ActionListener.*;
import it.unisalento.pps.View.Panel.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Frame extends JFrame {

    InformazioniPanel informazioniPanel = new InformazioniPanel();
    LoginPanel loginPanel = new LoginPanel();
    SportPanel sportPanel = new SportPanel();
    RegistrazionePanel registrazionePanel = new RegistrazionePanel();
    GestorePanel gestorePanel = new GestorePanel();
    HomePanel homePanel = new HomePanel();
    LivelloPanel livellopanel = new LivelloPanel();
    BasketPanel basketPanel = new BasketPanel();

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
        centerPanel.add(basketPanel.getBasketPanel());

        southPanel.add(informazioniPanel.getInformazioniPanel());
        centerPanel.add(livellopanel.getLivelloPanel());

        primaryPanel.add(centerPanel, BorderLayout.CENTER);
        primaryPanel.add(southPanel, BorderLayout.SOUTH);



        deepFrame.setContentPane(primaryPanel);
        deepFrame.setVisible(true);

        deepFrame.pack();





        //-------------------------action listener----------------------------------------

        ActionDisciplina actiondisciplina = new ActionDisciplina(this);
        aggiungiDisciplina.getConfermaButton().addActionListener(actiondisciplina);
        aggiungiDisciplina.getConfermaButton().setActionCommand(ActionDisciplina.AGGIUNGI);
        aggiungiDisciplina.getBackButton().addActionListener(actiondisciplina);
        aggiungiDisciplina.getBackButton().setActionCommand(ActionDisciplina.BACK);

        ActionHome actionlogin = new ActionHome(this);

        loginPanel.getLoginButton().addActionListener(actionlogin);
        loginPanel.getLoginButton().setActionCommand(ActionHome.LOGIN);

        homePanel.getLoginButton().addActionListener(actionlogin);
        homePanel.getLoginButton().setActionCommand(ActionHome.ACCEDI);

        homePanel.getSinginButton().addActionListener(actionlogin);
        homePanel.getSinginButton().setActionCommand(ActionHome.SINGIN);

        registrazionePanel.getConfermaRegistrazioneButton().addActionListener(actionlogin);
        registrazionePanel.getConfermaRegistrazioneButton().setActionCommand(ActionHome.CONFERMA);

        ActionGestore actiongestore = new ActionGestore(this);
        gestorePanel.getDisciplinaGestoreButton().addActionListener(actiongestore);
        gestorePanel.getDisciplinaGestoreButton().setActionCommand(ActionGestore.AGGIUNGIDISCIPLINA);
        gestorePanel.getLivelloGestoreButton().addActionListener(actiongestore);
        gestorePanel.getLivelloGestoreButton().setActionCommand(ActionGestore.AGGIUNGILIVELLO);
        gestorePanel.getTurnoGestoreButton().addActionListener(actiongestore);
        gestorePanel.getTurnoGestoreButton().setActionCommand(ActionGestore.AGGIUNGITURNO);
        gestorePanel.getIstruttoreGestoreButton().addActionListener(actiongestore);
        gestorePanel.getIstruttoreGestoreButton().setActionCommand(ActionGestore.AGGIUNGIISTRUTTORE);
        gestorePanel.getGestisciIscrizioniButton().addActionListener(actiongestore);
        gestorePanel.getGestisciIscrizioniButton().setActionCommand(ActionGestore.GESTISCIISCRIZIONI);
        gestorePanel.getGestisciNuoviUtentiButton().addActionListener(actiongestore);
        gestorePanel.getGestisciNuoviUtentiButton().setActionCommand(ActionGestore.GESTISCINUOVIUTENTI);
        gestorePanel.getGestisciModificheAllenamentiButton().addActionListener(actiongestore);
        gestorePanel.getGestisciModificheAllenamentiButton().setActionCommand(ActionGestore.GESTISCIMODIFICHE);

        ActionLivello actionlivello = new ActionLivello(this);
        livellopanel.getConfermaButton().addActionListener(actionlivello);
        livellopanel.getConfermaButton().setActionCommand(ActionLivello.CONFERMA);
        livellopanel.getBackButton().addActionListener(actionlivello);
        livellopanel.getBackButton().setActionCommand(ActionLivello.BACK);

        ActionTesserato actiontesserato = new ActionTesserato(this);
        basketPanel.getIscrivitiButton().addActionListener(actiontesserato);
        basketPanel.getIscrivitiButton().setActionCommand(ActionTesserato.ISCRIVITI);
        //TODO aggiungere altri pallavolopanel etc allo stesso modo di sopra

        ActionSport actionsport = new ActionSport(this);

        sportPanel.getBasketButton().addActionListener(actionsport);
        sportPanel.getBasketButton().setActionCommand(ActionSport.BASKET);



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

    public LivelloPanel getLivellopanel() {
        return livellopanel;
    }

    public BasketPanel getBasketPanel() {
        return basketPanel;
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

