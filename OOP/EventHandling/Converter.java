package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;


public class Converter extends JFrame {
    public Converter(){
        //Buttons to be used for Action Events
        setLayout(new GridLayout(2,2));
        JButton convert = new JButton("Convert");
        JButton clear = new JButton("Clear");
        JLabel lb = new JLabel("LB");
        JLabel kg = new JLabel("KG");
        final JTextField f1 = new JTextField(8);
        final JTextField f2 = new JTextField(8);

        //JPanel p1 to hold labels and TextAreas
        JPanel p1 = new JPanel(new GridLayout(2,2));
        p1.add(lb);
        p1.add(f1);
        p1.add(kg);
        p1.add(f2);

        add(p1);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.add(convert);
        p2.add(clear);

        add(p2);


        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f1.setText(null);
                f2.setText(null);
            }
        });

        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String lbsInput = f1.getText();
                    double LBs = Double.parseDouble(lbsInput);
                    double KGs = LBs * .4539;
                    String ans = Double.toString(KGs);
                    f2.setText(ans);
                }
                catch(InputMismatchException ex) {
                    JOptionPane.showMessageDialog(null,"Input must be Integer!");
                }

            }
        });
    }



    public static void main(String[] args) {
        Converter frame = new Converter();
        frame.setSize(300,200);
        frame.setTitle("Measurement Unit Converter");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }

}
