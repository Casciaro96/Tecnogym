package it.unisalento.pps.View.Panel;

import javax.swing.*;

public class SportPanel {
    private JPanel sportPanel;
    private JButton basketButton;
    private JButton nuotoButton;
    private JButton calcioButton;
    private JButton karateButton;
    private JButton tennisButton;
    private JButton pallavoloButton;

    public SportPanel() {
        sportPanel.getUI();
        sportPanel.setVisible(false);
    }

    String nomeutente;

    public String getNomeutente() {
        return nomeutente;
    }

    public void setNomeutente(String nomeutente) {
        this.nomeutente = nomeutente;
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
}

