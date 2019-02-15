package view.panes;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class MainPanel extends JPanel {

    //Variables
    private StartPanel pnStart;

    //Constructor
    public MainPanel() {
        //Position
        setLayout(new BorderLayout());

        //Styles
        setBackground(Color.BLACK);

        init();
    }

    //Methods
    private void init() {
        pnStart = new StartPanel();

        add(pnStart, BorderLayout.CENTER);
    }

}
