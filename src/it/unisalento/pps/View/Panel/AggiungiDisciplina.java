package it.unisalento.pps.View.Panel;

import javax.swing.*;

/**
 * Created by SARA on 18/07/2017.
 */
public class AggiungiDisciplina {
    private JPanel aggiungiDisciplina;
    private JTextField Nometxt;
    private JTextField Descrizionetxt;
    private JTextField Costotxt;
    private JTextField numLivelli;
    private JTextField numTurno;
    private JTextField nomIstruttore;
    private JButton backButton;
    private JButton HOMEButton;
    private JButton confermaButton;
    private JTextArea descrizione;

    public AggiungiDisciplina() {

        aggiungiDisciplina.getUI();
        aggiungiDisciplina.setVisible(true);

    }

    public JPanel getAggiungiDisciplina() {
        return aggiungiDisciplina;
    }

    public JTextField getNometxt() {
        return Nometxt;
    }

    public JTextField getDescrizionetxt() {
        return Descrizionetxt;
    }

    public JTextField getCostotxt() {
        return Costotxt;
    }

    public JTextField getNumLivelli() {
        return numLivelli;
    }

    public JTextField getNumTurno() {
        return numTurno;
    }

    public JTextField getNomIstruttore() {
        return nomIstruttore;
    }
}
