package it.unisalento.pps.DAO;

import java.util.ArrayList;
import java.util.Iterator;

import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Utente;

public class UtenteDAO {

	private static UtenteDAO instance;
	public static synchronized UtenteDAO getInstance(){
		if(instance == null)
			instance = new UtenteDAO();
		return instance;
	}


	public boolean trovabyUserPwd(String username, String password)
	{
		//Utente u = new Utente();
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM Utente WHERE Username='"+username+"' and Password='"+password+"'");
		if(risultato.isEmpty())
			return false;
		else{
			return true;
		}
	}


	
	
	
	
	
	
	
}
