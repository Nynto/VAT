package layout;

import com.sun.deploy.net.proxy.RemoveCommentReader;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*  w w w . ja v  a 2  s. co m*/
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public abstract class FormAnalyseGUI extends JPanel implements Runnable {

    public static void main(String[] args) {
        int BTN_COUNT = 1;
        int VERT_GAP = 10;
        int EB_GAP = 5;
        float TITLE_SIZE = 36f;
        String TITLE_TEXT = "Calculating Device for Forms";

        JLabel titleLabel = new JLabel(TITLE_TEXT, SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(TITLE_SIZE));
        JPanel titlePanel = new JPanel();
        titlePanel.add(titleLabel);

        String[] allForms = {"Choose a form!", "Block", "Cone", "Cylinder", "Pyramid", "Sphere"};

        JPanel comboPanel = new JPanel(new GridLayout(2, 0, 5, 0));
        JComboBox comboForms = new JComboBox(allForms);
        comboForms.setSelectedIndex(4);
        comboForms.setSelectedItem("Choose a form!");
        comboForms.setPreferredSize(new Dimension(100, 30));
        comboPanel.add(comboForms);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 5, 0));
        JButton btnCreate = new JButton("Create");
        JButton btnDelete = new JButton("Delete");


        buttonPanel.add(btnCreate);
        buttonPanel.add(btnDelete);

        btnCreate.addActionListener(e ->
                    {
                        if (comboForms.getSelectedItem().equals("Choose a form!")) {
                            JOptionPane.showMessageDialog(null, "Choose a form before you proceed.");
                        } else if (comboForms.getSelectedItem().equals("Block")) {
//                    System.out.println(comboForms.getSelectedItem());
                            BlockGUI block = new BlockGUI();
                            block.run();
                        } else if (comboForms.getSelectedItem().equals("Cone")) {
//                    System.out.println(comboForms.getSelectedItem());
                            ConeGUI cone = new ConeGUI();
                            cone.run();
                        } else if (comboForms.getSelectedItem().equals("Pyramid")) {
//                    System.out.println(comboForms.getSelectedItem());
                            PyramidGUI pyramid = new PyramidGUI();
                            pyramid.run();
                        } else if (comboForms.getSelectedItem().equals("Cylinder")) {
//                    System.out.println(comboForms.getSelectedItem());
                            CylinderGUI cylinder = new CylinderGUI();
                            cylinder.run();
                        } else if (comboForms.getSelectedItem().equals("Sphere")) {
//                    System.out.println(comboForms.getSelectedItem());
                            SphereGUI sphere = new SphereGUI();
                            sphere.run();
                        }
                    });



        JList listForms = new JList();
        listForms.setModel(new AbstractListModel() {
                String[] strings = {"Test1", "Test2", "Test3"};
                    @Override
                    public int getSize() {
                        return strings.length;
                    }
                    @Override
                    public Object getElementAt(int index) {
                        return strings[index];
                    }
            });

        btnDelete.addActionListener(e -> {
            System.out.println(listForms.getSelectedValue());
        });


        JPanel buttonPanel2 = new JPanel(new GridLayout(2,3));
        JButton btnSave = new JButton("Save");
        JButton btnLoad = new JButton("Load");
        buttonPanel.add(btnSave);
        buttonPanel.add(btnLoad);

        JPanel mainPanel = new JPanel();
            mainPanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP,
                EB_GAP));
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
            mainPanel.add(titlePanel);
            mainPanel.add(Box.createVerticalStrut(VERT_GAP));
            mainPanel.add(comboPanel);
            mainPanel.add(buttonPanel);
            mainPanel.add(Box.createVerticalStrut(VERT_GAP));
            mainPanel.add(new JScrollPane(listForms));
            mainPanel.add(Box.createVerticalStrut(VERT_GAP));
            mainPanel.add(buttonPanel2);

        JFrame frame = new JFrame();
            frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }

}

