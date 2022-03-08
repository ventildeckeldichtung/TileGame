package game;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainGame {
	
	public BufferedImage[][] createGame(int size, BufferedImage img) {
		int tilesize = img.getHeight()/size;
		
		int posx = 0;
		int posy = 0;
		BufferedImage tiles[][] = new BufferedImage[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				
				tiles[i][j] = img.getSubimage(posx, posy, tilesize, tilesize);
				posx += tilesize;
			}
			posx = 0;
			posy += tilesize;
		}
		return tiles;
	}
	public static void main(String argv[]) throws IOException {
		int size = 4;
		MainGame mg = new MainGame();
		BufferedImage img = ImageIO.read(new File("pinguine-paar.jpeg"));
		BufferedImage tiles[][] = mg.createGame(size, img);
		JFrame gamewindow = new JFrame();
		gamewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamewindow.setSize(800, 600);
		//gamewindow.setLayout(null);
		gamewindow.setVisible(true);
		GamePanel gp = new GamePanel();
		gp.addTiles(tiles);
		gamewindow.add(gp);
		gamewindow.setVisible(true);
	}
}
