package it.unisalento.pps.Business;

public class TesseratoBUSINESS {
	
	//classe singleton 
	private static TesseratoBUSINESS instance;
	public static synchronized TesseratoBUSINESS getInstance(){
	    if(instance == null)
		      instance = new TesseratoBUSINESS();
		    return instance;
	}



	
	
}

