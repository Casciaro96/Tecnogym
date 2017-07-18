package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.DisciplinaDAO;

import java.util.ArrayList;

public class Disciplina {
	private int idDisciplina;
	private String nome;
	private String descrizione;
	private int costo;
	private int livello;
	private int turno;
	private int idIstruttore;

	public Disciplina (int idDisciplina, String nome, String descrizione, int costo, int livello, int turno, int idIstruttore){
		this.idDisciplina = idDisciplina;
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.livello = livello;
		this.turno = turno;
		this.idIstruttore = idIstruttore;
	}
	
	
	
	public int getIdIstruttore() {
		return idIstruttore;
	}

	public void setIdIstruttore(int idIstruttore) {
		this.idIstruttore = idIstruttore;
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

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public boolean aggiungidisciplina(Disciplina disciplina) {
	
	DisciplinaDAO dDAO = new DisciplinaDAO();
	return dDAO.aggiungiDisciplina(disciplina);
}


public boolean eliminadisciplina (Disciplina disciplina) {

		DisciplinaDAO dDAO = new DisciplinaDAO();
		return dDAO.eliminaDisciplina(disciplina);
}

public Disciplina findbyNomeLivello (String nome, int livello) {

	    DisciplinaDAO dDAO = new DisciplinaDAO();
	    return dDAO.findbyNomeLivello(nome, livello);
}


public ArrayList<Disciplina> elencoDiscipline() {

		DisciplinaDAO dDAO = new DisciplinaDAO();
		return dDAO.elencoDiscipline();
}

}
