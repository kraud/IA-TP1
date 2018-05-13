package frsf.cidisi.exercise.idemiatp1.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.Arco;
import domain.Casillero;

public class GranInit {
	GrafoCasa mapa = new GrafoCasa();
	
	public GranInit(){
		inicializar();
	}
	
	public GrafoCasa getMapa(){
		return this.mapa;
	}

	private void inicializar() {
		
		// Agregar definiciones para Casilleros de origen y destino del Agente 
		
		
		List<Casillero> nodos = new ArrayList<Casillero>();
		List<Arco> aristas = new ArrayList<Arco>();

		// Se cargan todos los nodos
		List<Double> n1Coord = Arrays.asList(1.38, 2.56);
		Casillero n1 = new Casillero("n1",0.5,false,0,n1Coord);
		nodos.add(n1);
		
		List<Double> n2Coord = Arrays.asList(2.38, 2.56);
		Casillero n2 = new Casillero("n2",0.5,false,0,n2Coord);
		nodos.add(n2);
		
		
		// Se cargan todas las aristas
		aristas.add(new Arco("a1",'h',n1,n2,2.0));
		
		
		
		this.mapa.setNodos(nodos);
		this.mapa.setAristas(aristas);
	}
}
