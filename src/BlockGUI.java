import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.QuadCurve2D;
import java.util.function.DoubleFunction;
/*  w w w . ja v  a 2  s. co m*/
import javax.swing.*;

public class BlockGUI extends JPanel implements Runnable {

    private AbstractButton uitvoervak;

    public void run() {

        int VERT_GAP = 10;
        int EB_GAP = 50;
        float BLOCK_SIZE = 36f;
        String BLOCK_TEXT = "What size is this block?";

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

        blockPanel.setBorder(BorderFactory.createEmptyBorder(EB_GAP, EB_GAP, EB_GAP,
                EB_GAP));
        blockPanel.setLayout(new BoxLayout(blockPanel, BoxLayout.PAGE_AXIS));
        blockPanel.add(Box.createVerticalStrut(VERT_GAP));
        blockPanel.add(textPanelBlock);
        blockPanel.add(Box.createVerticalStrut(VERT_GAP));
        blockPanel.add(buttonPanel);

        JFrame frame = new JFrame();
        frame.getContentPane().add(blockPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        btnCancel.addActionListener(e -> {
            frame.setVisible(false);
        });

        btnCreate.addActionListener(e -> {

            double blockHeight = Double.parseDouble(textHeight.getText());
            double blockWidth = Double.parseDouble(textWidth.getText());
            double blockLength = Double.parseDouble(textLength.getText());

            Block block = new Block(1, blockHeight, blockWidth, blockLength);
        });
    }
}