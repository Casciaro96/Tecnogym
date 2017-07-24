package it.unisalento.pps.Business;

import it.unisalento.pps.Model.IscrizioneDisciplina;
import it.unisalento.pps.Model.IscrizioneEvento;
import it.unisalento.pps.Model.Tesserato;

import javax.swing.*;
import java.security.KeyStore;
import java.util.ArrayList;

public class TesseratoBusiness {
	
	public boolean aggiungiTesserato(String username, String password, String nome, String cognome, String email, int recapito, int codicecarta) {

		Tesserato t = new Tesserato();
		t.setUsername(username);
		t.setPassword(password);
		t.setNome(nome);
		t.setCognome(cognome);
		t.setEmail(email);
		t.setRecapito(recapito);
		t.setCodicecarta(codicecarta);
		if (username == null || password == null || nome == null || cognome == null || email == null || recapito == 0 || codicecarta == 0) {
			JOptionPane.showMessageDialog(null, "Per favore riempire tutti i campi");
			return false;
		}
		boolean risultato = t.registrazione(t);
		JOptionPane.showMessageDialog(null, "Richiesta inviata. Ti verranno comunicate per email le tue credenziali entro qualche ora");
		return true;
	}

	public boolean iscriviti(String utente, String nome, String livello, String turno, String pagamento, String stato) {
		IscrizioneDisciplina is = new IscrizioneDisciplina();
		is.setUtente(utente);
		is.setDisciplina(nome);
		is.setLivello(livello);
		is.setTurno(turno);
		is.setPagamento(pagamento);
		is.setStato_iscrizione(stato);
		//TODO controlli sul fatto che ppsso essere già iscritto
		boolean risultato = is.iscrizione(is);
		return true;
	}

	public boolean iscrivitievento (String nomeevento, String tipo, String stato, String costo, String user, String livello, String turno) {
		IscrizioneEvento iem = new IscrizioneEvento();
		iem.setNome(nomeevento);
		iem.setTipo(tipo);
		iem.setStato(stato);
		iem.setCosto(costo);
		iem.setUsername(user);
		iem.setLivello(livello);
		iem.setTurno(turno);
		boolean esito = iem.iscriviti(iem);
		return true;
	}

}

