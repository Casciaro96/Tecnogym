package it.unisalento.pps.Business;

import it.unisalento.pps.Model.Utente;

import it.unisalento.pps.View.Frame;
import it.unisalento.pps.View.Panel.LoginPanel;
import it.unisalento.pps.View.Panel.SportPanel;

import javax.swing.*;
import java.util.ArrayList;


public class LoginBusiness {

    public boolean loggati(String username, String password) {

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Per favore inserire credenziali");
            return false;
        }

        Utente u = new Utente();
        u.setUsername(username);
        u.setPassword(password);
        u.trovabyUserPwd(username, password);
        u.confermalogin(username,password);
        String ruolo = u.trovabyUserPwd(username, password).getRuolo();
        return true;
    }



}



