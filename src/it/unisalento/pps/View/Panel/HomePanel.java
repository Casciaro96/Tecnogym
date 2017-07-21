package it.unisalento.pps.View.Panel;


import javax.swing.*;

public class HomePanel {
    private JPanel homePanel;
    private JButton activityButton;
    private JButton loginButton;
    private JButton singinButton;

    public HomePanel() {
        homePanel.getUI();
        homePanel.setVisible(true);
    }

    public JPanel getHomePanel() {
        return homePanel;
    }

    public JButton getActivityButton() {
        return activityButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getSinginButton() {
        return singinButton;
    }
}
