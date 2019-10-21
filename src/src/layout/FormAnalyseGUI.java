package layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*  w w w . ja v  a 2  s. co m*/
import javax.swing.*;

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
                        }






                //                    System.out.println("Block");
                //                    JLabel blockLabel = new JLabel("Measures Block", SwingConstants.CENTER);
                //                    blockLabel.setFont(blockLabel.getFont().deriveFont(TITLE_SIZE));
                //
                //                    JPanel blockPanel = new JPanel();
                //                    blockPanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP,
                //                            EB_GAP));
                //                    blockPanel.setLayout(new BoxLayout(blockPanel, BoxLayout.PAGE_AXIS));
                //                    blockPanel.add(blockLabel);
                //                    blockPanel.add(Box.createVerticalStrut(VERT_GAP));
                //                    blockPanel.add(comboPanel);
                //                    blockPanel.add(buttonPanel);
                //                    blockPanel.add(Box.createVerticalStrut(VERT_GAP));
                //
                //                    JFrame frame = new JFrame();
                //                    frame.getContentPane().add(blockPanel, BorderLayout.CENTER);
                //                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //                    frame.pack();
                //                    frame.setVisible(true);



                });


//                public void actionPerformed(ActionEvent actionEvent) {
//                    String command = actionEvent.getActionCommand();
//                    System.out.println("Selected: " + command);
//                }
//            };
//
//            btnCreate.setActionCommand("First");
//            btnCreate.addActionListener(actionListener);
//
//            JOptionPane.showMessageDialog(null, btnCreate);

        JTextArea textArea = new JTextArea(20, 30);

        JPanel mainPanel = new JPanel();
            mainPanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP,
                EB_GAP));
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
            mainPanel.add(titlePanel);
            mainPanel.add(Box.createVerticalStrut(VERT_GAP));
            mainPanel.add(comboPanel);
            mainPanel.add(buttonPanel);
            mainPanel.add(Box.createVerticalStrut(VERT_GAP));
            mainPanel.add(new JScrollPane(textArea));

        JFrame frame = new JFrame();
            frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }

}

