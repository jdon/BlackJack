package me.jdon.black.jack;

import java.awt.Frame;

import javax.swing.SwingUtilities;

public class MainClass {
	
	public static void main(String[] args) {
		Game g = new Game();
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		    	Frame b = new Board(g);
		    	b.setVisible(true);
		    }
		});
	}
}
