package it.unisalento.pps.View.Panel;

import it.unisalento.pps.DAO.LivelloDAO;
import it.unisalento.pps.DAO.TurnoDAO;
import it.unisalento.pps.Model.Istruttore;
import it.unisalento.pps.Model.Livello;
import it.unisalento.pps.Model.Turno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;


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

        Livello l = new Livello();
        ArrayList<Livello> elencolivelli = l.cbLivello();
        for (int i = 0; i < elencolivelli.size(); i++) {

            comboBoxLivello.addItem(elencolivelli.get(i).getNome());
        }

        Turno t = new Turno();
        ArrayList<Turno>  elencoturni = t.cbTurno();
        for (int i = 0; i < elencoturni.size(); i++) {

            comboBoxTurno.addItem(elencoturni.get(i).getGiorno());
        }

        Istruttore istruttore = new Istruttore();
        ArrayList<Istruttore> elencoistruttori = istruttore.cbIstruttore();
        for (int i = 0; i < elencoistruttori.size(); i++) {

            comboBoxIstruttore.addItem(elencoistruttori.get(i).getUsername());
        }
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
<<<<<<< HEAD

    public AggiungiDisciplina() {

        aggiungiDisciplina.getUI();
        aggiungiDisciplina.setVisible(false);

    }
=======
    private JComboBox comboBoxLivello;
    private JComboBox comboBoxTurno;
    private JComboBox comboBoxIstruttore;
>>>>>>> master

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

    public JComboBox getComboBoxLivello() {
        return comboBoxLivello;
    }

    public JComboBox getComboBoxTurno() {
        return comboBoxTurno;
    }

    public JComboBox getComboBoxIstruttore() {
        return comboBoxIstruttore;
    }

    public JButton getConfermaButton() {
        return confermaButton;
    }





}
