package gui;

import vat.*;
import java.awt.*;
import javax.swing.*;

public class CylinderGUI extends FormAnalyseGUI implements Runnable {

    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 50;
        float CYLINDER_SIZE = 36f;
        String CYLINDER_TEXT = "Fill in the measures of the cylinder.";

        JLabel cylinderLabel = new JLabel(CYLINDER_TEXT, SwingConstants.CENTER);
        cylinderLabel.setFont(cylinderLabel.getFont().deriveFont(CYLINDER_SIZE));
        JPanel cylinderPanel = new JPanel();
        cylinderPanel.add(cylinderLabel);

        JPanel textPanelCylinder = new JPanel(new GridLayout(2, 0, 5, 0));
        JLabel labelRadius = new JLabel("Radius");
        JLabel labelHeight = new JLabel("Height");
        JTextField textRadius = new JTextField();
        JTextField textHeight = new JTextField();
        textPanelCylinder.add(labelRadius);
        textPanelCylinder.add(labelHeight);
        textPanelCylinder.add(textRadius);
        textPanelCylinder.add(textHeight);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 2, 0));
        JButton btnCreate = new JButton("Create");
        JButton btnCancel = new JButton("Cancel");
        buttonPanel.add(btnCreate);
        buttonPanel.add(btnCancel);

        cylinderPanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP, EB_GAP));
        cylinderPanel.setLayout(new BoxLayout(cylinderPanel, BoxLayout.PAGE_AXIS));
        cylinderPanel.add(Box.createVerticalStrut(VERT_GAP));
        cylinderPanel.add(textPanelCylinder);
        cylinderPanel.add(Box.createVerticalStrut(VERT_GAP));
        cylinderPanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(cylinderPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        btnCancel.addActionListener(e -> {
            frame.setVisible(false);
        });

        btnCreate.addActionListener(e -> {

            try {
                double cylinderRadius = Double.parseDouble(textRadius.getText());
                double cylinderHeight = Double.parseDouble(textHeight.getText());
                Form form = new Cylinder(cylinderRadius,cylinderHeight);
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