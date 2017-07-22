package it.unisalento.pps.View.Panel;


import javax.swing.*;

public class GestorePanel {
    private JPanel gestorePanel;
    private JButton disciplinaGestoreButton;
    private JButton livelloGestoreButton;
    private JButton turnoGestoreButton;
    private JButton istruttoreGestoreButton;
    private JButton gestisciIscrizioniButton;
    private JButton gestisciNuoviUtentiButton;
    private JButton gestisciModificheAllenamentiButton;


    public GestorePanel() {
        gestorePanel.getUI();
        gestorePanel.setVisible(true);
    }


    public JPanel getGestorePanel() {
        return gestorePanel;
    }

    public JButton getDisciplinaGestoreButton() {
        return disciplinaGestoreButton;
    }

    public JButton getLivelloGestoreButton() {
        return livelloGestoreButton;
    }

    public JButton getTurnoGestoreButton() {
        return turnoGestoreButton;
    }

    public JButton getIstruttoreGestoreButton() {
        return istruttoreGestoreButton;
    }

    public JButton getGestisciIscrizioniButton() {
        return gestisciIscrizioniButton;
    }

    public JButton getGestisciNuoviUtentiButton() {
        return gestisciNuoviUtentiButton;
    }

    public JButton getGestisciModificheAllenamentiButton() {
        return gestisciModificheAllenamentiButton;
    }
}

