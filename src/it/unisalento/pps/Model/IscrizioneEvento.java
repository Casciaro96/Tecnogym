package it.unisalento.pps.Model;


import it.unisalento.pps.DAO.IscrizioneEventoDAO;

public class IscrizioneEvento {
    private String nome;
    private String tipo;
    private String stato;
    private String costo;
    private String username;
    private String livello;
    private String turno;
    //TODO gestire il certificato

    public IscrizioneEvento(String nome, String tipo, String stato, String costo, String username, String livello, String turno) {
        this.nome = nome;
        this.tipo = tipo;
        this.stato = stato;
        this.costo = costo;
        this.username = username;
        this.livello = livello;
        this.turno = turno;
    }

    public IscrizioneEvento() {

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

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean iscriviti (IscrizioneEvento iev) {
        IscrizioneEventoDAO ied = new IscrizioneEventoDAO();
        return ied.iscrizioneevento(iev);
    }
}
