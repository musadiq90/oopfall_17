package Gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Chess1 extends JPanel {

    private Color color1;
    private Color color2;

    private Chess1(Color color1,Color color2){
        this.color1= color1;
        this.color2= color2;
    }

    public void paint(Graphics g){
        g.setColor(color1);
        g.fillRect(200, 200 ,800, 800);
        g.setColor(color2);

        for (int i=200;i<=800;i+=200){
            for(int j=200;j<=800;j+=200){
                g.fillRect(i,j,100,100);
            }
        }
        for(int i=300;i<=900;i+=200){
            for(int j=300;j<=900;j+=200){
                g.fillRect(i,j,100,100);
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        JFrame f=new JFrame();
        f.setSize(1200,1200);
        final Chess1 panel= new Chess1(Color.black, Color.white);
        f.getContentPane().add(panel);

        f.setBackground(Color.lightGray);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        JTextField rtxt = new JTextField();
        JTextField gtxt = new JTextField();
        JTextField btxt = new JTextField();
        f.getContentPane().add(rtxt);
        rtxt.setLocation(0,20);
        f.getContentPane().add(gtxt);
        f.getContentPane().add(btxt);

        JButton button = new JButton("Change" );
        f.getContentPane().add(button, "North");
        button.setSize(100,100);

        button.addActionListener(new ActionListener() {
            boolean colorchanger = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                colorchanger =!colorchanger;
//                Object rand=(int) Math.random()*100;
                float g = rand.nextFloat();
                float r = rand.nextFloat();
                float b = rand.nextFloat();
                Color randC = new Color(r,g,b);

                if(colorchanger)
                    panel.color1=randC;
                else
                    panel.color2 = randC;
                panel.repaint();


            }
        });



    }
}


