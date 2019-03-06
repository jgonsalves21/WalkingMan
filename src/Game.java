import javax.swing.JFrame;

public class Game {

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

	}

}
