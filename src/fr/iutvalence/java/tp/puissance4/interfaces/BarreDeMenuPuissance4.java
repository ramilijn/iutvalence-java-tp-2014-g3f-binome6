package fr.iutvalence.java.tp.puissance4.interfaces;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarreDeMenuPuissance4 extends JMenuBar implements ActionListener{
	
	private JFrame unefenetre;
	
	private JMenuItem Information;
	
	private JMenuItem Fermer;
	
	public BarreDeMenuPuissance4(JFrame Fenetre){
		this.unefenetre = Fenetre;
		
		JMenuBar BarreDeMenu = new JMenuBar();

		JMenu unMenu = new JMenu("Menu");

		this.Information = new JMenuItem("Information");

		this.Information.addActionListener(this);

		unMenu.add(this.Information);

		this.Fermer = new JMenuItem("Fermer");
		this.Fermer.addActionListener(this);
		unMenu.add(this.Fermer);
		BarreDeMenu.add(unMenu);
	}

	@Override
	public void actionPerformed(ActionEvent event){
		JMenuItem UnItem = (JMenuItem) event.getSource();
		if (UnItem == this.Information)
		{
			JOptionPane.showMessageDialog(this.unefenetre, "Une application qui joue une partie de puissance 4", "Information", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if (UnItem == this.Fermer)
		{
			if (JOptionPane.showConfirmDialog(this.unefenetre, "Voulez vous vraiment fermer ?", "Confirmez votre choix", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				this.unefenetre.dispose();
		}
	}
	
}
