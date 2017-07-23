package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.LivelloDAO;
import it.unisalento.pps.DbConnection.DbConnection;

import java.util.ArrayList;

public class Livello {
	private int idLivello;
	private String nome;

	public Livello() {
	}

	public Livello(int idLivello, String nome) {
		this.idLivello = idLivello;
		this.nome = nome;
	}

	public int getIdLivello() {
		return idLivello;
	}

	public void setIdLivello(int idLivello) {
		this.idLivello = idLivello;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public  ArrayList<Livello> findbyidLivello(int idLivello) {

		LivelloDAO lDAO = new LivelloDAO();
		return lDAO.findbyidLivello(idLivello);
	}

	public Livello findbyNomeLivello(String nomeLivello) {

		LivelloDAO lDAO = new LivelloDAO();
		return lDAO.findbynomelivello(nomeLivello);
	}

	public ArrayList<Livello> cbLivello() {
		LivelloDAO cdLivello = new LivelloDAO();
		return cdLivello.elencolivello();
	}

	public boolean aggiungiNuovoLivello(Livello livello) {
		LivelloDAO lDAO = new LivelloDAO();
		return lDAO.aggiungiLivello(livello);
	}

	public ArrayList<Livello> findbyNomeDisciplina(String nomedisciplina){
		LivelloDAO livDAO = new LivelloDAO();
		return livDAO.findbyNomeDisciplina(nomedisciplina);

	}


}
