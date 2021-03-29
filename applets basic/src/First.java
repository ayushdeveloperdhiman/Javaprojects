import java.applet.Applet;
import java.awt.*;

public class First extends Applet {
    public void init(){}
    public void paint(Graphics g){
        Font f=new Font("TimesRoman",Font.ITALIC,36);
        g.setFont(f);
        Color c=new Color(40,50,80);
        g.setColor(c);
            g.drawString("Wellcom", 150, 150);
        }   }

