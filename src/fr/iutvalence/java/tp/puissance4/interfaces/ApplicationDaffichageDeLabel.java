package fr.iutvalence.java.tp.puissance4.interfaces;

import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ApplicationDaffichageDeLabel
{

	public static void main(String[] args)
	{
		JLabel unlabel = new JLabel();
		ImageIcon uneimage = new ImageIcon("FockingCase.png");
		unlabel.setIcon(uneimage);
		unlabel.setVisible(true);
		
		

	}

}
