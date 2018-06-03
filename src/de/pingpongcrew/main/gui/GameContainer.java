package de.pingpongcrew.main.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameContainer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane;

	public GameContainer(de.pingpongcrew.main.KeyListener kl) {
		super();
		initialize();
		addKeyListener(kl);
	}

	private void initialize() {
		// TODO Auto-generated method stub
		this.setResizable(false);
		this.setBounds(312, 184, 2500, 2500);
		this.setMinimumSize(new Dimension(2500, 2500));
		this.setMaximumSize(new Dimension(2500, 2500));
		jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());
		this.setContentPane(getJContentPane());
		this.setTitle("Pong");
		
		setVisible(true);
		// jContentPane.add(getPanel(), BorderLayout.CENTER);
	}

	private JPanel getJContentPane() {

		return jContentPane;

	}

}
