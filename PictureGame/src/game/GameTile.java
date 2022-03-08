package game;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameTile extends JLabel{

	private static final long serialVersionUID = 1L;
	private Integer number;
	private Integer tilesize;
	private Integer posx;
	private Integer posy;
	@Override 
	public String toString() {
		return posx.toString() + " " + posy.toString();
	}
	public GameTile(BufferedImage img, int posx, int posy, int n, boolean emptytile) {
		tilesize = img.getHeight();
		this.posx = posx;
		this.posy= posy;
		if(!emptytile) {
			this.setIcon(new ImageIcon(img));
			this.setLocation(posx*tilesize,posy*tilesize);
			this.setSize(img.getHeight(),img.getHeight());
			this.setBorder(BorderFactory.createCompoundBorder());
			this.number = n;
		}
		else {
			this.setOpaque(true);
			this.setBackground(Color.BLUE);
			this.setLocation(posx*tilesize,posy*tilesize);
			this.setSize(img.getHeight(),img.getHeight());
			this.setBorder(BorderFactory.createCompoundBorder());
			this.number = n;
		}
	}

}
