import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;
public class Screen {
	public static void main(String[] args) {
		setUp();
	}
	
	public static void setUp(){
		JPanel p = new JPanel();
		
		JFrame frame = new JFrame("TopLevelDemo");       
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JLabel yellowLabel = new JLabel("word");       
		yellowLabel.setOpaque(true);       
		yellowLabel.setBackground(new Color(248, 213, 131));        
		yellowLabel.setPreferredSize(new Dimension(200, 180));
		
		p.add(yellowLabel, BorderLayout.CENTER);
		
		frame.add(p);
		frame.pack();       
		frame.setVisible(true);
		

	}
}
