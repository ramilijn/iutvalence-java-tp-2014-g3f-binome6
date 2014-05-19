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
	
	private JSplitPane DeuxiemePane;
	
	private PanneauDeBoutonsDeJeu UnPanneauDeJeu;
	
	@Override
	public void run()
	{
		this.unefenetre = new JFrame();
		this.unefenetre.setTitle("PUISSANCE 4");
		this.unefenetre.setSize(900, 800);
		this.unefenetre.setJMenuBar(new BarreDeMenuPuissance4(this.unefenetre));
		
		this.PremierPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		this.PremierPane.add(UnPanneauDeJeu);
		this.PremierPane.add(DeuxiemePane);
		this.PremierPane.setEnabled(false);
		this.PremierPane.setBorder(null);
		this.PremierPane.setDividerSize(0);
		
		this.unefenetre.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	

}
