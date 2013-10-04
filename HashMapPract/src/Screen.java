import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;
public class Screen {
	public static void main(String[] args) {
		setUp();
	}
	
	public static void setUp(){
		JFrame frame = new JFrame("TopLevelDemo");       
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel yellowLabel = new JLabel();       
		yellowLabel.setOpaque(true);       
		yellowLabel.setBackground(new Color(248, 213, 131));        
		yellowLabel.setPreferredSize(new Dimension(200, 180));
		
		frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
		
		frame.pack();       
		frame.setVisible(true);
		JTextComponent MyText = new JTextComponent();
		


		JOptionPane.showMessageDialog(frame, "Hey!");

	}
}
