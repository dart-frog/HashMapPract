import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.text.JTextComponent;
public class Screen {
	public static void main(String[] args)throws FileNotFoundException{
		setUp();
		
	}
	
	public static void setUp() throws FileNotFoundException{
		File inputFile = new File("input.txt");
		Scanner fileScan = new Scanner(inputFile);
		
		MyHashMap t = new MyHashMap(10);
		
		while (fileScan.hasNext()) {
			String str = fileScan.nextLine();
			String[] kvp = str.split(" ");
			String key = kvp[0];
			String value = kvp[1];
			t.set(key, value);
		}
		ArrayList<String> keys = (ArrayList<String>) t.getKeys();
		int formalSize = 0;
		for (int i = 0; i < t.size(); i++){
			for (int j = 0; j < t.bucketSize(i); j++){
				String myKey = keys.get(formalSize);
				String myVal = t.get(myKey);
			
			
			
			JLabel yellowLabel = new JLabel(myKey + " " + myVal);       
			yellowLabel.setOpaque(true);       
			yellowLabel.setBackground(new Color(248, 213, 131));        
			yellowLabel.setPreferredSize(new Dimension(200, 180));
			
			formalSize++;
			}
		}
		
		JPanel p = new JPanel();
		
		JFrame frame = new JFrame("TopLevelDemo");       
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//p.add(yellowLabel, BorderLayout.CENTER);
		
		//JLabel yellowLabel = new JLabel("word");       
		//yellowLabel.setOpaque(true);       
		//yellowLabel.setBackground(new Color(248, 213, 131));        
		//yellowLabel.setPreferredSize(new Dimension(200, 180));
		
		
		
		frame.add(p);
		frame.pack();       
		frame.setVisible(true);
		

	}
	public static void display(){
		
	}
}
