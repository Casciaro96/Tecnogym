package it.unisalento.pps.View.ActionListener;

import it.unisalento.pps.View.Panel.GestorePanel;
import it.unisalento.pps.View.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionGestore implements ActionListener{

    Frame frame;
    public final static String AGGIUNGIDISCIPLINA = "Aggiungi disciplina";
    public final static String AGGIUNGILIVELLO = "Aggiungi livello";
    public final static String AGGIUNGITURNO = "Aggiungi turno";
    public final static String AGGIUNGIISTRUTTORE = "Aggiungi istruttore";
    public final static String GESTISCIISCRIZIONI = "Gestisci iscrizioni";
    public final static String GESTISCINUOVIUTENTI = "Gestisci nuovi utenti";
    public final static String GESTISCIMODIFICHE = "Gestisci modifiche";

    public final static String ELIMINADISCIPLINA = "Elimina disciplina";
    public final static String ELIMINALIVELLO = "Elimina livello";
    public final static String ELIMINATURNO = "Elimina turno";
    public final static String ELIMINAISTRUTTORE = "Elimina istruttore";


    public ActionGestore(Frame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(AGGIUNGIDISCIPLINA)){
            frame.getGestorePanel().getGestorePanel().setVisible(false);
            frame.getAggiungiDisciplina().getAggiungiDisciplina().setVisible(true);
        }

        if(sorgenteEvento.equals(AGGIUNGILIVELLO)) {
            frame.getLivellopanel().getLivelloPanel().setVisible(true);
        }




    }




}
