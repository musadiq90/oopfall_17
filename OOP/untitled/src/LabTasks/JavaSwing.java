package LabTasks;

import javax.swing.*;

public class JavaSwing {
    public void print(){
        JFrame f = new JFrame();
        f.setTitle("MyFirstJavaFX");
        JButton b = new JButton("click");
        JTextField txt = new JTextField(5);
        b.setBounds(115,330,100,40);
        f.add(b);
        f.add(txt);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JavaSwing obj = new JavaSwing();
        obj.print();
    }
}
