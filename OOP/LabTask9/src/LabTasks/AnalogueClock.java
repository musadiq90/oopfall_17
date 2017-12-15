package LabTasks.Clock;

import java.awt.*;

public class AnalogueClock {

    public void draw(Graphics g){
        g.setColor(Color.red);
        g.drawRoundRect(200,100,140,40,20,20);
        g.setColor(new Color(100,50,25));
        g.drawOval(400,100,100,100);
    }

}
