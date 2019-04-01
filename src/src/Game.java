
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Game extends JFrame implements ActionListener
{

	private int x = 200;
	private int y = 200;
	private Main man = new Main();
	private Ball ball = new Ball();
	
	public Game()
	{
		setBounds(50,50, 800, 600);
		setTitle("Game");
		setLayout(null);
		setFocusable(true);
		
		Timer t1 = new Timer(5, this);
		t1.start();
		
		man.setBounds(x,y,100,100);
		add(man);
		
		addKeyListener(new KeyListener()
			{
			
			public void keyPressed(KeyEvent e)
			{
					if(e.getKeyCode() == e.VK_UP)
					{
						 man.setDY(10);					
					}
					if(e.getKeyCode() == e.VK_DOWN)
					{
						man.setDY(-10);						
					}
					if(e.getKeyCode() == e.VK_LEFT)
					{
						man.setDX(-10);						
					}
					if(e.getKeyCode() == e.VK_RIGHT)
					{
						man.setDX(10);					
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
				public void keyTyped(KeyEvent arg0) {
				
					
				}
			});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if (man.getX() <= 50)
		{
			man.setLocation(50, man.getY());
		}
		else if (man.getX >= 650)
		{
			man.setLocation(650, man.getY());
		}
		else if (man.getY() <= 100)
		{
			man.setLocation(man.getX(), 100));
		}
		else if (man.g)
	}
	
	
	public static void main(String[] args)
	{
		Game game = new  Game();
	}
	
}

	

	
	


		

	


