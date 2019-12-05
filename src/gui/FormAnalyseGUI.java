package gui;

import vat.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public abstract class FormAnalyseGUI extends JPanel implements Runnable {

    private static String[] allForms = new String[]{"Choose a form!", "Block", "Cone", "Cylinder", "Pyramid", "Sphere"};
    static ArrayList<Form> forms = new ArrayList<>();
    static DefaultListModel<Object> model = new DefaultListModel<>();
    private static JList<Object> listForms = new JList<>(model);
    static Object[] listValues = forms.toArray();

    public static void main(String[] args) {
        int VERT_GAP = 10;
        int EB_GAP = 15;
        float TITLE_SIZE = 30f;
        String TITLE_TEXT = "Calculating Device for Forms";

        JLabel titleLabel = new JLabel(TITLE_TEXT, SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(TITLE_SIZE));
        JPanel titlePanel = new JPanel();
        titlePanel.add(titleLabel);

        JPanel comboPanel = new JPanel(new GridLayout(2, 0, 5, 0));
        JComboBox comboForms = new JComboBox(allForms);
        comboForms.setSelectedIndex(4);
        comboForms.setSelectedItem("Choose a form!");
        comboForms.setPreferredSize(new Dimension(100, 30));
        comboPanel.add(comboForms);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 5, 0));
        JButton btnCreate = new JButton("Create");
        JButton btnDelete = new JButton("Delete");

        buttonPanel.add(btnCreate);
        buttonPanel.add(btnDelete);

        btnCreate.addActionListener(e ->
        {
            if (comboForms.getSelectedItem().equals("Choose a form!")) {
                JOptionPane.showMessageDialog(null, "Choose a form before you proceed.");
            } else if (comboForms.getSelectedItem().equals("Block")) {
                comboForms.setSelectedItem("Choose a form!");
                BlockGUI block = new BlockGUI();
                block.run();
            } else if (comboForms.getSelectedItem().equals("Cone")) {
                comboForms.setSelectedItem("Choose a form!");
                ConeGUI cone = new ConeGUI();
                cone.run();
            } else if (comboForms.getSelectedItem().equals("Pyramid")) {
                comboForms.setSelectedItem("Choose a form!");
                PyramidGUI pyramid = new PyramidGUI();
                pyramid.run();
            } else if (comboForms.getSelectedItem().equals("Cylinder")) {
                comboForms.setSelectedItem("Choose a form!");
                CylinderGUI cylinder = new CylinderGUI();
                cylinder.run();
            } else if (comboForms.getSelectedItem().equals("Sphere")) {
                comboForms.setSelectedItem("Choose a form!");
                SphereGUI sphere = new SphereGUI();
                sphere.run();
            }
        });

        listValues = forms.toArray();

        for (Object s : listValues) {
            model.addElement(s);
        }

        listForms = new JList<>(model);

        btnDelete.addActionListener(e -> {

            try {
                Object deletedForm = listForms.getSelectedValue();
                model.removeElement(deletedForm);
                forms.remove(deletedForm);
            }
            catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(null, "You didn't select a form or there are no forms left to delete.");
            }
        });

        JPanel buttonPanel2 = new JPanel(new GridLayout(2,3));
        JButton btnSave = new JButton("Save");
        JButton btnLoad = new JButton("Load");
        JButton btnTotalVolume = new JButton("Total Volume");
        buttonPanel.add(btnSave);
        buttonPanel.add(btnLoad);
        buttonPanel.add(btnTotalVolume);

        JPanel volumePanel = new JPanel(new GridLayout(1, 2, 5, 0));

        JLabel lblTotalVolumeForm = new JLabel("", SwingConstants.LEFT);

        volumePanel.add(lblTotalVolumeForm);

        btnSave.addActionListener(e -> {
            int i = forms.size();
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "There are no forms to save.");
            } else {
                SaveGUI save = new SaveGUI();
                save.run();
            }
        });

        btnLoad.addActionListener(e -> {
            LoadGUI load = new LoadGUI();
            load.run();
        });

        btnTotalVolume.addActionListener(e -> {
            double totalVolume = 0;

            for (Form form : forms) {
                totalVolume += form.calculateVolume();
            }

            lblTotalVolumeForm.setText("Total volume: " + (double) Math.round(totalVolume * 100) / 100);
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP, EB_GAP));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(titlePanel);
        mainPanel.add(Box.createVerticalStrut(VERT_GAP));
        mainPanel.add(comboPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(Box.createVerticalStrut(VERT_GAP));
        mainPanel.add(new JScrollPane(listForms));
        mainPanel.add(Box.createVerticalStrut(VERT_GAP));
        mainPanel.add(buttonPanel2);
        mainPanel.add(volumePanel);

        JFrame frameGUI = new JFrame();
        frameGUI.getContentPane().add(mainPanel, BorderLayout.CENTER);
        frameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGUI.pack();
        frameGUI.setSize(800,500);
        frameGUI.setVisible(true);
    }
}