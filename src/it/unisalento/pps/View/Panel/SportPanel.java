package it.unisalento.pps.View.Panel;

import javax.swing.*;

public class SportPanel {
    private JPanel sportPanel;
    private JButton button1;
    private JButton Volley;

    public SportPanel() {
        sportPanel.getUI();
        sportPanel.setVisible(false);
    }

    public JPanel getSportPanel() {
        return sportPanel;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getVolley() {
        return Volley;
    }
}
