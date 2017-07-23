package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.TesseratoDAO;

public class Tesserato extends Utente {
	private String nome;
	private String cognome;
	private String email;
	private int recapito;
	private int codicecarta;

	
public Tesserato(String nome, String cognome, String email, int recapito, int codicecarta) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.recapito = recapito;
		this.codicecarta = codicecarta;
		
	}

   public Tesserato()
   {
	   
   }


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getRecapito() {
	return recapito;
}

public void setRecapito(int recapito) {
	this.recapito = recapito;
}

public int getCodicecarta() {
	return codicecarta;
}

public void setCodicecarta(int codicecarta) {
	this.codicecarta = codicecarta;
}
   


/*public Tesserato registrazione(String username, String password, String nome, String cognome, String email, int recapito, int codicecarta) {

	TesseratoDAO tDAO = new TesseratoDAO();
	return tDAO.registrazione(username, password, nome, cognome, email, recapito, codicecarta);
}*/

	public boolean registrazione(Tesserato tesserato) {

		TesseratoDAO tDAO = new TesseratoDAO();
		return tDAO.registrazione(tesserato);
	}




	
}

