package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.TurnoDAO;

public class Turno {
	private int idTurno;
	private String giorno;
	private int orainizio;
	private int orafine;

	public Turno() {
	}

	public Turno(int idTurno, String giorno, int orainizio, int orafine) {
		this.idTurno = idTurno;
		this.giorno = giorno;
		this.orainizio = orainizio;
		this.orafine = orafine;
	}

	public int getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}

	public String getGiorno() {
		return giorno;
	}

	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}

	public int getOrainizio() {
		return orainizio;
	}

	public void setOrainizio(int orainizio) {
		this.orainizio = orainizio;
	}

	public int getOrafine() {
		return orafine;
	}

	public void setOrafine(int orafine) {
		this.orafine = orafine;
	}


    public Turno findbyidTurno (int idTurno) {

		TurnoDAO tuDAO = new TurnoDAO();
		return tuDAO.findbyidTurno(idTurno);
	}

	public Turno findbynometurno(String giorno, int orainizio, int orafine) {

		TurnoDAO tuDAO = new TurnoDAO();
		return tuDAO.findbynometurno(giorno,orainizio,orafine);
	}










}
