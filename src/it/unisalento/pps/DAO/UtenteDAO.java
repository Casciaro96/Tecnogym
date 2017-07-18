package it.unisalento.pps.DAO;

import java.util.ArrayList;

import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Utente;

public class UtenteDAO {

	private static UtenteDAO instance;
	public static synchronized UtenteDAO getInstance(){
		if(instance == null)
			instance = new UtenteDAO();
		return instance;
	}
	
	public Utente trovabyUserPwd(String username, String password)
	{
		Utente u = new Utente();
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT idUtente,Username,Password,Ruolo FROM Utente WHERE Username='"+username+"' and Password='"+password+"'");
		if(risultato.isEmpty())
			return null;
		else{
			String[] riga = risultato.get(0);
			u.setIdUtente(Integer.parseInt(riga[0]));
			u.setUsername(riga[1]);
			u.setPassword(riga[2]);
			u.setRuolo(riga[3]);
			return u;
		}
		
		
	}
	
	
	
	
	
	
	
}
