package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.IstruttoreDAO;

import java.util.ArrayList;

public class Istruttore extends Utente {
	private String nome;
	private String cognome;
	private String email;
	private String disciplina;
	private int recapito;
	private int stipendio;

	public Istruttore (String nome, String cognome, String email, String disciplina, int recapito, int stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.disciplina = disciplina;
		this.recapito = recapito;
		this.stipendio = stipendio;
		
	}
	public Istruttore (){
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
	
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<Istruttore> cbIstruttore() {
		IstruttoreDAO cbIstruttore = new IstruttoreDAO();
		return cbIstruttore.elencoistruttore();
	}

	public ArrayList<Utente> userDiIstruttore() {
		IstruttoreDAO udi = new IstruttoreDAO();
		return udi.elencoeutentidisciplina();
	}
	
}

