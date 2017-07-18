package it.unisalento.pps.Model;

public class Evento {
	private int idEvento;
	private String nome;
	private String tipo;
	private float costo;
	private String statoapprovazione;
	
	public Evento(int idEvento, String nome, String tipo, float costo, String statoapprovazione){
		this.idEvento = idEvento;
		this.nome = nome;
		this.tipo = tipo;
		this.costo = costo;
		this.statoapprovazione = statoapprovazione;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public String getStatoapprovazione() {
		return statoapprovazione;
	}

	public void setStatoapprovazione(String statoapprovazione) {
		this.statoapprovazione = statoapprovazione;
	}
	
	

}
