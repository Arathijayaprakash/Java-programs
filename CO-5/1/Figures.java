import java.awt.*;
import java.applet.*;
/*
<applet code="Figures" width=200 height=300>
</applet>
*/
public class Figures extends Applet{
	public void init(){
		setBackground(Color.black);
		setForeground(Color.pink);
	}
	public void paint(Graphics g){
		g.fillOval(100,100,300,300);
		g.fillRect(500,100,200,300);
		g.drawLine(900,100,1200,400);
	}
}