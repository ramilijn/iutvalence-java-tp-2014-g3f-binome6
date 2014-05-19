package fr.iutvalence.java.tp.puissance4.interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class TacheDAffichageDuPuissance4 implements Runnable, ActionListener
{
	private JFrame unefenetre;
	
	private JMenuItem Information;
	
	private JMenuItem Fermer;
	
	private JSplitPane PremierPane;
	
	private PanneauDeBoutonsDeJeu UnPanneauDeJeu;
	
	@Override
	public void run()
	{
		this.unefenetre = new JFrame();
		this.unefenetre.setTitle("PUISSANCE 4");
		this.unefenetre.setSize(900, 800);
		this.unefenetre.setVisible(true);
		
		JMenuBar BarreDeMenu = new JMenuBar();

		JMenu unMenu = new JMenu("Menu");

		this.Information = new JMenuItem("Information");

		this.Information.addActionListener(this);

		unMenu.add(this.Information);

		this.Fermer = new JMenuItem("Fermer");
		this.Fermer.addActionListener(this);
		unMenu.add(this.Fermer);
		BarreDeMenu.add(unMenu);
		
		
		this.PremierPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		this.PremierPane.add(UnPanneauDeJeu);
		this.PremierPane.add(DeuxiemePane);
		this.unefenetre.setJMenuBar(BarreDeMenu);
		this.unefenetre.setVisible(true);
	}
	
	
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
