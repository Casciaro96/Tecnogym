package it.unisalento.pps.DAO;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Livello;

import java.util.ArrayList;

public class LivelloDAO {

    private static LivelloDAO instance;

    public static synchronized LivelloDAO getInstance() {
        if(instance == null)
            instance = new LivelloDAO();
        return instance;
    }


    public Livello findbyidLivello(int idLivello) {

        Livello l = new Livello();
        String sql = "SELECT nome FROM livello WHERE idlivello='"+idLivello+"'";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);

        if (result.size()==0) return null;
        String[] riga = result.get(0);
        l.setNome(riga[1]);
        return l;

    }

    public Livello findbynomelivello(String nome) {

        Livello l = new Livello();
        String sql = "SELECT nome FROM livello WHERE Nome='"+nome+"'";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);

        if (result.size()==0) return null;
        String[] riga = result.get(0);
        l.setNome(riga[1]);
        return l;
    }


}
