package gui;

import vat.*;
import java.awt.*;
import javax.swing.*;

public class SphereGUI extends FormAnalyseGUI implements Runnable {

    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 50;
        float SPHERE_SIZE = 36f;
        String SPHERE_TEXT = "Fill in the measures of the sphere.";

        JLabel sphereLabel = new JLabel(SPHERE_TEXT, SwingConstants.CENTER);
        sphereLabel.setFont(sphereLabel.getFont().deriveFont(SPHERE_SIZE));
        JPanel spherePanel = new JPanel();
        spherePanel.add(sphereLabel);

        JPanel textPanelSphere = new JPanel(new GridLayout(2, 0, 5, 0));
        JLabel labelRadius = new JLabel("Radius");
        JTextField textRadius = new JTextField();
        textPanelSphere.add(labelRadius);
        textPanelSphere.add(textRadius);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 2, 0));
        JButton btnCreate = new JButton("Create");
        JButton btnCancel = new JButton("Cancel");
        buttonPanel.add(btnCreate);
        buttonPanel.add(btnCancel);

        spherePanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP, EB_GAP));
        spherePanel.setLayout(new BoxLayout(spherePanel, BoxLayout.PAGE_AXIS));
        spherePanel.add(Box.createVerticalStrut(VERT_GAP));
        spherePanel.add(textPanelSphere);
        spherePanel.add(Box.createVerticalStrut(VERT_GAP));
        spherePanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(spherePanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        btnCancel.addActionListener(e -> {
            frame.setVisible(false);
        });

        btnCreate.addActionListener(e -> {

            try {
                double sphereRadius = Double.parseDouble(textRadius.getText());
                Form form = new Sphere(sphereRadius);
                forms.add(form);
                model.addElement(form);
                frame.setVisible(false);
            }
            catch( NumberFormatException nft) {
                JOptionPane.showMessageDialog(null, "Please fill in numbers.");
            }
        });
    }
}