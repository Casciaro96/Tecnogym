package it.unisalento.pps.View.ActionListener;

import it.unisalento.pps.Business.DisciplinaBusiness;
import it.unisalento.pps.Model.Istruttore;
import it.unisalento.pps.View.*;
import it.unisalento.pps.View.Frame;
import it.unisalento.pps.View.Panel.AggiungiDisciplina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDisciplina implements ActionListener {


    public final static String AGGIUNGI = "Aggiungi_disciplina";
    Frame frame;

    public ActionDisciplina(Frame frame) {
        this.frame=frame;
    }

    public void actionPerformed(ActionEvent e){

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(AGGIUNGI)){

            DisciplinaBusiness disciplina = new DisciplinaBusiness();

            String nome = frame.getAggiungiDisciplina().getNometxt().getText();
            String descrizione = frame.getAggiungiDisciplina().getDescrizionetxt().getText();
            int costo = Integer.parseInt(frame.getAggiungiDisciplina().getCostotxt().getText());
            int livello = Integer.parseInt(frame.getAggiungiDisciplina().getNumLivelli().getText());
            int turno = Integer.parseInt(frame.getAggiungiDisciplina().getNumTurno().getText());
            int idIstruttore = Integer.parseInt(frame.getAggiungiDisciplina().getNomIstruttore().getText());

            disciplina.aggiungiDisciplina(nome, descrizione, costo, livello, turno, idIstruttore);
        }

    }

}
