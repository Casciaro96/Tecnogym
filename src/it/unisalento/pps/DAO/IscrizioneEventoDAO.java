package it.unisalento.pps.DAO;

import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.IscrizioneEvento;

public class IscrizioneEventoDAO {
    private static IscrizioneEventoDAO instance;

    public static synchronized IscrizioneEventoDAO getInstance() {
        if(instance == null)
            instance = new IscrizioneEventoDAO();
        return instance;
    }
    public boolean iscrizioneevento(IscrizioneEvento ie) {
        String sql = "INSERT INTO iscrizione_eventi(nome,tipo,stato,costo,username) VALUES('"+ie.getNome()+"' '"+ie.getTipo()+"' '"+ie.getStato()+"' '"+ie.getCosto()+"' '"+ie.getUsername()+"') ";
        return DbConnection.getInstance().eseguiAggiornamento(sql);
    }

}
