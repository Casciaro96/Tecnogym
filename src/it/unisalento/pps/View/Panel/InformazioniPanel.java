package it.unisalento.pps.View.Panel;

import it.unisalento.pps.Business.CentroBusiness;
import it.unisalento.pps.Model.Centro;

import javax.swing.*;

public class InformazioniPanel {
    private JPanel informazioniPanel;
    private JLabel sitoLabel;
    private JLabel nomeLabel;
    private JLabel indirizzoLabel;
    private JLabel recapitoLabel;

    public InformazioniPanel() {
        informazioniPanel.getUI();
        informazioniPanel.setVisible(true);
    }

    public void info(){
        CentroBusiness centroBusiness = new CentroBusiness();
        Centro centro;
        centro = centroBusiness.informazioni();
        sitoLabel.setText(centro.getSitoweb());
        nomeLabel.setText(centro.getNome());
        indirizzoLabel.setText(centro.getIndirizzo());
        recapitoLabel.setText(String.valueOf(centro.getRecapito()));
    }

    public JPanel getInformazioniPanel() {
        return informazioniPanel;
    }

    public JLabel getSitoLabel() {
        return sitoLabel;
    }

    public JLabel getNomeLabel() {
        return nomeLabel;
    }

    public JLabel getIndirizzoLabel() {
        return indirizzoLabel;
    }

    public JLabel getRecapitoLabel() {
        return recapitoLabel;
    }





}
