package it.unisalento.pps.View.Panel;

import javax.swing.*;


public class LoginPanel {
    private JPanel loginPanel;
    private JButton loginButton;
    private JTextField textUsername;
    private JPasswordField passwordField1;
    private JButton homeButton;

    public LoginPanel() {

        loginPanel.getUI();
        loginPanel.setVisible(false);

    }


    public JPanel getLoginPanel() {
        return loginPanel;
    }
    public JButton getLoginButton() {
        return loginButton;
    }
    public JTextField getTextUsername() {
        return textUsername;
    }
    public JPasswordField getPasswordField1() {
        return passwordField1;
    }


}
