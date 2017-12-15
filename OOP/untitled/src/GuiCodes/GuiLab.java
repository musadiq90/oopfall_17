package GuiCodes;

import javax.swing.*;
import java.awt.*;

public class GuiLab {
    JFrame f;
    JPanel p;
    JButton b;
    JLabel label;
    JTextField txt;
    public GuiLab() {
        print();
    }
    public void print(){
        f = new JFrame("GUILab");

        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setBackground(Color.lightGray);

        b =new JButton("Button");
        b.setBounds(140,250,150,50);

        txt =new JTextField();

        p.add(b);
        p.add(txt);

        f.add(p);
        f.setLayout(null);
        f.setVisible(true);


        label = new JLabel("this is test label");


    }
    public static void main(String[] args) {
        new GuiLab();
    }
}
