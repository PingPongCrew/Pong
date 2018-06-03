package de.pingpongcrew.main;

import de.pingpongcrew.main.gui.GameContainer;

public class Main {

	public static int PADDLEWIDTH = 10;
	public static int PADDLEHEIGHT = 10;
	public static int BALLWIDTH = 2;
	public static int BALLHEIGHT = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control c = Control.getInstance();	GameContainer gc = new GameContainer(new KeyListener());
		c.run();
	
	}

}
