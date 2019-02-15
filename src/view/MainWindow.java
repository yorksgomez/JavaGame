package view;

import javax.swing.*;

class MainWindow extends JFrame {

    private MainPanel pnMain;

    MainWindow() {
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
