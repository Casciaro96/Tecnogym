package it.unisalento.pps.Business;


import it.unisalento.pps.Model.Utente;
import it.unisalento.pps.View.Panel.*;

import javax.swing.*;
import java.awt.*;

public class LoginBusiness {

    public boolean loggati(String username, String password) {


        if(username.isEmpty()||password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Per favore inserire credenziali");
            return false;
        }
        Utente u = new Utente();
        u.setUsername(username);
        u.setPassword(password);
        boolean esito =  u.trovabyUserPwd(username, password);
        if(esito==true) {
           boolean confirm = u.confermalogin(username, password);
            JOptionPane.showMessageDialog(null, "Utente presente nel DB e loggato con successo");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Utente non trovato. Procedere con la registrazione o reinserire i dati");
        return false;
    }






}
