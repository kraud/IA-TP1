package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JFrame;

import domain.Casillero;


public class VistaPrincipal extends JFrame implements ActionListener{
	
	JFrame ventana = new JFrame();
	PanelItem smartToyItem = new PanelItem("/img/smartToyImg.png");
	PanelItem objetivoItem = new PanelItem("/img/objetivo.png");
	PanelFondo mapaFondo = new PanelFondo("/img/mapaImg.png");
	PanelFondo aprox = new PanelFondo("/img/alert.png");
	
	public VistaPrincipal(Casillero smartToy, Casillero objetivo, List<Casillero> nodosObstaculos, List<Casillero> nodosObstrucciones){
		
		//set imagen smartToy
		int smartToyPosX = convertirAPixelesX(smartToy.getCoordenada().get(0));
		int smartToyPosY = convertirAPixelesY(smartToy.getCoordenada().get(1));

		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		smartToyItem.setBounds(smartToyPosX, smartToyPosY, 25, 25);
		smartToyItem.setSize(25, 25);
		ventana.add(smartToyItem);
		smartToyItem.setVisible(true);
		//set imagen objetivo
		int objetivoPosX = convertirAPixelesX(objetivo.getCoordenada().get(0).intValue());
		int objetivoPosY = convertirAPixelesY(objetivo.getCoordenada().get(1).intValue());

		objetivoItem.setBounds(objetivoPosX, objetivoPosY, 25, 25);
		objetivoItem.setSize(25, 25);
		ventana.add(objetivoItem);
		objetivoItem.setVisible(true);
		
		/*
		//seteo imagen aproximado 
		int aproxX= posAprox.getCoordenada().get(0).intValue();
		int aproxY= posAprox.getCoordenada().get(1).intValue();
		// TODO: Falta convertir aproxX y aproxY a sus valores en pixeles
		aprox.setBounds(aproxX, aproxY, 25, 25);
		aprox.setSize(25, 25);
		ventana.add(aprox);
		aprox.setVisible(true);
		*/
		
		//agrego obsttrucciones a la imagen
		for(Casillero n : nodosObstrucciones){
			int obstruccionX = convertirAPixelesX(n.getCoordenada().get(0).intValue());
			int obstruccionY = convertirAPixelesY(n.getCoordenada().get(1).intValue());

			PanelFondo agua = new PanelFondo("/img/obstruccion.png");
			agua.setBounds(obstruccionY, obstruccionX, 25, 25);
			agua.setSize(25, 25);
			ventana.add(agua);
			agua.setVisible(true);
		}
		
		for(Casillero n : nodosObstaculos){
			if(n.isObstaculo()){
				int obstaculoX = convertirAPixelesX(n.getCoordenada().get(0).intValue());
				int obstaculoY = convertirAPixelesY(n.getCoordenada().get(1).intValue());

				PanelItem bloqueo = new PanelItem("/img/obstaculo.png");
				bloqueo.setBounds(obstaculoY, obstaculoX, 25, 25);
				bloqueo.setSize(25, 25);
				ventana.add(bloqueo);
				bloqueo.setVisible(true);
			}
		}
		
		ventana.add(mapaFondo);
		ventana.setSize(1527,850);
		ventana.setVisible(true);
		ventana.setResizable(false);
		try{
			Thread.sleep(500);
		}
		catch(Exception e){}
		}
		
	public void actualizarPosicionAuto(Casillero nodoActual){
		try{
			Thread.sleep(200);
		}
		catch(Exception e){}
		int posXAux = convertirAPixelesX(nodoActual.getCoordenada().get(0).intValue());
		int posYAux = convertirAPixelesY(nodoActual.getCoordenada().get(1).intValue());

		smartToyItem.setBounds(posXAux,posYAux, 25, 25);
		smartToyItem.revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public int convertirAPixelesX(double pos){
		int valorEnPixeles = 0;
		valorEnPixeles = ((int)pos*50);
		return valorEnPixeles;
	}
	
	public int convertirAPixelesY(double pos){
		int valorEnPixeles = 0;
		valorEnPixeles = (16*50)-((int)pos*50);
		return valorEnPixeles;
	}
}
