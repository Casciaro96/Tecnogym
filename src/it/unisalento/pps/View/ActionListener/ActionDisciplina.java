package it.unisalento.pps.View.ActionListener;

import it.unisalento.pps.Business.DisciplinaBusiness;
import it.unisalento.pps.View.Frame;

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
            String costo = frame.getAggiungiDisciplina().getCostotxt().getText();
            String livello = frame.getAggiungiDisciplina().getComboBoxLivello().getSelectedItem().toString();
            String turno = frame.getAggiungiDisciplina().getComboBoxTurno().getSelectedItem().toString();
            String istruttore = frame.getAggiungiDisciplina().getComboBoxIstruttore().getSelectedItem().toString();

            disciplina.aggiungiDisciplina(nome, descrizione, costo, livello, turno, istruttore);
        }

    }

}
