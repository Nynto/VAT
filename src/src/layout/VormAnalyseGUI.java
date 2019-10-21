//package layout;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.LinkedList;
//
//public class VormAnalyseGUI extends JPanel implements Runnable, ActionListener {
//    public static boolean RIGHT_TO_LEFT = false;
//    private static JTextField textField;
//    private JFrame frame;
//    private JButton button;
//    private JComboBox comboBox;
//
//
//    public void addComponentsToPane(Container pane) {
//
//        if (!(pane.getLayout() instanceof BorderLayout)) {
//            pane.add(new JLabel("Container doesn't use BorderLayout!"));
//            return;
//        }
//
//        if (RIGHT_TO_LEFT) {
//            pane.setComponentOrientation(
//                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
//        }
//
////        JButton button = new JButton("Button 1 (PAGE_START)");
////        pane.add(button, BorderLayout.PAGE_START);
//
//        //Make the center component big, since that's the
//        //typical usage of BorderLayout.
//
////        button = new JButton("Button 2 (CENTER)");
////        button.setPreferredSize(new Dimension(200, 100));
////        pane.add(button, BorderLayout.CENTER);
//
////        button = new JButton("Button 3 (LINE_START)");
//        textField = new JTextField("Vorm");
//        pane.add(textField, BorderLayout.CENTER);
//
//        String[] allForms = {"Block","Cone","Cylinder","Pyramid","Sphere"};
//        JComboBox comboForms= new JComboBox(allForms);
//        comboForms.setSelectedIndex(4);
//        comboForms.setPreferredSize(new Dimension(20,10));
//        comboForms.addActionListener(this);
//        pane.add(comboForms);
//
////        JPanel container = new JPanel();
////        pane.add(comboForms, BorderLayout.CENTER);
//
//        button = new JButton("Long-Named Button 4 (PAGE_END)");
//        pane.add(button, BorderLayout.PAGE_END);
//
//        button = new JButton("5 (LINE_END)");
//        pane.add(button, BorderLayout.LINE_END);
//    }
//    //    private JButton knop;
////
////    public VormAnalyseGUI() {
////        setLayout(new BorderLayout(30,10));
////
////        JButton button = new JButton("Button 1 (PAGE_START)");
////        pane.add(button, BorderLayout.PAGE_START);
////    }
//
//
//    @Override
//    public void run() {
//        frame = new JFrame("Calculating Device Forms");
//        frame.setPreferredSize(new Dimension(400, 200));
//
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        addComponentsToPane(frame.getContentPane());
////        createComponents(frame.getContentPane());
//
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//}