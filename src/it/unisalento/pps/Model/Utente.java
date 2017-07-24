package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.UtenteDAO;

import java.util.ArrayList;

public class Utente {
 private int idUtente;
 private String username;
 private String password;
 private String ruolo;
 private int loggato;


 public Utente() {
  super();
  }

 
 public Utente (int idUtente, String username, String password, String ruolo, int loggato) {
  this.idUtente = idUtente;
  this.username = username;
  this.password = password;
  this.ruolo = ruolo;
  this.loggato = loggato;
 }

 public int getIdUtente() {
  return idUtente;
 }

 public void setIdUtente(int idUtente) {
  this.idUtente = idUtente;
 }
 
 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getRuolo() {
  return ruolo;
 }

 public void setRuolo(String ruolo) {
  this.ruolo = ruolo;
 }

 public int getLoggato() {
  return loggato;
 }

 public void setLoggato(int loggato) {
  this.loggato = loggato;
 }

 public Utente trovabyUserPwd(String username, String password) {
     UtenteDAO uDAO = new UtenteDAO();
     return uDAO.trovabyUserPassword(username, password);

    }

    public boolean confermalogin(String username, String password) {
        UtenteDAO utDAO = new UtenteDAO();
        return utDAO.confermalogindao(username, password);
    }



}
