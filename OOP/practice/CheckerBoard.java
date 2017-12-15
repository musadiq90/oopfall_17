package practice;

import javax.swing.*;
import java.awt.*;

public class CheckerBoard {
    JFrame jf;
    JButton[] jb = new JButton[64];
    public CheckerBoard() {
        jf = new JFrame();

        for (int i=0; i<64; i++){
            jf.add(jb[i]);

            if(i%2==0) {
                jb[i].setBackground(Color.black);
            }
                else{
                jb[i].setBackground(Color.white);
            }

        }
        jf.setLayout(new GridLayout(8, 8));
        jf.setSize(500,500);
        jf.setLocation(300,300);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new CheckerBoard();
    }
}
