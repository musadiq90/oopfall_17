package practice;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;



public class Chess {
    private Color c1;
    private Color c2;

    Chess(Color c, Color c3){
        this.c1 = c;
        this.c2 = c3;
        JButton b1 = new JButton();
    }

    void paint(Graphics g){
        g.setColor(c1);
        g.fillRect(200,200,800,800);
        g.setColor(c2);
        for( int i = 200;i <= 800;i+=200){
            for( int j = 200; j <= 800; j+= 200){
                g.fillRect(i,j,100,100);
            }
        }
        for( int i = 300;i <= 900;i+=200){
            for( int j = 300; j <= 900; j+= 200){
                g.fillRect(i,j,100,100);
            }
        }

    }
    public static void main(String[] args){
        JFrame f = new JFrame("Checkers");
        f.setSize(1200,1200);
        final Chess frame = new Chess(Color.green, Color.WHITE);
        //here it gives us an error
       // f.getContentPane().add(frame);
        f.setLocationRelativeTo(null);
        f.setBackground(Color.lightGray);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JButton b1 = new JButton("Click here");
        f.getContentPane().add(b1, "North");
        b1.setSize(20,20);




    }
}
