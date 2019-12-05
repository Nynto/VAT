package gui;

import vat.*;
import java.awt.*;
import javax.swing.*;

public class SaveGUI extends FormAnalyseGUI implements Runnable {

    @Override
    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 20;
        float SAVE_SIZE = 20f;
        String SAVE_TEXT = "How do you want to save the forms?";

        JLabel saveLabel = new JLabel(SAVE_TEXT, SwingConstants.CENTER);
        saveLabel.setFont(saveLabel.getFont().deriveFont(SAVE_SIZE));
        JPanel savePanel = new JPanel();
        savePanel.add(saveLabel);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 1, 100, 0));
        JButton btnSQL = new JButton("SQL");
        JButton btnOBJECTIO = new JButton("Object IO");
        buttonPanel.add(btnSQL);
        buttonPanel.add(btnOBJECTIO);

        savePanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, 10,10,10));
        savePanel.add(Box.createVerticalStrut(VERT_GAP));
        savePanel.setLayout(new BoxLayout(savePanel, BoxLayout.PAGE_AXIS));
        savePanel.add(Box.createVerticalStrut(VERT_GAP));
        savePanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(savePanel, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(800,200);
        frame.setVisible(true);

        btnSQL.addActionListener(e -> {
            try {
                SQL.addForms(forms);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "There is no connection with the database.");
            }
            frame.setVisible(false);
        });

        btnOBJECTIO.addActionListener(e -> {
            try {
                ObjectIO.writeFormFile(forms);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "There is no file created.");
            }
            frame.setVisible(false);
        });
    }
}