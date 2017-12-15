package Assignments;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                int a=Integer.parseInt(text1.getText());
                int b=Integer.parseInt(text2.getText());

                int product = 1;
                for (int i=a; i<=b; i++) {
                  product=product*i;
                }
                text3.setText(String.valueOf(product));
            }
        });
        f.pack();
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

