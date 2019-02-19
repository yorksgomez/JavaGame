package controller.listeners;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListenerController extends MouseAdapter {

    private Container container;
    boolean done = false;


    public ListenerController(Container container) {
        this.container = container;
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        if(done)
            return;

        Component components[] = container.getComponents();

        System.out.println("Moved");

        for (Component c: components) {
            System.out.println("Listeners from: " + c.getName());
            System.out.println(c.getListeners(ActionListener.class));
        }

        done = true;

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

}
