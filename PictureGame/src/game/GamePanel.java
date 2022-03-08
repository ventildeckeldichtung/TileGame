package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class GamePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MouseListener listener;
	private String clickposition;
	GamePanel(){
		this.setBounds(20, 20, 800, 800);
		this.setLayout(null);
		this.listener = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getNeighbors(e.getSource().toString());
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}
	public GameTile[] getNeighbors(String position) {
		System.out.println(position.split(" ")[0]);
		
		return null;
	}
	public void addTiles(BufferedImage[][] tiles) {
		int size = tiles.length;
		int count=0;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				count+=1;
				if(i==0 && j==0) {
					GameTile gt = new GameTile(tiles[i][j],i,j, count, true);
					gt.addMouseListener(listener);
					this.add(gt);
				}
				GameTile gt = new GameTile(tiles[i][j],i,j, count, false);
				gt.addMouseListener(listener);
				this.add(gt);
			}
		}
		
	}


	
}
