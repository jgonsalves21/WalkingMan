
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Game 
{

	
	
	public static void main(String[] args) 
	
	{
		JFrame myFrame = new JFrame();
		myFrame.setLayout(null);
		myFrame.setBounds(100, 100, 600, 600);
		
		Main man = new Main();
		man.setBounds(30, 30, 200, 200);
		myFrame.add(man);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		man.addKeyListener(new KeyListener()
		{
			
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == e.VK_UP)
				{
					man.setDY(15);						
				}
				if(e.getKeyCode() == e.VK_DOWN)
				{
					man.setDY(-15);						
				}
				if(e.getKeyCode() == e.VK_LEFT)
				{
					man.setDX(-15);						
				}
				if(e.getKeyCode() == e.VK_RIGHT)
				{
					man.setDX(15);					
				}
				
			}
			
			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyCode() == e.VK_UP)
				{
					man.setDY(0);						
				}
				if(e.getKeyCode() == e.VK_DOWN)
				{
					man.setDY(0);	
					
				}
				if(e.getKeyCode() == e.VK_LEFT)
				{
					man.setDX(0);						
				}
				if(e.getKeyCode() == e.VK_RIGHT)
				{
					man.setDX(0);				
				}
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) 
			{
				
				
			}
	
		});

	}


		
}
	


