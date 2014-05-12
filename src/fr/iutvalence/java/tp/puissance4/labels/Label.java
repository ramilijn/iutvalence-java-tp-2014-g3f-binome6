package fr.iutvalence.java.tp.puissance4.labels;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;

public class Label extends JLabel
{

	
	public void run(){
		JFrame uneFenetre = new JFrame();
		
		uneFenetre.setTitle("L'image !");
		uneFenetre.setSize(100, 100);
		
		JLabel unlabel = new JLabel();
		this.setIcon(new ImageIcon( "FockingCase.png"));
		uneFenetre.setVisible(true);
	}
}
