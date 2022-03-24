package Handwerkerrechnung;

import javax.swing.*;
import java.awt.*;

public class Rechner extends JFrame {
    public Rechner() {

        setVisible(true);
        setPreferredSize(new Dimension(600, 400));
        setTitle("Handwerkerrechnung");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var fenster = new Handwerkerrechnung();
        JPanel panelu = fenster.getRootPanel();
        setContentPane(panelu);
        pack();
    }
}
