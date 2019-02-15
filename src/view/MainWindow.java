package view;

import javax.swing.*;

public class MainWindow extends JFrame {

    private MainPanel pnMain;

    public MainWindow() {
        setTitle("Game");
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);

        init();
    }

    private void init() {
        pnMain = new MainPanel();

        add(pnMain);
    }

}
