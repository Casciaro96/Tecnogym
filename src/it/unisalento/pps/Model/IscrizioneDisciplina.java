package it.unisalento.pps.Model;

public class IscrizioneDisciplina {
        private int idIscrizione;
        private String pagamento;
        private String stato_iscrizione;
        private int idUtente;
        private int idDisciplina;


    public IscrizioneDisciplina(int idIscrizione, String pagamento, String stato_iscrizione, int idUtente, int idDisciplina) {
        this.idIscrizione = idIscrizione;
        this.pagamento = pagamento;
        this.stato_iscrizione = stato_iscrizione;
        this.idUtente = idUtente;
        this.idDisciplina = idDisciplina;
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

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
}
