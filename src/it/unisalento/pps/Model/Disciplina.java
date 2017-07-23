package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.DisciplinaDAO;

import java.util.ArrayList;

public class Disciplina {
	private int idDisciplina;
	private String nome;
	private String descrizione;
	private String costo;
	private String livello;
	private String turno;
	private String istruttore;

	public Disciplina (int idDisciplina, String nome, String descrizione, String costo, String livello, String turno, String istruttore){
		this.idDisciplina = idDisciplina;
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.livello = livello;
		this.turno = turno;
		this.istruttore = istruttore;
	}
	
	
	


	public Disciplina (){
		
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCosto() {
		return costo;
	}

	public String getLivello() {
		return livello;
	}

	public String getTurno() {
		return turno;
	}

	public String getIstruttore() {
		return istruttore;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public void setLivello(String livello) {
		this.livello = livello;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void setIstruttore(String istruttore) {
		this.istruttore = istruttore;
	}

	public boolean aggiungidisciplina(Disciplina disciplina) {
	
	DisciplinaDAO dDAO = new DisciplinaDAO();
	return dDAO.aggiungiDisciplina(disciplina);
}


public boolean eliminadisciplina (Disciplina disciplina) {

		DisciplinaDAO dDAO = new DisciplinaDAO();
		return dDAO.eliminaDisciplina(disciplina);
}

public Disciplina findbyNomeLivello (String nome, int livello) { //TODO e qui

	    DisciplinaDAO dDAO = new DisciplinaDAO();
	    return dDAO.findbyNomeLivello(nome, livello);
}


public ArrayList<Disciplina> elencoDiscipline() {

		DisciplinaDAO dDAO = new DisciplinaDAO();
		return dDAO.elencoDiscipline();
}

}
