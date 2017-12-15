package LabTasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaFxConstructor  {
    JFrame f;
    JTextField txt;
    public JavaFxConstructor() {
    f =new JFrame();
    f.setLocation(400,10);
    f.setTitle("JavaFX");
        Container cp = f.getContentPane();
        txt =new JTextField();
        cp.add(txt, "South");
    JButton b = new JButton("button");
    b.setBounds(200,500,150,50);
   cp.add(txt, "South");


    //f.add(b);
    f.add(txt);

    f.setSize(600,800);
    f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JavaFxConstructor();
    }
}
