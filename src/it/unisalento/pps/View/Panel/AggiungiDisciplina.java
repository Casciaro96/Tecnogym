package it.unisalento.pps.View.Panel;

import javax.swing.*;

/**
 * Created by SARA on 18/07/2017.
 */
public class AggiungiDisciplina {
    private JPanel aggiungiDisciplina;
    private JTextField nometxt;
    private JTextField costotxt;
    private JTextField numLivelli;
    private JTextField numTurno;
    private JTextField nomIstruttore;
    private JButton backButton;
    private JButton homeButton;
    private JButton confermaButton;

    public JTextField getNometxt() {
        return nometxt;
    }

    public JTextField getCostotxt() {
        return costotxt;
    }

    public JButton getHomeButton() {
        return homeButton;
    }

    private JTextArea descrizionetxt;

    public AggiungiDisciplina() {

        aggiungiDisciplina.getUI();
        aggiungiDisciplina.setVisible(false);

    }

    public JPanel getAggiungiDisciplina() {
        return aggiungiDisciplina;
    }
<<<<<<< Updated upstream

    public JTextArea getDescrizionetxt() {
        return descrizionetxt;
=======
    public JTextField getNometxt() {
        return Nometxt;
    }
    public JTextField getDescrizionetxt() {
        return Descrizionetxt;
    }
    public JTextField getCostotxt() {
        return Costotxt;
>>>>>>> Stashed changes
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

    public JButton getBackButton() {
        return backButton;
    }



    public JButton getConfermaButton() {
        return confermaButton;
    }

}
