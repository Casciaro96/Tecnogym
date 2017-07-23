package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.IscrizioneDisciplinaDAO;

public class IscrizioneDisciplina {
    private int idIscrizione;
    private String pagamento;
    private String stato_iscrizione;
    private String utente;
    private String disciplina;
    private String livello;
    private String turno;


    public IscrizioneDisciplina(int idIscrizione, String pagamento, String stato_iscrizione, String utente, String disciplina, String turno, String livello) {
        this.idIscrizione = idIscrizione;
        this.pagamento = pagamento;
        this.stato_iscrizione = stato_iscrizione;
        this.utente = utente;
        this.disciplina = disciplina;
        this.turno = turno;
        this.livello = livello;

    }

    public IscrizioneDisciplina() {

    }


    public int getIdIscrizione() {
        return idIscrizione;
    }

    public void setIdIscrizione(int idIscrizione) {
        this.idIscrizione = idIscrizione;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getStato_iscrizione() {
        return stato_iscrizione;
    }

    public void setStato_iscrizione(String stato_iscrizione) {
        this.stato_iscrizione = stato_iscrizione;
    }

    public String getUtente() {
        return utente;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setUtente(String utente) {
        this.utente = utente;
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


    public boolean iscrizione(IscrizioneDisciplina is) {

        IscrizioneDisciplinaDAO tdDAO = new IscrizioneDisciplinaDAO();
        return tdDAO.iscrizionedisciplina(is);
    }
}


