package layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.QuadCurve2D;
import java.util.function.DoubleFunction;
/*  w w w . ja v  a 2  s. co m*/
import javax.swing.*;

public class PyramidGUI extends JPanel implements Runnable {

//    private AbstractButton uitvoervak;

    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 50;
        float PYRAMID_SIZE = 36f;
        String PYRAMID_TEXT = "Fill in the measures of the pyramid.";

        JLabel pyramidLabel = new JLabel(PYRAMID_TEXT, SwingConstants.CENTER);
        pyramidLabel.setFont(pyramidLabel.getFont().deriveFont(PYRAMID_SIZE));
        JPanel pyramidPanel = new JPanel();
        pyramidPanel.add(pyramidLabel);

        JPanel textPanelPyramid = new JPanel(new GridLayout(2, 0, 5, 0));
        JLabel labelLength = new JLabel("Length");
        JLabel labelWidth = new JLabel("Width");
        JLabel labelHeight = new JLabel("Height");
        JTextField textLength = new JTextField();
        JTextField textWidth = new JTextField();
        JTextField textHeight = new JTextField();
        textPanelPyramid.add(labelLength);
        textPanelPyramid.add(labelWidth);
        textPanelPyramid.add(labelHeight);
        textPanelPyramid.add(textLength);
        textPanelPyramid.add(textWidth);
        textPanelPyramid.add(textHeight);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 2, 0));
        JButton btnCreate = new JButton("Create");
        JButton btnCancel = new JButton("Cancel");
        buttonPanel.add(btnCreate);
        buttonPanel.add(btnCancel);

        pyramidPanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP,
                EB_GAP));
        pyramidPanel.setLayout(new BoxLayout(pyramidPanel, BoxLayout.PAGE_AXIS));
        pyramidPanel.add(Box.createVerticalStrut(VERT_GAP));
        pyramidPanel.add(textPanelPyramid);
        pyramidPanel.add(Box.createVerticalStrut(VERT_GAP));
        pyramidPanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(pyramidPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        btnCancel.addActionListener(e -> {
            frame.setVisible(false);
        });

        btnCreate.addActionListener(e -> {

            double pyramidHeight = Double.parseDouble(textHeight.getText());
            double pyramidLength = Double.parseDouble(textLength.getText());
            double pyramidWidth = Double.parseDouble(textWidth.getText());

            try {
                double volume = (pyramidHeight * pyramidWidth * pyramidLength) / 3;
                System.out.println(volume);
            }
            catch( NumberFormatException nfe ) {
//                uitvoervak.setText( "Please fill in numbers." );
                JOptionPane.showMessageDialog(null, "Please fill in numbers.");
            }
        });
    }
}