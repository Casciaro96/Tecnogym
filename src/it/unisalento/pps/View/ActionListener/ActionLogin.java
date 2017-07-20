package it.unisalento.pps.View.ActionListener;


import it.unisalento.pps.Business.LoginBusiness;
import it.unisalento.pps.Model.Utente;
import it.unisalento.pps.View.Frame;
import it.unisalento.pps.View.Panel.SportPanel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.*;

public class ActionLogin implements ActionListener{

    public final static String LOGIN = "loggati";
    Frame frame;

    public ActionLogin(Frame frame) {this.frame=frame;}

    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(LOGIN)) {
            LoginBusiness login = new LoginBusiness();
            String user = frame.getLoginPanel().getTextUsername().getText();
            String pwd = frame.getLoginPanel().getPasswordField1().getText();


            boolean esito = login.loggato(user, pwd);

            if(esito==true) {
                frame.getLoginPanel().getLoginPanel().setVisible(false);
                frame.getSportPanel().getSportPanel().setVisible(true);


            }

        }

    }

}
