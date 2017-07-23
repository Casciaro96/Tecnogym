package it.unisalento.pps.View.ActionListener;


import it.unisalento.pps.Business.LoginBusiness;
import it.unisalento.pps.Business.TesseratoBUSINESS;
import it.unisalento.pps.Model.Tesserato;
import it.unisalento.pps.Model.Utente;
import it.unisalento.pps.View.Frame;
import it.unisalento.pps.View.Panel.LoginPanel;
import it.unisalento.pps.View.Panel.SportPanel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.*;

public class ActionHome implements ActionListener {

    public final static String ACCEDI = "apri loginpanel";
    public final static String LOGIN = "loggati";
    public final static String SINGIN = "registrati";
    public final static String CONFERMA = "invio_registrazione";
    Frame frame;

    public ActionHome(Frame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(ACCEDI)) {
            frame.getLoginPanel().getLoginPanel().setVisible(true);
        }

        if (sorgenteEvento.equals(LOGIN)) {
            LoginBusiness login = new LoginBusiness();
            String user = frame.getLoginPanel().getTextUsername().getText();
            String pwd = frame.getLoginPanel().getPasswordField1().getText();


            boolean esito = login.loggati(user, pwd);

            if (esito == true) {
                frame.getSportPanel().setNomeutente(user);
                frame.getLoginPanel().getLoginPanel().setVisible(false);
                frame.getSportPanel().getSportPanel().setVisible(true);
            }
        }


        if (sorgenteEvento.equals(SINGIN)) {
            frame.getLoginPanel().getLoginPanel().setVisible(false);
            frame.getRegistazionePanel().getRegistrazionePanel().setVisible(true);
        }

        if (sorgenteEvento.equals(CONFERMA)) {


            String user = frame.getRegistazionePanel().getTextUsername().getText();
            String pass = frame.getRegistazionePanel().getTextPassword().getText();
            String nome = frame.getRegistazionePanel().getTextNome().getText();
            String cognome = frame.getRegistazionePanel().getTextCognome().getText();
            String email = frame.getRegistazionePanel().getTextEmail().getText();
            int recapito = Integer.parseInt(frame.getRegistazionePanel().getTextRecapito().getText());
            int codicecarta = Integer.parseInt(frame.getRegistazionePanel().getTextCodiceCarta().getText());
            TesseratoBUSINESS t = new TesseratoBUSINESS();

            boolean esito = t.aggiungiTesserato(user, pass, nome, cognome, email, recapito, codicecarta);


        }
    }

}

