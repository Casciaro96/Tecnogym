package it.unisalento.pps.Business;


import it.unisalento.pps.Model.Livello;

import javax.swing.*;

public class LivelloBusiness {

    public boolean aggiungiLivello(String nome) {

        Livello l = new Livello();
        l.setNome(nome);
        boolean esito = l.aggiungiNuovoLivello(l);
        JOptionPane.showMessageDialog(null, "Livello aggiunto con successo");
        return true;
    }
}
