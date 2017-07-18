package it.unisalento.pps.DAO;


import it.unisalento.pps.Model.Tesserato;

public class TesseratoDAO {
	
	private static TesseratoDAO instance;

	public static synchronized TesseratoDAO getInstance() {
		if(instance == null)
			instance = new TesseratoDAO();
		return instance;
	}


	public void iscrivitiDisciplina(int idTesserto, int idDisciplina, String livello, String turno)
		{
			Tesserato t = new Tesserato();


		}
	
		

	
}



