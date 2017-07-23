package it.unisalento.pps.View.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unisalento.pps.Business.LivelloBusiness;
import it.unisalento.pps.View.Frame;

public class ActionLivello implements ActionListener {

    Frame frame;
    public static final String CONFERMA = "Aggiungi livello";
    public static final String BACK = "Indietro";

    public ActionLivello(Frame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(CONFERMA)) {
            LivelloBusiness lbus = new LivelloBusiness();
            String nome = frame.getLivellopanel().getNuovolivellotxt().getText();
            lbus.aggiungiLivello(nome);
        }

        if(sorgenteEvento.equals(BACK)) {
            frame.getLivellopanel().getLivelloPanel().setVisible(false);
            frame.getGestorePanel().getGestorePanel().setVisible(true);

        }
    }
}
