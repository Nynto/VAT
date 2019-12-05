package gui;

import vat.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class LoadGUI extends FormAnalyseGUI implements Runnable {

    @Override
    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 20;
        float LOAD_SIZE = 20f;
        String LOAD_TEXT = "How do you want to load the forms?";

        JLabel loadLabel = new JLabel(LOAD_TEXT, SwingConstants.CENTER);
        loadLabel.setFont(loadLabel.getFont().deriveFont(LOAD_SIZE));
        JPanel loadPanel = new JPanel();
        loadPanel.add(loadLabel);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 1, 100, 0));
        JButton btnSQL = new JButton("SQL");
        JButton btnOBJECTIO = new JButton("Object IO");
        buttonPanel.add(btnSQL);
        buttonPanel.add(btnOBJECTIO);

        loadPanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP, EB_GAP));
        loadPanel.add(Box.createVerticalStrut(VERT_GAP));
        loadPanel.setLayout(new BoxLayout(loadPanel, BoxLayout.PAGE_AXIS));
        loadPanel.add(Box.createVerticalStrut(VERT_GAP));
        loadPanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(loadPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(800,200);
        frame.setVisible(true);

        btnSQL.addActionListener(e -> {
            try {
                model.removeAllElements();

                ArrayList<Form> formsFromSQL = SQL.readForms();
                listValues = formsFromSQL.toArray();
                forms = formsFromSQL;

                for (Object s : listValues) {
                    model.addElement(s);
                }
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "There is no connection with the database.");
            }
            frame.setVisible(false);
        });

        btnOBJECTIO.addActionListener(e -> {
            try {
                model.removeAllElements();

                ArrayList<Form> formsFromFile = ObjectIO.readFormFile();
                listValues = formsFromFile.toArray();
                forms = formsFromFile;

                for (Object s : listValues) {
                    model.addElement(s);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "There is no file to read from.");
            }
            frame.setVisible(false);
        });
    }
}
