import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


/*
 * -Write update method
 * -Set  variables with initial locations
 * -Make setters for dx and dy methods
 * -Make an interface called updatable, so all of the components have that feature
 * -Make an arraylist to hold all of the balls
 * -Add the balls to the array list when spacebar is pressed, and then update
 */
public class Main extends JComponent implements KeyListener 
{
	private Ellipse2D.Double head;
	private Rectangle rightLeg, leftLeg, torso, rightArm, leftArm;
	
	public Main()
	{
		head = new Ellipse2D.Double(50, 0, 20, 20);
		this.setSize(21, 21);
		rightLeg = new Rectangle(50, 55, 7, 30);
		torso = new Rectangle(50, 20, 22, 35);
	}
	
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(head);
		g2.fill(rightLeg);
		g2.fill(torso);
	}
	

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
}
