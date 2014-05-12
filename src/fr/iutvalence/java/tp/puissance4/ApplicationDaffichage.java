package fr.iutvalence.java.tp.puissance4;

import javax.swing.SwingUtilities;

public class ApplicationDaffichage
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new AffichageEnJFrame());
		System.out.println("C'est fini !");

	}

}
