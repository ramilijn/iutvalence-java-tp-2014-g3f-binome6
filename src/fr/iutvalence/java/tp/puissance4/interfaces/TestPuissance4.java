package fr.iutvalence.java.tp.puissance4.interfaces;

import javax.swing.SwingUtilities;


public class TestPuissance4 {

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new TacheDAffichageDuPuissance4());
		System.out.println("fin du main !");
	}
}
