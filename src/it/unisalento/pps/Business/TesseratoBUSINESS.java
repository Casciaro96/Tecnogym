package it.unisalento.pps.Business;

import it.unisalento.pps.Model.Tesserato;

import javax.swing.*;
import java.security.KeyStore;

public class TesseratoBUSINESS {
	
	public boolean aggiungiTesserato(String username, String password, String nome, String cognome, String email, int recapito, int codicecarta) {

		Tesserato t = new Tesserato();
		t.setUsername(username);
		t.setPassword(password);
		t.setNome(nome);
		t.setCognome(cognome);
		t.setEmail(email);
		t.setRecapito(recapito);
		t.setCodicecarta(codicecarta);
		boolean risultato = t.registrazione(t);
		return risultato;
	}




	
	
}

