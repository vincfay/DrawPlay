import javax.swing.JPanel;

import java.awt.*;
import java.awt.geom.*;


public class Tele {

	private static final int TELE_LARGEUR = 100;
	private static final int TELE_HAUTEUR = 80;
	
	public void draw(Graphics g, int teleX, int teleY)
	{
		Graphics2D g2 = (Graphics2D) g;

		// Draw the head
		g2.setColor(Color.cyan);
		g2.drawRect(teleX, teleY, TELE_LARGEUR, TELE_HAUTEUR);
		
	}
}
