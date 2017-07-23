package it.unisalento.pps.View.Panel;

import it.unisalento.pps.Model.Livello;

import javax.swing.*;
import java.util.ArrayList;

public class BasketPanel {
    private JPanel basketPanel;
    private JTextArea textArea1;
    private JComboBox comboBoxLivello;
    private JComboBox comboBoxTurno;
    private JButton backButton;
    private JButton iscrivitiButton;
    private JButton testimonianzeButton;
    private JComboBox comboBoxPagamento;
    private String nomedisciplina;

    public BasketPanel() {
        basketPanel.getUI();
        basketPanel.setVisible(false);

        Livello l = new Livello();
        ArrayList<Livello> elencolivellibasket = l.findbyNomeDisciplina("Basket");
        for (int b = 0; b < elencolivellibasket.size(); b++) {

            comboBoxLivello.addItem(elencolivellibasket.get(b).getNome());
        }

    }


    public void setNomedisciplina(String nomedisciplina) {
        this.nomedisciplina = nomedisciplina;
    }

    public String getNomedisciplina() {
        return nomedisciplina;
    }

    public JPanel getBasketPanel() {
        return basketPanel;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public JComboBox getComboBoxLivello() {
        return comboBoxLivello;
    }

    public JComboBox getComboBoxTurno() {
        return comboBoxTurno;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getIscrivitiButton() {
        return iscrivitiButton;
    }

    public JButton getTestimonianzeButton() {
        return testimonianzeButton;
    }

    public JComboBox getComboBoxPagamento() {
        return comboBoxPagamento;
    }

}
