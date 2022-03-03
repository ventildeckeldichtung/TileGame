package game;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainGame {
	public static void main(String argv[]){
		JFrame gamewindow = new JFrame();
		gamewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamewindow.setSize(800, 600);
		//gamewindow.setLayout(null);
		gamewindow.setVisible(true);
		GamePanel gp = new GamePanel();
		gamewindow.getContentPane();
		try {
			BufferedImage img = ImageIO.read(new File("pinguine-paar.jpeg"));
			gp.LoadImage(img);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gamewindow.add(gp);
		gamewindow.setVisible(true);
	}
}
