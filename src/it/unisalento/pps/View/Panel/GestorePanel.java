package it.unisalento.pps.View.Panel;


import javax.swing.*;

public class GestorePanel {
    private JPanel GestorePanel;
    private JLabel messaggioBenenuto;
    private JButton disciplinaGestoreButton;
    private JButton livelloGestoreButton;
    private JButton turnoGestoreButton;
    private JButton istruttoreGestoreButton;
    private JButton gestisciIscrizioniButton;
    private JButton gestisciNuoviUtentiButton;
    private JButton gestisciModificheAllenamentiButton;


    public GestorePanel() {
        GestorePanel.getUI();
        GestorePanel.setVisible(true);
    }


    public JPanel getGestorePanel() {
        return GestorePanel;
    }

    public JLabel getMessaggioBenenuto() {
        return messaggioBenenuto;
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

