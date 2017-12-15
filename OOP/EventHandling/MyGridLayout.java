package EventHandling;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout {
    JFrame jf;
    public MyGridLayout() {
        jf =new JFrame();

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        b1.setBackground(Color.white);
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.white);
        b4.setBackground(Color.BLACK);
        b5.setBackground(Color.white);
        b6.setBackground(Color.BLACK);
        b7.setBackground(Color.white);
        b8.setBackground(Color.BLACK);
        b9.setBackground(Color.white);

        jf.setLayout(new GridLayout(3,3));
        jf.setSize(300,300);
        jf.setLocation(200,200);


        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}
