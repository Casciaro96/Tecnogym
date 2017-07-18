package it.unisalento.pps.Business;

import it.unisalento.pps.Model.Disciplina;

import javax.swing.*;
import java.util.ArrayList;

public class DisciplinaBusiness {

    public Disciplina aggiungiDisciplina(String nome, String descrizione, int costo, int livello, int turno, int idIstruttore) {


            Disciplina d = new Disciplina();
            d.setNome(nome);
            d.setCosto(costo);
            d.setDescrizione(descrizione);
            d.setIdIstruttore(idIstruttore);
            d.setLivello(livello);
            d.setTurno(turno);
            boolean esito = d.aggiungidisciplina(d);
            if(esito==false){
                JOptionPane.showMessageDialog(null, "Esiste già una disciplina con questo nome!");
                return null;
            }

            JOptionPane.showMessageDialog(null, "Disciplina aggiunta con successo!");
            return d;
    }



    public boolean eliminaDisciplina(String nome, int livello) {
        try {
            Disciplina d = new Disciplina();
            d = d.findbyNomeLivello(nome, livello);
            d.eliminadisciplina(d);
            JOptionPane.showMessageDialog(null, "Disciplina cancellata con successo");
            return true;//retun true o false è indifferente
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "La disciplina non esiste o è stata già cancellata");
            return false;
        }



    }

    public ArrayList<Disciplina> elenco () {
        Disciplina disciplina = new Disciplina();
        ArrayList<Disciplina> risultati = disciplina.elencoDiscipline();
        int i;
        for(i=0; i<risultati.size(); i++) System.out.println(risultati.get(i).getNome() + " " + risultati.get(i).getLivello() + " " + risultati.get(i).getTurno());

        return risultati;
    }


	
	

}
