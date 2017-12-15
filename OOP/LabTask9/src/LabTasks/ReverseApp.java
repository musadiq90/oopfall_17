package LabTasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ReverseApp extends JFrame{
    JPanel panel;
    TextField textField;
    Button btn;
    Label label;

    ReverseApp(){
        setSize(500,500);
        setVisible(true);

        panel = new JPanel();

        btn = new Button("OK");
        textField = new TextField();
        label = new Label("");

        btn.setBounds(50,200,60,20);
        textField.setBounds(50,100,60,20);
        label.setBounds(50,50,60,20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                String strRev="";
                for(int i=str.length()-1; i>=0; i--){
                    strRev+=str.charAt(i);
                }
                label.setText(strRev);
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        panel.add(textField);
        panel.add(label);
        panel.add(btn);

        getContentPane().add(panel);
    }

    public static void main(String[] args){
        ReverseApp app = new ReverseApp();
    }

}