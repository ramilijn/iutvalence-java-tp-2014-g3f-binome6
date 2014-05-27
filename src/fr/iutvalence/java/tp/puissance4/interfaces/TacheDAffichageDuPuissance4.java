package fr.iutvalence.java.tp.puissance4.interfaces;

import java.awt.Color;
import java.awt.Component;
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
	
	private GrillesPions GrilleDePion;
	
	@Override
	public void run()
	{
		this.unefenetre = new JFrame();
		this.unefenetre.setTitle("PUISSANCE 4");
		this.unefenetre.setSize(900, 800);
		this.unefenetre.setJMenuBar(new BarreDeMenuPuissance4(this.unefenetre));
		this.UnPanneauDeJeu = new PanneauDeBoutonsDeJeu() ;
		this.GrilleDePion = new GrillesPions() ;
		this.PremierPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		this.PremierPane.add(this.UnPanneauDeJeu);
		this.PremierPane.add(this.GrilleDePion);
		this.PremierPane.setEnabled(false);
		this.PremierPane.setBorder(null);
		this.PremierPane.setDividerSize(0);
		this.PremierPane.setResizeWeight(1.0);
		
		this.unefenetre.getContentPane().add(this.PremierPane);
		this.unefenetre.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		JComponent source = (JComponent) event.getSource();
		
		if (source.getParent() == this.UnPanneauDeJeu)
		{
			return;
		}

		if (source.getParent() == this.GrilleDePion)
		{
			return;
		}
	}
	
	

}
