package it.unisalento.pps.View.ActionListener;

import it.unisalento.pps.Business.LoginBusiness;
import it.unisalento.pps.View.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionSport implements ActionListener {


        public final static String BASKET = "apri basket";
        public final static String PALLAVOLO = "Indietro";
        public final static String KARATE = "Aggiungi_disciplina";
        public final static String NUOTO = "Indietro";
        public final static String TENNIS = "Aggiungi_disciplina";
        public final static String CALCIO = "Indietro";
        public final static String PESI = "Aggiungi_disciplina";


        Frame frame;

        public ActionSport(Frame frame) {
            this.frame=frame;
        }



    public void actionPerformed(ActionEvent e) {

            String sorgenteEvento = e.getActionCommand();

            if (sorgenteEvento.equals(BASKET)) {
                frame.getBasketPanel().getBasketPanel().setVisible(true);
                frame.getBasketPanel().setNomedisciplina("Basket");
                frame.getSportPanel().getSportPanel().setVisible(false);


            }

            if(sorgenteEvento.equals(PALLAVOLO)) {

            }
        }
}
