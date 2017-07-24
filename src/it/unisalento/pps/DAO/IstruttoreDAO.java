package it.unisalento.pps.DAO;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Istruttore;

import java.util.ArrayList;
import java.util.Iterator;

public class IstruttoreDAO {


    public static IstruttoreDAO instance;

    public static synchronized IstruttoreDAO getInstance() {
        if(instance == null)
            instance = new IstruttoreDAO();
        return instance;
    }


    public ArrayList<Istruttore> elencoistruttore() {
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM utente WHERE ruolo='istruttore'");
        ArrayList<Istruttore> istruttori = new ArrayList<>();
        Iterator<String[]> i = risultato.iterator();
        while(i.hasNext()) {
            String riga[] = i.next();
            Istruttore istruttore = new Istruttore();
            istruttore.setUsername(riga[1]);
            istruttori.add(istruttore);
        }
        return istruttori;
    }





}
