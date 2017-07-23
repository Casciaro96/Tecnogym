package it.unisalento.pps.DAO;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.IscrizioneDisciplina;
import it.unisalento.pps.Model.Tesserato;

public class TesseratoDAO {
	
	private static TesseratoDAO instance;

	public static synchronized TesseratoDAO getInstance() {
		if(instance == null)
			instance = new TesseratoDAO();
		return instance;
	}

	public boolean registrazione(Tesserato tesserato) {

		String sql = "INSERT INTO utente(username,password,ruolo,nome,cognome,email,recapito,codicecarta,statoregistrazione) VALUES('"+ tesserato.getUsername()+"','"+tesserato.getPassword()+"','tesserato','"+tesserato.getNome()+"','"+tesserato.getCognome()+"','"+tesserato.getEmail()+"','"+tesserato.getRecapito()+"','"+tesserato.getCodicecarta()+"','In attesa di conferma')";
		boolean risultato = DbConnection.getInstance().eseguiAggiornamento(sql);
		return risultato;
	}
	/*
	public Tesserato registrazione(String username, String password, String nome, String cognome, String email, int recapito, int codicecarta) {
		Tesserato t = new Tesserato;
		String sql = "INSERT INTO utente(username,password,nome,cognome,recapito,codicecarta) VALUES('"+username+"''"+password+"''"+nome+"''"+cognome+"'" +
				"'"+email+"''"+recapito+"''"+codicecarta+"'";
		DbConnection.getInstance().eseguiQuery(sql);
		return t;


	}*/


	
}



