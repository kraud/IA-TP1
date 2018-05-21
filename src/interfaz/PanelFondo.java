package interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class PanelFondo extends javax.swing.JPanel {
	private String ubicacionImagen = "";
	public PanelFondo(String nuevaUbicacion){
		this.setSize(825,675);
		ubicacionImagen = nuevaUbicacion;
	}
	@Override
	public void paintComponent (Graphics g){
		Dimension tam = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource(ubicacionImagen));
		g.drawImage(imagenFondo.getImage(),0,0,tam.width, tam.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}
