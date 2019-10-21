import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.QuadCurve2D;
import java.util.function.DoubleFunction;
/*  w w w . ja v  a 2  s. co m*/
import javax.swing.*;

public class ConeGUI extends JPanel implements Runnable {

//    private AbstractButton uitvoervak;

    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 50;
        float CONE_SIZE = 36f;
        String CONE_TEXT = "What size is this cone?";

        JLabel coneLabel = new JLabel(CONE_TEXT, SwingConstants.CENTER);
        coneLabel.setFont(coneLabel.getFont().deriveFont(CONE_SIZE));
        JPanel conePanel = new JPanel();
        conePanel.add(coneLabel);

        JPanel textPanelCone = new JPanel(new GridLayout(2, 0, 5, 0));
        JLabel labelRadius = new JLabel("Radius");
        JLabel labelHeight = new JLabel("Height");
        JTextField textRadius = new JTextField();
        JTextField textHeight = new JTextField();
        textPanelCone.add(labelRadius);
        textPanelCone.add(labelHeight);
        textPanelCone.add(textRadius);
        textPanelCone.add(textHeight);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 2, 0));
        JButton btnCreate = new JButton("Create");
        JButton btnCancel = new JButton("Cancel");
        buttonPanel.add(btnCreate);
        buttonPanel.add(btnCancel);

        conePanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP,
                EB_GAP));
        conePanel.setLayout(new BoxLayout(conePanel, BoxLayout.PAGE_AXIS));
        conePanel.add(Box.createVerticalStrut(VERT_GAP));
        conePanel.add(textPanelCone);
        conePanel.add(Box.createVerticalStrut(VERT_GAP));
        conePanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(conePanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        btnCancel.addActionListener(e -> {
            frame.setVisible(false);
        });

        btnCreate.addActionListener(e -> {

            double coneHeight = Double.parseDouble(textHeight.getText());
            double coneRadius = Double.parseDouble(textRadius.getText());

            try {
                double volume = (Math.PI * Math.pow(coneRadius, 2) * coneHeight) / 3;
                System.out.println(volume);
            }
            catch( NumberFormatException nfe ) {
//                uitvoervak.setText( "Please fill in numbers." );
                JOptionPane.showMessageDialog(null, "Please fill in numbers.");
            }
        });
    }
}