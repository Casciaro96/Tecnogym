package it.unisalento.pps.Model;

public class Sala {
	private int idSala;
	private String nome;
	
	public Sala(int idSala, String nome) {
		this.idSala = idSala;
		this.nome = nome;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
