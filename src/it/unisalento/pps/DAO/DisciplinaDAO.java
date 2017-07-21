package it.unisalento.pps.DAO;

import java.util.ArrayList;
import java.util.Iterator;


import it.unisalento.pps.DbConnection.DbConnection;
import it.unisalento.pps.Model.Disciplina;



public class DisciplinaDAO {
	
private static DisciplinaDAO instance;

	public static synchronized DisciplinaDAO getInstance() {
		if(instance == null)
			instance = new DisciplinaDAO();
		return instance;
	}

	public ArrayList<Disciplina> elencoDiscipline(){
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM disciplina");
		ArrayList<Disciplina> disciplina = new ArrayList<>();
		Iterator<String[]> i = risultato.iterator();
		while(i.hasNext()) {
			String riga[] = i.next();
			Disciplina d = new Disciplina();
			d.setIdDisciplina(Integer.parseInt(riga[0]));
			d.setNome(riga[1]);
			d.setDescrizione(riga[2]);
			d.setCosto(riga[3]);
			d.setLivello(riga[4]);
			d.setTurno(riga[5]);
			d.setIstruttore(riga[6]);
			disciplina.add(d);
		}
			return disciplina;
	}

	
	public boolean aggiungiDisciplina(Disciplina disciplina){

		ArrayList<String[]> esito = DbConnection.getInstance().eseguiQuery("SELECT * FROM disciplina WHERE nome='"+disciplina.getNome()+"' AND livello='"+disciplina.getLivello()+"' ");
				if (esito.size()==1) return false;
				String sql = "INSERT INTO disciplina (nome,descrizione,costo,livello,turno,istruttore) VALUES ('"+disciplina.getNome()+"','"+disciplina.getDescrizione()+"',"
						+ "'"+disciplina.getCosto()+"','"+disciplina.getLivello()+"','"+disciplina.getTurno()+"','"+disciplina.getIstruttore()+"')";
			 return DbConnection.getInstance().eseguiAggiornamento(sql);
	
	}
	
	
	public boolean eliminaDisciplina(Disciplina disciplina) {

			ArrayList<String[]> esito = DbConnection.getInstance().eseguiQuery("SELECT * FROM disciplina WHERE nome='"+disciplina.getNome()+"' AND livello='"+disciplina.getLivello()+"' ");
			if (esito.size()==0) return false;
			String sql = "DELETE FROM disciplina WHERE nome='"+disciplina.getNome()+"' AND livello='"+disciplina.getLivello()+"' ";
			DbConnection.getInstance().eseguiAggiornamento(sql);
			return true;
			
		}
		

		
	public Disciplina findbyNomeLivello(String nome, int livello) {

		Disciplina d = new Disciplina();
		String sql = "SELECT * FROM disciplina WHERE nome='"+nome+"' AND livello='"+livello+"'";
		ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);
		if (result.size()==0) return null;
		String[] riga = result.get(0);
		d.setIdDisciplina(Integer.parseInt(riga[0]));
		d.setNome(riga[1]);
		d.setDescrizione(riga[2]);
		d.setCosto(riga[3]);
		d.setLivello(riga[4]);
		d.setTurno(riga[5]);
		d.setIstruttore(riga[6]);
		System.out.print("Nome Disciplina: "+ d.getNome() +"\nDescrizione: "+ d.getDescrizione() +"\nCosto: "+ d.getCosto() +"€ \nLivello: "+ d.getLivello()+"\nIstruttore: " +d.getIstruttore()+" " );
		return d;
	}



}

