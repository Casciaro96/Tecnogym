package it.unisalento.pps.View.Panel;

import javax.swing.*;


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





    public AggiungiDisciplina() {

        aggiungiDisciplina.getUI();
        aggiungiDisciplina.setVisible(false);

    }






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

    public JPanel getAggiungiDisciplina() {
        return aggiungiDisciplina;
    }

    public JTextArea getDescrizionetxt() {
        return descrizionetxt;
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
