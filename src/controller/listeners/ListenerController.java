package controller.listeners;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class ListenerController extends MouseAdapter {

    private JPanel panel;

    public ListenerController(JPanel panel) {
        this.panel = panel;

        System.out.println(Arrays.toString(panel.getComponents()));
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

}
