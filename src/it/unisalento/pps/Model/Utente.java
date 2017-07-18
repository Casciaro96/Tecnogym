package it.unisalento.pps.Model;

import it.unisalento.pps.DAO.UtenteDAO;

public class Utente {
 private int idUtente;
 private String username;
 private String password;
 private String ruolo;  


 public Utente() {
  super();
  }

 
 public Utente (int idUtente, String username, String password, String ruolo) {
  this.idUtente = idUtente;
  this.username = username;
  this.password = password;
  this.ruolo = ruolo; 
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
 
 public static Utente trovaUtente(String username,String password) {
		UtenteDAO uDAO = new UtenteDAO();
		return uDAO.trovabyUserPwd(username,password);
	}



}
