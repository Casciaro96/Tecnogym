package it.unisalento.pps.Model;

public class Centro {
	public String sitoweb;
	public String nome;
	public String indirizzo;
	public int recapito;

	public Centro (String sitoweb, String nome, String indirizzo, int recapito){
		this.sitoweb = sitoweb;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.recapito = recapito;	
	}
	
	public Centro()
	{
		
	}

	public String getSitoweb() {
		return sitoweb;
	}

	public void setSitoweb(String sitoweb) {
		this.sitoweb = sitoweb;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getRecapito() {
		return recapito;
	}

	public void setRecapito(int recapito) {
		this.recapito = recapito;
	}
	
	
}
