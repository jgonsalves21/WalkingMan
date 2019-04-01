import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent
{
	private Ellipse2D.Double ball;
	private int dX = 0;
	private int dY = 0;
	
	public Ball()
	{
		ball = new Ellipse2D.Double(0, 0, 15, 15);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics g1 = (Graphics2D) g;
		((Graphics2D) g1).fill(ball);
		
	}
	public void shoot()
	{
		setLocation(getX(), getY()-3);
	}

}
