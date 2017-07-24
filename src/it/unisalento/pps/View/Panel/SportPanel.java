package it.unisalento.pps.View.Panel;

import it.unisalento.pps.Model.Utente;

import javax.swing.*;
import it.unisalento.pps.View.Frame;

public class SportPanel {
    private JPanel sportPanel;
    private JButton basketButton;
    private JButton nuotoButton;
    private JButton calcioButton;
    private JButton karateButton;
    private JButton tennisButton;
    private JButton pallavoloButton;




    public String nomeUtente;




    public SportPanel() {
        sportPanel.getUI();
        sportPanel.setVisible(false);
    }


    public JPanel getSportPanel() {
        return sportPanel;
    }

    public JButton getBasketButton() {
        return basketButton;
    }

    public JButton getNuotoButton() {
        return nuotoButton;
    }

    public JButton getCalcioButton() {
        return calcioButton;
    }

    public JButton getKarateButton() {
        return karateButton;
    }

    public JButton getTennisButton() {
        return tennisButton;
    }

    public JButton getPallavoloButton() {
        return pallavoloButton;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }
}

