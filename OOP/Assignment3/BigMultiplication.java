package Assignment3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class BigMultiplication extends JTextField {

    public BigMultiplication() {
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Calculate");
        f.getContentPane().setLayout(new BoxLayout(f.getContentPane(),
                BoxLayout.Y_AXIS));

        final JTextField  text1 = new JTextField(20);
        final JTextField text2 = new JTextField(20);
        final JTextField text3 = new JTextField(20);


        JPanel panel = new JPanel();
        JButton button = new JButton("Calculate");
        panel.add(button);
        f.getContentPane().add(text1);
        f.getContentPane().add(text2);
        f.getContentPane().add(panel);
        f.getContentPane().add(text3);

        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Action event from a text field");
            }
        };
        text1.addActionListener(l);
        text2.addActionListener(l);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BigInteger a=new BigInteger(text1.getText());
                BigInteger b=new BigInteger(text2.getText());
                BigInteger inc = new BigInteger("1");
                BigInteger product = new BigInteger("1");
                for (BigInteger i=a; i.compareTo(b)<=0; i= i.add(inc)) {
                  product=i.multiply(product);
                }
                text3.setText(product.toString());
            }
        });
        f.pack();
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

