package frsf.cidisi.exercise.idemiatp1.search;

import java.util.ArrayList;
import java.util.List;

import domain.Arco;
import domain.Casillero;

public class GrafoCasa {
	
	private List<Casillero> nodos;
	private List<Arco> aristas;
	
	public GrafoCasa(){
		this.setNodos(null);
		this.setAristas(null);
	}
	
	public GrafoCasa(List<Casillero> nodos, List<Arco> aristas){
		this.setNodos(nodos);
		this.setAristas(aristas);
	}

	public void setNodos(List<Casillero> nodos) {
		this.nodos = nodos;
	}

	public List<Casillero> getNodos() {
		return nodos;
	}

	public void setAristas(List<Arco> aristas) {
		this.aristas = aristas;
	}

	public List<Arco> getAristas() {
		return aristas;
	}
	
	// A partir de un nodo, busca si hay una arista que lo incluye y corrobora si hay otro nodo en la orientacion determinada. Si no lo hay, retorna null.
	public Casillero proximoEnDireccion(Casillero posicion, char orientacion){
		
		List<Arco> aristas = this.aristas;
		List<Arco> aristasV = new ArrayList<Arco>();
		List<Arco> aristasH = new ArrayList<Arco>();
	
		// Separa los arcos segun su tipoDeArco -> vertical-horizontal
		for(Arco a : aristas){
			if(a.getTipoDeArco()=='v'){
				aristasV.add(a.clone());
			}
			else{
				aristasH.add(a.clone());
			}
		}
		char orient = orientacion;
		Casillero proximoNodo = null;
		
		switch(orient){
			case('n'):
				for(Arco arco : aristasV){
					if( (arco.getExtremoB().getId().equals(posicion.getId())) && (!arco.getExtremoA().isVisitado()) ){
						proximoNodo = (arco.getExtremoA()).clone();
						return proximoNodo;
					}
				}
				break;
				
			case('s'):
				for(Arco arco : aristasV){
					if( (arco.getExtremoA().getId().equals(posicion.getId())) && (!arco.getExtremoB().isVisitado()) ){
						proximoNodo = (arco.getExtremoB()).clone();
						return proximoNodo;
					}
				}
				break;
				
			case('o'):
				for(Arco arco : aristasH){
					if( (arco.getExtremoB().getId().equals(posicion.getId())) && (!arco.getExtremoA().isVisitado()) ){
						proximoNodo = (arco.getExtremoA()).clone();
						return proximoNodo;
					}
				}
				break;
				
			case('e'):
				for(Arco arco : aristasH){
					if( (arco.getExtremoA().getId().equals(posicion.getId())) && (!arco.getExtremoB().isVisitado()) ){
						proximoNodo = (arco.getExtremoB()).clone();
						return proximoNodo;
					}
				}
				break;
		}
		
		return proximoNodo;
	}
	
	public Double costoAvanzar(EstadoAgente estadoAg){
		Casillero pos = estadoAg.getposicion();
		Casillero sig = estadoAg.getmapa().proximoEnDireccion(pos, estadoAg.getorientacion());
		List<Arco> aristas = this.aristas;
		Arco ar = null;
		for(Arco a : aristas){
			if( (a.getExtremoA().equals(pos) && a.getExtremoB().equals(sig)) || (a.getExtremoB().equals(pos) && a.getExtremoA().equals(sig)) ){
				ar = a;
			}
		}
		double mitadDistancia = ar.getLongitud()/2;
		
		double tiempoPos = mitadDistancia*(pos.getFactorVelocidadSuperficie());
		double tiempoSig = mitadDistancia*(sig.getFactorVelocidadSuperficie());
		
		return (tiempoPos + tiempoSig);
	}
	
	public Double funcionHeuristica(Casillero posicion, Casillero destino){
		
		/*
		double tiempoPitagora = 	Math.sqrt(
										(Math.pow((posicion.getCoordenadas().get(1) - destino.getCoordenadas().get(1)), 2))
										+
										(Math.pow((posicion.getCoordenadas().get(2) - destino.getCoordenadas().get(2)), 2))
									);
		return tiempoPitagora;
		*/
		return 1.0;
	}
	
}
