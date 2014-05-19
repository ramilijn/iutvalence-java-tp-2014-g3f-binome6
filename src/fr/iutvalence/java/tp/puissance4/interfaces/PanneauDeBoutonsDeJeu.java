package fr.iutvalence.java.tp.puissance4.interfaces;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauDeBoutonsDeJeu extends JPanel {

	private void creerUneGrilleDeBouton(int nombredelignes, int nombredecolonnes, char[] labels, ActionListener auditeurBoutons)
	{
		
	this.setLayout(new GridLayout(nombredelignes, nombredecolonnes));	
	for (int Bouton = 0; Bouton<labels.length; Bouton++)
	{
		JButton bouton = new JButton(""+labels[Bouton]);
		bouton.setFocusable(false);
		bouton.addActionListener(auditeurBoutons);
		this.add(bouton);	
	}
		
	}

}
