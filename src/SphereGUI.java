import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.QuadCurve2D;
import java.util.function.DoubleFunction;
/*  w w w . ja v  a 2  s. co m*/
import javax.swing.*;

public class SphereGUI extends JPanel implements Runnable {

//    private AbstractButton uitvoervak;

    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 50;
        float SPHERE_SIZE = 36f;
        String SPHERE_TEXT = "What size is this sphere?";

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

        spherePanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP,
                EB_GAP));
        spherePanel.setLayout(new BoxLayout(spherePanel, BoxLayout.PAGE_AXIS));
        spherePanel.add(Box.createVerticalStrut(VERT_GAP));
        spherePanel.add(textPanelSphere);
        spherePanel.add(Box.createVerticalStrut(VERT_GAP));
        spherePanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(spherePanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        btnCancel.addActionListener(e -> {
            frame.setVisible(false);
        });

        btnCreate.addActionListener(e -> {

            double sphereRadius = Double.parseDouble(textRadius.getText());

            try {
                double volume = (Math.PI * Math.pow(sphereRadius, 3) * 4) / 3;
                System.out.println(volume);
            }
            catch( NumberFormatException nfe ) {
//                uitvoervak.setText( "Please fill in numbers." );
                JOptionPane.showMessageDialog(null, "Please fill in numbers.");
            }
        });
    }
}