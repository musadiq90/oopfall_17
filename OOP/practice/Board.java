package practice;


        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.Random;

public class Board extends JPanel{
    public static int x;
    public static int y;
    Color c1;
    Color c2;
    public void paint(Graphics g){

        g.setColor(c1);
        g.fillRect(0,0,x,y);
        g.setColor(c2);
        for (int i =0;i<640;i=i+160){
            for (int j =0;j<640;j+=160){
                g.fillRect(i,j,x,y);

            }
        }
        for (int i =80;i<640;i=i+160){
            for (int j =80;j<640;j+=160){
                g.fillRect(i,j,x,y);

            }

        }
    }



    public static void main(String[] args) {
        x = 640/8;
        y = 640/8;
        JFrame jf = new JFrame("chess");
        jf.setLocation(50,50);
        jf.setSize(800,900);
        Board board=new Board();
        board.c1= Color.red;
        board.c2= Color.yellow;


        JButton jb = new JButton("button");
        jb.setSize(100,50);
        jb.setLocation(400,700);
        jf.add(jb);

        jb.addActionListener( new ActionListener() {
            boolean changeColor1=true;
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor1=!changeColor1;
                if(changeColor1){
                    board.c1=new Color(new Random().nextInt());
                }else{
                    board.c2=new Color(new Random().nextInt());
                }
                board.repaint();


            }
        });


        jf.getContentPane().add(board);
        jf.setLocationRelativeTo(null);
        jf.setBackground(board.c1);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
