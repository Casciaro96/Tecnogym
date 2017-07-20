package it.unisalento.pps.DAO;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Centro;

import java.util.ArrayList;

public class CentroDAO {

    private static DisciplinaDAO instance;

    public static synchronized DisciplinaDAO getInstance() {
        if(instance == null)
            instance = new DisciplinaDAO();
        return instance;
    }

   public Centro prendiinfo() {
        Centro c = new Centro();
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM infotecnogym");

        String[] riga = risultato.get(0);
        c.setSitoweb(riga[1]);
        c.setNome(riga[2]);
        c.setIndirizzo(riga[3]);
        c.setRecapito(Integer.parseInt(riga[4]));
       return c;
   }




}
