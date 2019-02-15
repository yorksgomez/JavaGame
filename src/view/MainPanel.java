package view;

import view.components.GButton;
import view.workers.Drawer;
import javax.swing.*;
import java.awt.*;

class MainPanel extends JPanel {

    private Drawer mainDrawer;

    MainPanel() {
        //Styles
        setBackground(Color.BLACK);

        init();
    }

    private void init() {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        mainDrawer = new Drawer(getWidth(), getHeight());
        Graphics2D g2d = (Graphics2D) g;

        int fontSize =  mainDrawer.widthToVal(3);

        g2d.setFont(new Font("Constantia", Font.BOLD, fontSize));
        g2d.setColor(Color.WHITE);
        g2d.drawString("TheGame", mainDrawer.widthToVal(20), mainDrawer.widthToVal(10));
        GButton btn = new GButton("Start", mainDrawer.widthToVal(35), mainDrawer.widthToVal(8), 50, 25);
        btn.paint(g2d);
    }

}
