package view;

import javax.swing.*;
import java.awt.*;

class MainPanel extends JPanel {

    private JLabel lbTitle;
    private JButton btnTest;

    MainPanel() {
        //Styles
        setBackground(Color.BLACK);

        init();
    }

    private void init() {
        lbTitle = new JLabel("The Game");
        lbTitle.setForeground(Color.WHITE);
        lbTitle.setFont(new Font("Constantia", Font.BOLD, 32));
        btnTest = new JButton("Close");

        btnTest.addActionListener((ev)-> System.exit(0));

        add(lbTitle);
        add(btnTest);
    }

}
