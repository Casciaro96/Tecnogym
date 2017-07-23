package it.unisalento.pps.DAO;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.IscrizioneDisciplina;


public class IscrizioneDisciplinaDAO {


    public boolean iscrizionedisciplina(IscrizioneDisciplina is) {
        String sql = "INSERT INTO iscrizione_disciplina(utente,disciplina,livello,turno,statopagamento,statoiscrizione) VALUES('"+is.getUtente()+"' '"+is.getDisciplina()+"' '"+is.getLivello()+"' '"+is.getTurno()+"' '"+is.getPagamento()+"' '"+is.getStato_iscrizione()+"' ) ";
        return DbConnection.getInstance().eseguiAggiornamento(sql);
    }


}
