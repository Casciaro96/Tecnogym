package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.LivelloDAO;

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


	public Livello findbyidLivello(int idLivello) {

		LivelloDAO lDAO = new LivelloDAO();
		return lDAO.findbyidLivello(idLivello);
	}

	public Livello findbyNomeLivello(String nomeLivello) {

		LivelloDAO lDAO = new LivelloDAO();
		return lDAO.findbynomelivello(nomeLivello);
	}





}
