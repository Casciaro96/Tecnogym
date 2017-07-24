package it.unisalento.pps.View.ActionListener;


import it.unisalento.pps.Business.TesseratoBusiness;
import it.unisalento.pps.Model.Tesserato;

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

            String nomeutente = frame.getSportPanel().getNomeUtente();
            String nome = frame.getBasketPanel().getNomedisciplina();
            TesseratoBusiness t = new TesseratoBusiness();
            String livellodisciplina = frame.getBasketPanel().getComboBoxLivello().getSelectedItem().toString();
            String turnodisciplina = frame.getBasketPanel().getComboBoxTurno().getSelectedItem().toString();
            String pagamentodisciplina = frame.getBasketPanel().getComboBoxPagamento().getSelectedItem().toString();
            String stato = "In attesa di approvazione";

<<<<<<< Updated upstream

            System.out.println(nomeutente);
            System.out.println(nome);
            boolean esito = t.iscriviti(nomeutente, nome, livellodisciplina, turnodisciplina, pagamentodisciplina, stato);
=======
>>>>>>> Stashed changes

            System.out.println(nomeutente);
            System.out.println(nome);
            boolean esito = t.iscriviti(nomeutente, nome, livellodisciplina, turnodisciplina, pagamentodisciplina, stato);
            //TODO e sto esito che fa???
        }

    }
}
