package gui;

import vat.*;
import java.awt.*;
import javax.swing.*;

public class ConeGUI extends FormAnalyseGUI implements Runnable {

    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 50;
        float CONE_SIZE = 36f;
        String CONE_TEXT = "Fill in the measures of the cone.";

        JLabel coneLabel = new JLabel(CONE_TEXT, SwingConstants.CENTER);
        coneLabel.setFont(coneLabel.getFont().deriveFont(CONE_SIZE));
        JPanel conePanel = new JPanel();
        conePanel.add(coneLabel);

        JPanel textPanelCone = new JPanel(new GridLayout(2, 0, 5, 0));
        JLabel labelRadius = new JLabel("Radius");
        JLabel labelHeight = new JLabel("Height");
        JTextField Radius = new JTextField();
        JTextField Height = new JTextField();
        textPanelCone.add(labelRadius);
        textPanelCone.add(labelHeight);
        textPanelCone.add(Radius);
        textPanelCone.add(Height);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 2, 0));
        JButton btnCreate = new JButton("Create");
        JButton btnCancel = new JButton("Cancel");
        buttonPanel.add(btnCreate);
        buttonPanel.add(btnCancel);

        conePanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP, EB_GAP));
        conePanel.setLayout(new BoxLayout(conePanel, BoxLayout.PAGE_AXIS));
        conePanel.add(Box.createVerticalStrut(VERT_GAP));
        conePanel.add(textPanelCone);
        conePanel.add(Box.createVerticalStrut(VERT_GAP));
        conePanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(conePanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        btnCancel.addActionListener(e -> {
            frame.setVisible(false);
        });


        btnCreate.addActionListener(e -> {

            try {
                double coneRadius = Double.parseDouble(Radius.getText());
                double coneHeight = Double.parseDouble(Height.getText());
                Form form = new Cone(coneRadius,coneHeight);
                forms.add(form);
                model.addElement(form);
                frame.setVisible(false);
            }
            catch( NumberFormatException nfe ) {
                JOptionPane.showMessageDialog(null, "Please fill in numbers.");
            }
        });
    }
}