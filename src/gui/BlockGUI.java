package gui;

import vat.*;
import java.awt.*;
import javax.swing.*;

public class BlockGUI extends FormAnalyseGUI implements Runnable {

    public void run() {

        int VERT_GAP = 10;
        float BLOCK_SIZE = 25f;
        String BLOCK_TEXT = "Fill in the measures of the block.";

        JLabel blockLabel = new JLabel(BLOCK_TEXT, SwingConstants.CENTER);
        blockLabel.setFont(blockLabel.getFont().deriveFont(BLOCK_SIZE));
        JPanel blockPanel = new JPanel();
        blockPanel.add(blockLabel);

        JPanel textPanelBlock = new JPanel(new GridLayout(2, 0, 5, 0));
        JLabel labelLength = new JLabel("Length");
        JLabel labelWidth = new JLabel("Width");
        JLabel labelHeight = new JLabel("Height");
        JTextField textLength = new JTextField();
        JTextField textWidth = new JTextField();
        JTextField textHeight = new JTextField();
        textPanelBlock.add(labelLength);
        textPanelBlock.add(labelWidth);
        textPanelBlock.add(labelHeight);
        textPanelBlock.add(textLength);
        textPanelBlock.add(textWidth);
        textPanelBlock.add(textHeight);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 2, 0));
        JButton btnCreate = new JButton("Create");
        JButton btnCancel = new JButton("Cancel");
        buttonPanel.add(btnCreate);
        buttonPanel.add(btnCancel);

        blockPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        blockPanel.setLayout(new BoxLayout(blockPanel, BoxLayout.PAGE_AXIS));
        blockPanel.add(Box.createVerticalStrut(VERT_GAP));
        blockPanel.add(textPanelBlock);
        blockPanel.add(Box.createVerticalStrut(VERT_GAP));
        blockPanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(blockPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        btnCancel.addActionListener(e -> {
            frame.setVisible(false);
        });


        btnCreate.addActionListener(e -> {

            try {
                double blockLength = Double.parseDouble(textLength.getText());
                double blockWidth = Double.parseDouble(textWidth.getText());
                double blockHeight = Double.parseDouble(textHeight.getText());
                Form form = new Block(blockLength, blockWidth, blockHeight);
                forms.add(form);
                model.addElement(form);
                frame.setVisible(false);
            }
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Please fill in numbers.");
            }
        });
    }
}