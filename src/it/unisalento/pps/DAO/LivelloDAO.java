package it.unisalento.pps.DAO;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Livello;

import java.util.ArrayList;
import java.util.Iterator;

public class LivelloDAO {

    private static LivelloDAO instance;

    public static synchronized LivelloDAO getInstance() {
        if(instance == null)
            instance = new LivelloDAO();
        return instance;
    }


    public  ArrayList<Livello> findbyidLivello(int idLivello) {

        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM disciplina");
        ArrayList<Livello> livello = new ArrayList<>();
        Iterator<String[]> i = risultato.iterator();
        while (i.hasNext()) {
            String riga[] = i.next();
            Livello l = new Livello();
            l.setIdLivello(Integer.parseInt(riga[0]));
            l.setNome(riga[1]);
            livello.add(l);
        }
        return livello;
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

    public ArrayList<Livello> elencolivello() {

        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM livello");
        ArrayList<Livello> livelli = new ArrayList<>();
        Iterator<String[]> i = risultato.iterator();
        while(i.hasNext()) {
            String riga[] = i.next();
            Livello l = new Livello();
            //String[] riga = risultato.get(0);
            l.setNome(riga[1]);
            livelli.add(l);
        }
        return livelli;
    }


}
