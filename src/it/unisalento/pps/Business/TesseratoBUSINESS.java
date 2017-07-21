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
		if(username==null||password==null||nome==null||cognome==null||email==null||recapito==0||codicecarta==0) {
			JOptionPane.showMessageDialog(null, "Per favore riempire tutti i campi");
			return false;
		}
		boolean risultato = t.registrazione(t);
		JOptionPane.showMessageDialog(null, "Richiesta inviata. Ti verranno comunicate per email le tue credenziali entro qualche ora");
		return true;
	}




	
	
}

