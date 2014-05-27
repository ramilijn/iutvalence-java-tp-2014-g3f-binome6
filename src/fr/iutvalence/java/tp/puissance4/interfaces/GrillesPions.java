package fr.iutvalence.java.tp.puissance4.interfaces;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class GrillesPions extends JLabel
{
	private void creerUneGrilleDeJeton(int nombredelignes, int nombredecolonnes, char[] labels, ActionListener auditeurBoutons)
	{
		
	this.setLayout(new GridLayout(nombredelignes, nombredecolonnes));	
	for (int Jeton = 0; Jeton<labels.length; Jeton++)
	{
		JLabel jeton = new JLabel(""+labels[Jeton]);
		this.setIcon(new ImageIcon("FockingCase.png"));
		this.add(jeton);
	}
		
	}
}
