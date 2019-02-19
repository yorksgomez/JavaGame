package view.panes;

import controller.listeners.ListenerController;
import view.components.GButton;
import view.workers.Drawer;
import javax.swing.*;
import java.awt.*;

public class StartPanel extends JPanel {

    private Drawer mainDrawer;
    private GButton btn;

    public StartPanel() {
        ListenerController c = new ListenerController(this);
        addMouseListener(c);
        addMouseMotionListener(c);

        requestFocus();

        setOpaque(false);

        init();
    }

    //Methods
    private void init() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        mainDrawer = new Drawer((int)screen.getWidth(), (int)screen.getHeight());
        btn = new GButton("Start", mainDrawer.widthToVal(55), mainDrawer.widthToVal(8), 50, 25);

        add(btn);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        Graphics2D g2d = (Graphics2D) g;

        int fontSize =  mainDrawer.widthToVal(7);
        g2d.setFont(new Font("Constantia", Font.BOLD, fontSize));
        g2d.setColor(Color.WHITE);
        g2d.drawString("TheGame", mainDrawer.widthToVal(20), mainDrawer.widthToVal(10));

        for(Component c : getComponents())
            c.paint(g2d);

    }

}
