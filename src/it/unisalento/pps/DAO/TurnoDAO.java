package it.unisalento.pps.DAO;

import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Turno;

import java.util.ArrayList;

public class TurnoDAO {

    public static TurnoDAO instance;

    public static synchronized TurnoDAO getInstance() {
        if(instance == null)
            instance = new TurnoDAO();
        return instance;
    }

    public Turno findbyidTurno(int idTurno) {

        Turno t = new Turno();
        String sql = "SELECT * FROM turno WHERE idTurno='"+idTurno+"'";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);
        if (result.size()==0) return null;
        String[] riga = result.get(0);
        t.setGiorno(riga[1]);
        t.setOrainizio(Integer.parseInt(riga[2]));
        t.setOrainizio(Integer.parseInt(riga[3]));
        t.setOrafine(Integer.parseInt(riga[4]));
        return t;
    }

    public Turno findbynometurno(String giorno, int orainizio, int orafine) {
        Turno t = new Turno();
        String sql = "SELECT * FROM turno WHERE giorno='"+giorno+"' AND orainizio='"+orainizio+"' AND orafine='"+orafine+"'";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);
        if (result.size()==0) return null;
        String[] riga = result.get(0);
        t.setGiorno(riga[1]);
        t.setOrainizio(Integer.parseInt(riga[2]));
        t.setOrainizio(Integer.parseInt(riga[3]));
        t.setOrafine(Integer.parseInt(riga[4]));
        return t;
    }
}
