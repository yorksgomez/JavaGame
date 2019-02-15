package controller;

import view.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting game...");

        //Inserts look and feel
        try {
            System.out.println("Giving look and feel...");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            System.out.println("Error creating lookandfeel: " + ex.getMessage());
        }

        System.out.println("Look and feel gived correctly!");

        //Creates main window
        System.out.println("Starting main window...");
        MainWindow mnWindow = new MainWindow();

        SwingUtilities.invokeLater(() -> {
            mnWindow.setVisible(true);
            System.out.println("Window showed correctly!");
        });


        for(String s : GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames())
            System.out.println(s);

    }

}
