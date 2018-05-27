package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JFrame;

import domain.Casillero;
import frsf.cidisi.exercise.idemiatp1.search.EstadoAgente;


public class VistaPrincipal extends JFrame implements ActionListener{
	
	JFrame ventana = new JFrame();
	PanelItem smartToyItem = null;
	PanelItem usuarioItem = new PanelItem("/img/user.png");
	PanelItem destinoAgenteItem = new PanelItem("/img/objetivo.png");
	PanelFondo mapaFondo = new PanelFondo("/img/mapaImg.png");
	PanelFondo metaIntermedia = new PanelFondo("/img/alert.png");
	
	public VistaPrincipal(Casillero smartToy, char orientacionAgente, Casillero posicionUsuario, List<Casillero> nodosObstaculos, List<Casillero> nodosObstrucciones){
		
		//set imagen smartToy
		int smartToyPosX = convertirAPixelesX(smartToy.getCoordenada().get(0));
		int smartToyPosY = convertirAPixelesY(smartToy.getCoordenada().get(1));

		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		switch(orientacionAgente){
			case('n'):	smartToyItem = new PanelItem("/img/smartToyImgNORTE.png");
						break;
			case('s'):	smartToyItem = new PanelItem("/img/smartToyImgSUR.png");
						break;
			case('e'):	smartToyItem = new PanelItem("/img/smartToyImgESTE.png");
						break;
			case('o'):	smartToyItem = new PanelItem("/img/smartToyImgOESTE.png");
						break;
		}		
		
		smartToyItem.setBounds(smartToyPosX, smartToyPosY, 25, 25);
		smartToyItem.setSize(25, 25);
		ventana.add(smartToyItem);
		smartToyItem.setVisible(true);
		
		//set imagen posicion usuario
		int objetivoPosX = convertirAPixelesX(posicionUsuario.getCoordenada().get(0).intValue());
		int objetivoPosY = convertirAPixelesY(posicionUsuario.getCoordenada().get(1).intValue());

		usuarioItem.setBounds(objetivoPosX, objetivoPosY, 25, 25);
		usuarioItem.setSize(25, 25);
		ventana.add(usuarioItem);
		usuarioItem.setVisible(true);
		
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
		
		//agrego obstrucciones a la imagen
		for(Casillero n : nodosObstrucciones){
			int obstruccionX = convertirAPixelesX(n.getCoordenada().get(0).intValue());
			int obstruccionY = convertirAPixelesY(n.getCoordenada().get(1).intValue());

			PanelFondo obstruccion = new PanelFondo("/img/obstruccion.png");
			obstruccion.setBounds(obstruccionX, obstruccionY, 25, 25);
			obstruccion.setSize(25, 25);
			ventana.add(obstruccion);
			obstruccion.setVisible(true);
		}
		//agrego obstaculos a la imagen
		for(Casillero n : nodosObstaculos){
			if(n.isObstaculo()){
				int obstaculoX = convertirAPixelesX(n.getCoordenada().get(0).intValue());
				int obstaculoY = convertirAPixelesY(n.getCoordenada().get(1).intValue());

				PanelItem bloqueo = new PanelItem("/img/obstaculo.png");
				bloqueo.setBounds(obstaculoX, obstaculoY, 25, 25);
				bloqueo.setSize(25, 25);
				ventana.add(bloqueo);
				bloqueo.setVisible(true);
			}
		}
		/*
		ventana.add(mapaFondo);
		ventana.setSize(1527,850);
		ventana.setVisible(true);
		ventana.setResizable(false);
		*/
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		}
		
	public void actualizarPosicionAuto(Casillero nodoActual){
		try{
			Thread.sleep(900);
		}
		catch(Exception e){}
		int posXAux = convertirAPixelesX(nodoActual.getCoordenada().get(0).intValue());
		int posYAux = convertirAPixelesY(nodoActual.getCoordenada().get(1).intValue());

		smartToyItem.setBounds(posXAux,posYAux, 25, 25);
		smartToyItem.revalidate();		
	}
	
	public void girarAgente(EstadoAgente estado){
		
		try{
			Thread.sleep(750);
		}
		catch(Exception e){}
		
		char orientacion = estado.getorientacion();
		
		switch (orientacion){
			case 'n':	smartToyItem.setUrl("/img/smartToyImgNORTE.png");
						break;
			case 'o':	smartToyItem.setUrl("/img/smartToyImgOESTE.png");
						break;
			case 's':	smartToyItem.setUrl("/img/smartToyImgSUR.png");
						break;
			case 'e':	smartToyItem.setUrl("/img/smartToyImgESTE.png");
						break;
		}
		
		int smartToyPosX = convertirAPixelesX(estado.getposicion().getCoordenada().get(0).intValue());
		int smartToyPosY = convertirAPixelesY(estado.getposicion().getCoordenada().get(1).intValue());
		
		smartToyItem.setBounds(smartToyPosX, smartToyPosY, 25, 25);
		smartToyItem.revalidate();
	}
	
	
	public void cargarMetaIntermediaYDestinoArbitrario(EstadoAgente st){
		//seteo imagen Meta Intermedia 
		int metaIntermediaX= convertirAPixelesX(st.getMetaIntermedia().getCoordenada().get(0).intValue());
		int metaIntermediaY= convertirAPixelesY(st.getMetaIntermedia().getCoordenada().get(1).intValue());
		metaIntermedia.setBounds(metaIntermediaX, metaIntermediaY, 25, 25);
		metaIntermedia.setSize(25, 25);
		ventana.add(metaIntermedia);
		metaIntermedia.setVisible(true);
		
		//seteo imagen destino arbitrario 
		int destinoAgenteX= convertirAPixelesX(st.getdestino().getCoordenada().get(0).intValue());
		int destinoAgenteY= convertirAPixelesY(st.getdestino().getCoordenada().get(1).intValue());
		destinoAgenteItem.setBounds(destinoAgenteX, destinoAgenteY, 25, 25);
		destinoAgenteItem.setSize(25, 25);
		ventana.add(destinoAgenteItem);
		destinoAgenteItem.setVisible(true);
		
		
		// Agrego el mapa que va al fondo
		ventana.add(mapaFondo);
		ventana.setSize(1527,850);
		ventana.setVisible(true);
		ventana.setResizable(false);
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
		valorEnPixeles = (int)pos*50;
		return valorEnPixeles;
	}
}
