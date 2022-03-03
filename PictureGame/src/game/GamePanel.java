package game;


import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GamePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	GamePanel(){
		this.setBounds(20, 20, 600, 600);
		this.setLayout(null);
	}
	public void LoadImage(BufferedImage img){
		Border blackborder =  BorderFactory.createEtchedBorder();
		BufferedImage subimg = img.getSubimage(1,1,60,60);
		JLabel pic = new JLabel(new ImageIcon(subimg));
		pic.setBorder(blackborder);
		Dimension size = pic.getPreferredSize();
		pic.setBounds(20, 20, size.width, size.height);
		
		this.add(pic);
		this.setVisible(true);
	}
}
