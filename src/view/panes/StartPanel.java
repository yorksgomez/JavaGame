package view.panes;

import view.components.GButton;
import view.workers.Drawer;
import javax.swing.*;
import java.awt.*;

public class StartPanel extends JPanel {

    private Drawer mainDrawer;

    public StartPanel() {
        setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        mainDrawer = new Drawer(getWidth(), getHeight());
        Graphics2D g2d = (Graphics2D) g;

        int fontSize =  mainDrawer.widthToVal(7);

        g2d.setFont(new Font("Constantia", Font.BOLD, fontSize));
        g2d.setColor(Color.WHITE);
        g2d.drawString("TheGame", mainDrawer.widthToVal(20), mainDrawer.widthToVal(10));
        GButton btn = new GButton("Start", mainDrawer.widthToVal(55), mainDrawer.widthToVal(8), 50, 25);
        btn.paint(g2d);
    }

}
