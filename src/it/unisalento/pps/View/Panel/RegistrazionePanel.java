package it.unisalento.pps.View.Panel;

import javax.swing.*;


public class RegistrazionePanel {
    private JPanel registrazionePanel;
    private JTextField textUsername;
    private JTextField textPassword;
    private JTextField textNome;
    private JTextField textCognome;
    private JTextField textEmail;
    private JTextField textRecapito;
    private JTextField textCodiceCarta;
    private JButton ConfermaRegistrazioneButton;


    public RegistrazionePanel() {

        registrazionePanel.getUI();
        registrazionePanel.setVisible(false);
        textRecapito.setText("0");
        textCodiceCarta.setText("0");
    }

    public JPanel getRegistrazionePanel() {
        return registrazionePanel;
    }

    public JTextField getTextUsername() {
        return textUsername;
    }

    public JTextField getTextPassword() {
        return textPassword;
    }

    public JTextField getTextNome() {
        return textNome;
    }

    public JTextField getTextCognome() {
        return textCognome;
    }

    public JTextField getTextEmail() {
        return textEmail;
    }

    public JTextField getTextRecapito() {
        return textRecapito;
    }

    public JTextField getTextCodiceCarta() {
        return textCodiceCarta;
    }

    public JButton getConfermaRegistrazioneButton() {
        return ConfermaRegistrazioneButton;
    }

}
