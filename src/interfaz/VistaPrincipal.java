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
	
	
	public VistaPrincipal(List<Double> smartToyPos, List<Double> objetivoPos){
		int smartToyPosX = smartToyPos.get(0).intValue();
		int smartToyPosY = smartToyPos.get(1).intValue();
		// TODO: convertir smartToyPosX y smartToyPosY a sus correspondientes en pixeles
		int objetivoPosX = objetivoPos.get(0).intValue();
		int objetivoPosY = objetivoPos.get(1).intValue();
		// TODO: convertir objetivoPosX y objetivoPosY a sus correspondientes en pixeles
		
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		smartToyItem.setBounds(smartToyPosX, smartToyPosY, 25, 25);
		smartToyItem.setSize(25, 25);
		
		objetivoItem.setBounds(objetivoPosX, objetivoPosY, 25, 25);
		objetivoItem.setSize(25, 25);
		
		ventana.add(smartToyItem);
		ventana.add(objetivoItem);
		
		smartToyItem.setVisible(true);
		objetivoItem.setVisible(true);
		
		ventana.add(mapaFondo);
		ventana.setSize(700,830);
		ventana.setVisible(true);
		ventana.setResizable(false);
		
	}
	
	public VistaPrincipal(int columna, int fila, Casillero smartToy, Casillero objetivo , Casillero posAprox,  Collection<Casillero> nodosObstaculos, List<Casillero> nodosObstrucciones){
		//nodos Agua, aqui se va rapido 
		//nodos lento, se va lento por ej: basura, etc 
		//nodos bloqueados, bloqueos o paredes
		
		//seteo imagen smartToy
		int smartToyPosX= smartToy.getCoordenada().get(0).intValue();
		int smartToyPosY = smartToy.getCoordenada().get(1).intValue();
		// TODO: Falta convertir smartToyPosX y smartToyPosY a sus valores en pixeles
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		smartToyItem.setBounds(smartToyPosX, smartToyPosY, 25, 25);
		smartToyItem.setSize(25, 25);
		ventana.add(smartToyItem);
		smartToyItem.setVisible(true);
		//seteo imagen objetivo
		int objetivoPosX = objetivo.getCoordenada().get(0).intValue();
		int objetivoPosY = objetivo.getCoordenada().get(1).intValue();
		// TODO: Falta convertir objetivoPosX y objetivoPosY a sus valores en pixeles
		objetivoItem.setBounds(objetivoPosX, objetivoPosY, 25, 25);
		objetivoItem.setSize(25, 25);
		ventana.add(objetivoItem);
		objetivoItem.setVisible(true);
		//seteo imagen aproximado 
		int aproxX= posAprox.getCoordenada().get(0).intValue();
		int aproxY= posAprox.getCoordenada().get(1).intValue();
		// TODO: Falta convertir aproxX y aproxY a sus valores en pixeles
		aprox.setBounds(aproxX, aproxY, 25, 25);
		aprox.setSize(25, 25);
		ventana.add(aprox);
		aprox.setVisible(true);
		
		//agrego obsttrucciones a la imagen
		for(Casillero n : nodosObstrucciones){
			int obstruccionX = n.getCoordenada().get(0).intValue();
			int obstruccionY = n.getCoordenada().get(1).intValue();
			// TODO: Falta convertir obstruccionX y obstruccionY a sus valores en pixeles
			PanelFondo agua = new PanelFondo("/img/obstruccion.png");
			agua.setBounds(obstruccionX, obstruccionY, 25, 25);
			agua.setSize(25, 25);
			ventana.add(agua);
			agua.setVisible(true);
		}
		
		for(Casillero n : nodosObstaculos){
			if(n.isObstaculo()){
				int obstaculoX = n.getCoordenada().get(0).intValue();
				int obstaculoY = n.getCoordenada().get(1).intValue();
				// TODO: Falta convertir obstaculoX y obstaculoY a sus valores en pixeles
				PanelItem bloqueo = new PanelItem("/img/obstaculo.png");
				bloqueo.setBounds(obstaculoX, obstaculoY, 25, 25);
				bloqueo.setSize(25, 25);
				ventana.add(bloqueo);
				bloqueo.setVisible(true);
			}
		}
		
		ventana.add(mapaFondo);
		ventana.setSize((columna*25)+10,(fila*25)+10);
		ventana.setVisible(true);
		ventana.setResizable(false);
		}
		
	public void actualizarPosicionAuto(Casillero nodoActual){
		try{
			Thread.sleep(150);
		}
		catch(Exception e){}
		int posXAux = nodoActual.getCoordenada().get(0).intValue();
		int posYAux = nodoActual.getCoordenada().get(1).intValue();
		// TODO: Falta convertir posXAux y posYAux a sus valores en pixeles
		smartToyItem.setBounds(posXAux,posYAux, 25, 25);
		smartToyItem.revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
