package it.unisalento.pps.View.ActionListener;

import it.unisalento.pps.Business.DisciplinaBusiness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDisciplina implements ActionListener {

    public final static String AGGIUNGI = "Aggiungi_disciplina";

    public void actionPerformed(ActionEvent e){

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(AGGIUNGI)){

            DisciplinaBusiness disciplina = new DisciplinaBusiness();
            String nome = "Nuoto";
            String descrizione = "porco";
            int costo = 12;
            int livello = 4;
            int turno = 2;
            int idIstruttore = 3;
            disciplina.aggiungiDisciplina(nome, descrizione, costo, livello, turno, idIstruttore);
        }

    }

}
