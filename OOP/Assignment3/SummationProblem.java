package Assignment3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SummationProblem extends JTextField {

    public static void main(String[] args) {
        JFrame f = new JFrame("Summation Problem");
        f.getContentPane().setLayout(new BoxLayout(f.getContentPane(),
                BoxLayout.Y_AXIS));

        JSlider slider = new JSlider();
        slider.setMinimum(1);
        slider.setMaximum(100);
        slider.setBounds (15,200,250,100);
        slider.setAutoscrolls(true);

        final JTextField text = new JTextField(20);


        JPanel panel = new JPanel();
        JButton button = new JButton("Calculate");
        panel.add(button);

        f.getContentPane().add(slider);
        f.getContentPane().add(panel);
        f.getContentPane().add(text);




        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Action event from a text field");
            }
        };
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int sleepSense = slider.getValue();
            }});


        text.addActionListener(l);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int a=Integer.parseInt(String.valueOf(slider.getValue()));
                int sum = 0;
                int count=1;
                int value = slider.getValue();
                for(int i=1; i<=value;i++){
                    sum= sum+i;
                }

                text.setText(String.valueOf(sum));
            }
        });

        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}