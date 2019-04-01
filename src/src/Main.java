import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.Timer;


/*
 * -Write update method
 * -Set  variables with initial locations
 * -Make setters for dx and dy methods
 * -Make an interface called updatable, so all of the components have that feature
 * -Make an arraylist to hold all of the balls
 * -Add the balls to the array list when spacebar is pressed, and then update
 */
public class Main extends JComponent
{
	private Ellipse2D.Double head;
	private Rectangle rightLeg, leftLeg, torso, arms;
	private int dx;
	private  int dy;
	public Main()
	{
		dx = 0;
		dy = 0;
		head = new Ellipse2D.Double(50, 0, 20, 20);
		this.setSize(21, 21);
		rightLeg = new Rectangle(50, 55, 7, 35);
		torso = new Rectangle(50, 20, 22, 35);
		leftLeg = new Rectangle(65, 55, 7, 35);
		arms = new Rectangle(30, 20, 62, 7);
	}
	
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(head);
		g2.fill(rightLeg);
		g2.fill(torso);
		g2.fill(leftLeg);
		g2.fill(arms);
	}
	
	public int getDY()
	{
		return dy;
	}
	
	public int getDX()
	{
		return dx;
	}
	
	public void setDX(int a)
	{
		dx = a;
	}
		
	public void setDY(int a)
	{
		dy = a;
	}

	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}

}	
