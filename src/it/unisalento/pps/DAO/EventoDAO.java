package it.unisalento.pps.DAO;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Evento;

import java.util.ArrayList;

public class EventoDAO {

    public boolean agginungiEvento (Evento evento){

        ArrayList<String[]> esito = DbConnection.getInstance().eseguiQuery("SELECT * FROM evento WHERE nome='"+evento.getNome()+"' AND livello='"+evento.getLivello()+"' ");
        if (esito.size()==1) return false;
        String sql = "INSERT INTO evento (nome,tipo,costo,livello,turno,costo) VALUES ('"+evento.getNome()+"','"+evento.getTipo()+"',"
                + "'"+evento.getCosto()+"','"+evento.getLivello()+"','"+evento.getTurno()+"'";
        return DbConnection.getInstance().eseguiAggiornamento(sql);

    }

}
