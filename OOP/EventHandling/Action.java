package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action extends JFrame {
    private  JTextField item1;
    private  JTextField item2;
    private  JTextField item3;
    private  JPasswordField password;


    public Action(){
        super("the title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("enter text here");
        add(item2);

        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);

        password = new JPasswordField("mypass");
        add(password);

        TheHandler handler = new TheHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        password.addActionListener(handler);


    }
    private class TheHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


            String str = "";
            if(e.getSource()==item1)
                str=String.format("field 1: %s", e.getActionCommand());
            else if(e.getSource()==item2)
                str=String.format("field 2: %s", e.getActionCommand());
            else if(e.getSource()==item3)
                str=String.format("field 3: %s", e.getActionCommand());
            else if(e.getSource()==password)
                str=String.format("field password is: %s", e.getActionCommand());
            JOptionPane.showMessageDialog(null, str);

        }
    }

    public static void main(String[] args) {

        Action act = new Action();
        act.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        act.setSize(350,100);
        act.setLocation(450,350);
        act.setVisible(true);

    }
}
