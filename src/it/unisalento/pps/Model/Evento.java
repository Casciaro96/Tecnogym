package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.EventoDAO;

public class Evento {
	private int idEvento;
	private String nome;
	private String tipo;
	private String disciplina;
	private String livello;
	private String turno;
	private String costo;
	private String statoapprovazione;

	public Evento(int idEvento, String nome, String tipo, String disciplina, String livello, String turno, String costo, String statoapprovazione){
		this.idEvento = idEvento;
		this.nome = nome;
		this.tipo = tipo;
		this.disciplina = disciplina;
		this.livello = livello;
		this.turno = turno;
		this.costo = costo;
		this.statoapprovazione = statoapprovazione;
	}

	public Evento() {

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

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getStatoapprovazione() {
		return statoapprovazione;
	}

	public void setStatoapprovazione(String statoapprovazione) {
		this.statoapprovazione = statoapprovazione;
	}

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

	public String getLivello() {
		return livello;
	}

	public void setLivello(String livello) {
		this.livello = livello;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public boolean aggiungievento(Evento evento) {
		EventoDAO gDAO = new EventoDAO();
		return gDAO.agginungiEvento(evento);
	}

}
