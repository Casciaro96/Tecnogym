package it.unisalento.pps.DAO;

import java.util.ArrayList;
import java.util.Iterator;

import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Utente;

public class UtenteDAO {

    private static UtenteDAO instance;

    public static synchronized UtenteDAO getInstance() {
        if (instance == null)
            instance = new UtenteDAO();
        return instance;
    }


    public Utente trovabyUserPassword(String username, String password) {

        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM Utente WHERE Username='" + username + "' and Password='" + password + "'");
        if (risultato.isEmpty())
            return null;

        else {
            Utente u = new Utente();
            String riga[] = risultato.get(0);
            u.setUsername(riga[1]);
            u.setPassword(riga[2]);
            u.setRuolo(riga[3]);
            return u;
        }


    }


    public boolean confermalogindao(String username, String password) {

        String sql = "UPDATE utente SET loggato=1 WHERE username='" + username + "' AND password='" + password + "'";
        boolean esito = DbConnection.getInstance().eseguiAggiornamento(sql);
        return esito;
    }

    public ArrayList<Utente> findRuolo(String username, String password) {
        ArrayList<String[]> ris = DbConnection.getInstance().eseguiQuery("SELECT * FROM utente WHERE nome='" + username + "' AND password='" + password + "'");
        ArrayList<Utente> listautente = new ArrayList<>();
        Iterator<String[]> i = ris.iterator();
        while (i.hasNext()) {
            String riga[] = i.next();
            Utente u = new Utente();
            u.setUsername(riga[1]);
            u.setPassword(riga[2]);
            u.setRuolo(riga[3]);
            listautente.add(u);
        }
        return listautente;
    }
}
