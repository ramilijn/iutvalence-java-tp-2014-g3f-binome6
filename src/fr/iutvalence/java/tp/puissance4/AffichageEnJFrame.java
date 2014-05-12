package fr.iutvalence.java.tp.puissance4;
import javax.swing.JFrame;


/**
 * 
 * @author ramilijn
 *
 */
public class AffichageEnJFrame implements Runnable 
{
/**
 * main de l'application AffichageEnJFrame
 * @param args
 */
		public void run()
		{
					
			JFrame unefenetre = new JFrame();
			
			unefenetre.setTitle("Bonjour");
			unefenetre.setSize(400,400) ;
			unefenetre.setVisible(true);
		}

	}


