package Handwerkerrechnung;

import javax.swing.*;

public class Handwerkerrechnung {
    private JTextField nbTxt;
    private JTextField mwtTxt;
    private JTextField bbTxt;
    private JComboBox rdhCombo;
    private JTextField exeTimeTxt;
    private JRadioButton workRb;
    private JRadioButton hoursRb;
    private JTextField mcTxt;
    private JTextField entfTxt;
    private JButton rechnenB;
    private JPanel rootPanel;

    public Handwerkerrechnung() {
        rechnenB.addActionListener((e) -> click());
    }

    private void click() {
        double classHourlyW = 0;
        double zusatz = 1;
        double exeTime = 0;
        String selected = (String) rdhCombo.getSelectedItem();
        String executiveT = exeTimeTxt.getText();
        double executeT = Double.parseDouble(executiveT);

        if (selected == "Lehrling") {
            classHourlyW = 20;
        }else if (selected == "Geselle") {
            classHourlyW = 40;
        }else if (selected == "Meister") {
            classHourlyW = 60;
        }

        if (workRb.isSelected()) {
            zusatz = 1;
        }else if (hoursRb.isSelected()) {
            zusatz = 1.5;
        }
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
