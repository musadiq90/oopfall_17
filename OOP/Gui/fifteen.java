package Gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//  A  puzzle that allow user to move squares until values are in order.
public class fifteen  extends JFrame {
    //  create an array of references to the squares
    JButton [ ][ ] squares = new JButton [4][4];

    // Constructor: create 16 buttons and place them on a grid. Keep a two-dimensional array to be
    //  able to locate a given button on the grid.  Add an action listener to receive button events.

    public fifteen ( ) {
        Container container = getContentPane ( );
        container.setLayout( (new GridLayout( 4, 4)));

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton num = new JButton ( );
                squares [i] [j]= num;
                container.add( num);
            }
        }
        //  Create even handler as an implementation of
        //  ActionListener.

        ButaneListener pushed = new ButaneListener( );

        //  Indicate that every button event is handled by the listener object.
        for (int i = 0; i < 4; i++ ) {
            for (int j = 0; j < 4; j++) {
                squares [i][j].addActionListener (pushed);
            }
        }
    }   //  end fifteen

    public static void main(String[] args) {
        fifteen game = new fifteen ( );
        game.setTitle ("15 number puzzle");
        game.setSize( 400,  400);
        game.setVisible( true);
        game.scramble ( );
        game.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);


    }

    //USE THIS FOR THE MODEL FOR INIT(); ONLY NOW THE TILES WILL BE LABELED WITH
    // CONSECUTIVE INTEGERS
    public void scramble ( ) {
        //  fill the squares with random numbers. keep track of numbers already to ensure they are all distinct.

        boolean  [ ] used = new boolean [16];

        //  generate a random number between 0 and 15
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = (int)(16*Math.random ( ));
                // it will generate 15 numbers and the down step will
                // repeataion of numbers.
                while (used [x]) {
                    x = (int) (16 * Math.random ( ));
                }
                used [x] = true;

                //  leave one square empty and identify it
                //  by color
                if (x !=0) { // it will set the color of squares of windows.
                    squares[i][j].setText( "" + x);
                    squares[i][j].setBackground (Color.lightGray);
                }
                else
                    squares[i][j].setBackground (Color.blue);
            }
        }
    }


    public void moveSquare (int i, int j) {
        JButton empty = null;
        // this will allow user to move only the adjacent squares
        if (i < 3 && squares [i+1][j].getBackground( ) == Color.blue)
            empty = squares [i+1][j];
        if (i > 0 && squares [i -1][j].getBackground( ) == Color.blue)
            empty = squares [i -1][j];
        if (j < 3 && squares [i][j+1].getBackground( ) == Color.blue)
            empty = squares [i][j+1];
        if (j > 0 && squares [i][j -1].getBackground( ) == Color.blue)
            empty = squares [i][j -1];

        if (empty == null) return;    //  when a player pressed the other button not adjacent to empty square.

        else {
            empty.setText (squares [i][j].getText ( ));
            empty.setBackground (Color.lightGray);
            squares [i][j].setText("");
            squares [i][j].setBackground (Color.blue);

        }
    }    // end moveSquare
    //Declare an event class and specify that the class either implements an ActionListener interface or extends a class.
    class ButaneListener implements ActionListener
    {    //Include code that implements the methods in listener interface.
        public void actionPerformed(ActionEvent e)
        {
            Object square = e.getSource( );
            //  iterate over set of buttons to identify the
            //  one that got pushed.
            outer: for (int i = 0; i < 4; i++ )
            {
                for (int j = 0; j < 4; j++)
                {
                    if (squares [i][j] == square)
                    {
                        moveSquare (i, j);
                        break outer;

                    }
                }
            }
        }
    }
}