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
    private JTextArea descrizionetxt;
    private JButton backButton;
    private JButton confermaButton;
    private JComboBox comboBoxLivello;
    private JComboBox comboBoxTurno;
    private JComboBox comboBoxIstruttore;




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

    public JPanel getAggiungiDisciplina() {
        return aggiungiDisciplina;
    }

    public JTextField getNometxt() {
        return nometxt;
    }

    public JTextField getCostotxt() {
        return costotxt;
    }

    public JTextArea getDescrizionetxt() {
        return descrizionetxt;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getConfermaButton() {
        return confermaButton;
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




}
