package Assignment3;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class MultiplicationProblem {
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
        final JTextField text1 = new JTextField(20);


        JPanel panel = new JPanel();
        JButton button = new JButton("Calculate");
        panel.add(button);

        f.getContentPane().add(slider);
        f.getContentPane().add(panel);
        f.getContentPane().add(text1);
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
                BigInteger a= BigInteger.valueOf(Integer.parseInt(String.valueOf(slider.getValue())));
                BigInteger product = new BigInteger("1");
                text1.setText(String.valueOf(slider.getValue()));

                BigInteger value = new BigInteger("1");
                BigInteger inc = new BigInteger("1");
                for(BigInteger i=BigInteger.ONE; i.compareTo(a)<=0;i = i.add(inc)){
                    product = i.multiply(product);

                }

                text.setText(product.toString());
            }
        });

        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
