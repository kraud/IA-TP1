package interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class PanelItem extends javax.swing.JPanel {
	String url;
	
	public PanelItem(String url) {
		this.setSize(25,25);
		this.url = url;
	}
	@Override
	public void paintComponent (Graphics g){
		Dimension tam = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource(url));
		g.drawImage(imagenFondo.getImage(),0,0,tam.width, tam.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
	
	public void setUrl(String urlNueva){
		this.url = urlNueva;
	}
}
