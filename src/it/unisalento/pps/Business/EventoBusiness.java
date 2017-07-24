package it.unisalento.pps.Business;

import it.unisalento.pps.Model.Evento;

import javax.swing.*;

public class EventoBusiness {
    public Evento aggiungievento(String nome, String tipo, String disciplina, String costo, String statodiapprovazione) {

        Evento g = new Evento();
        g.setNome(nome);
        g.setTipo(tipo);
        g.setDisciplina(disciplina);
        g.setCosto(costo);
        g.setStatoapprovazione(statodiapprovazione);
        boolean eventnew = g.aggiungievento(g);
        if(eventnew==false) {

            JOptionPane.showMessageDialog(null, "Esiste già un evento con questo nome!");
            return null;
        }
        JOptionPane.showMessageDialog(null, "Evento aggiunta con successo!");
        return g;
    }
}
