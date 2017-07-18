package it.unisalento.pps.View.Panel;

import javax.swing.*;

/**
 * Created by SARA on 04/07/2017.
 */
public class LoginPanel {
    private JPanel loginPanel;
    private JButton backButton;
    private JButton loginButton;
    private JTextField textUsername;
    private JTextField textPassword;
    private JButton signInButton;

    public LoginPanel() {

        loginPanel.getUI();
        loginPanel.setVisible(false);

    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }
    public JButton getBackButton() {
        return backButton;
    }
    public JButton getLoginButton() {
        return loginButton;
    }
    public JTextField getTextUsername() {
        return textUsername;
    }
    public JTextField getTextPassword() {
        return textPassword;
    }
    public JButton getSignInButton() {
        return signInButton;
    }
}
