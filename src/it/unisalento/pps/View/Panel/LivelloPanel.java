package it.unisalento.pps.View.Panel;


import javax.swing.*;

public class LivelloPanel {
    private JPanel livelloPanel;
    private JTextField nuovolivellotxt;
    private JButton confermaButton;
    private JButton backButton;

    public LivelloPanel() {
        livelloPanel.getUI();
        livelloPanel.setVisible(false);
    }

    public JPanel getLivelloPanel() {
        return livelloPanel;
    }

    public JTextField getNuovolivellotxt() {
        return nuovolivellotxt;
    }

    public JButton getConfermaButton() {
        return confermaButton;
    }

    public JButton getBackButton() {
        return backButton;
    }
}
