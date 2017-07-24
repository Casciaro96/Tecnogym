package it.unisalento.pps.DAO;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.IscrizioneDisciplina;

public class IscrizioneDisciplinaDAO {

private static IscrizioneDisciplinaDAO instance;

    public static synchronized IscrizioneDisciplinaDAO getInstance() {
        if(instance == null)
            instance = new IscrizioneDisciplinaDAO();
        return instance;
    }


    public boolean iscrizionedisciplina(IscrizioneDisciplina is) {
        String sql = "INSERT INTO iscrizione_disciplina(utente,disciplina,livello,turno,statopagamento,statoiscrizione) VALUES('"+is.getUtente()+"' '"+is.getDisciplina()+"' '"+is.getLivello()+"' '"+is.getTurno()+"' '"+is.getPagamento()+"' '"+is.getStato_iscrizione()+"' ) ";
        return DbConnection.getInstance().eseguiAggiornamento(sql);
    }


}
