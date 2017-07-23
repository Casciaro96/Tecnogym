package it.unisalento.pps.View.ActionListener;


import it.unisalento.pps.Business.TesseratoBUSINESS;
import it.unisalento.pps.Model.Tesserato;
import it.unisalento.pps.View.*;

import java.awt.*;
import it.unisalento.pps.View.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionTesserato implements ActionListener {

    public final static String ISCRIVITI = "iscrizione a disciplina";
    public final static String MODIFICA = "modifica iscrizione";
    public final static String TESTIMONIANZA = "vedi testimonianze";
    public final static String SCRIVI = "lascia testimonianza";

    private String nomedisciplina;

    public ActionTesserato() {

    }

    public String getNomedisciplina(String basket) {
        return nomedisciplina;
    }

    Frame frame;


    public ActionTesserato(Frame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(ISCRIVITI)) {

            String utente = frame.getSportPanel().getNomeutente();
            String nome = frame.getBasketPanel().getNomedisciplina();
            TesseratoBUSINESS t = new TesseratoBUSINESS();
            String livellodisciplina = frame.getBasketPanel().getComboBoxLivello().getSelectedItem().toString();
            String turnodisciplina = frame.getBasketPanel().getComboBoxTurno().getSelectedItem().toString();
            String pagamentodisciplina = frame.getBasketPanel().getComboBoxPagamento().getSelectedItem().toString();
            String stato = "In attesa di approvazione";

            boolean esito = t.iscriviti(utente, nome, livellodisciplina, turnodisciplina, pagamentodisciplina, stato);

        }

    }
}
