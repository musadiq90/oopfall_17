package LabTasks;



import javax.swing.*;
import java.awt.*;

public class MyJavafx {

    public static void main(String[] args) {
JFrame f = new JFrame();
JButton b = new JButton("click");
b.setBounds(115,130,100,40);
f.add(b);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
    }
}