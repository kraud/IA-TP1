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
	
	// Retorna el casillero correspondiente al id
	public Casillero getCasilleroPorId(String id){
		Casillero casilleroBuscado = null;
		List<Casillero> Nodos = this.getNodos();
		
		for(Casillero c : Nodos){
			if(c.getId().equals(id)){
				casilleroBuscado = c;
			}
		}
		return casilleroBuscado;
	}
	
	public List<Arco> getArcosPorIds (String extrA){
		List<Arco> arcosBuscados = new ArrayList<Arco>();
		List<Arco> arcos = this.getAristas();
		
		for (Arco arco : arcos){
			if(	( extrA.equals(arco.getExtremoA().getId())) ||
				( extrA.equals(arco.getExtremoB().getId()))){
				
				arcosBuscados.add(arco);
			}
		}		
		return  arcosBuscados;
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
		Casillero proximoNodo = null;

		switch(orientacion){
			case('n'):
				for(Arco arco : aristasV){
					if( (arco.getExtremoB().getId().equals(posicion.getId())) && (!arco.getExtremoA().isVisitado()) ){
						proximoNodo = (arco.getExtremoA()).clone();
					}
				}
				break;
				
			case('s'):
				for(Arco arco : aristasV){
					if( (arco.getExtremoA().getId().equals(posicion.getId())) && (!arco.getExtremoB().isVisitado()) ){
						proximoNodo = (arco.getExtremoB()).clone();
					}
				}
				break;
				
			case('o'):
				for(Arco arco : aristasH){
					if( (arco.getExtremoB().getId().equals(posicion.getId())) && (!arco.getExtremoA().isVisitado()) ){
						proximoNodo = (arco.getExtremoA()).clone();
					}
				}
				break;
				
			case('e'):
				for(Arco arco : aristasH){
					if( (arco.getExtremoA().getId().equals(posicion.getId())) && (!arco.getExtremoB().isVisitado()) ){
						proximoNodo = (arco.getExtremoB()).clone();
					}
				}
				break;
		}
	
		if (proximoNodo != null ) {
			System.out.println("POS+O+V: " + posicion.getId() + "+" + orientacion + "+" + posicion.isVisitado()+ " ---> " + proximoNodo.getId()+"+" + proximoNodo.isVisitado());
		} else {
			System.out.println("SIN PROXIMO: " + posicion.getId() + ", " + orientacion);
		}
		return proximoNodo;
	}
	// A partir de un nodo, busca si hay una arista que lo incluye y corrobora si hay otro nodo en la orientacion determinada. Si no lo hay, retorna null.
	public Casillero proximoEnDireccionOpuesta(Casillero posicion, char orientacion){
		
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
		Casillero proximoNodoOpuesto = null;

		switch(orientacion){
			case('n'):
				for(Arco arco : aristasV){
					if( arco.getExtremoA().getId().equals(posicion.getId()) ){
						proximoNodoOpuesto = (arco.getExtremoB()).clone();
					}
				}
				break;
				
			case('s'):
				for(Arco arco : aristasV){
					if( arco.getExtremoB().getId().equals(posicion.getId()) ){
						proximoNodoOpuesto = (arco.getExtremoA()).clone();
					}
				}
				break;
				
			case('o'):
				for(Arco arco : aristasH){
					if( arco.getExtremoA().getId().equals(posicion.getId()) ){
						proximoNodoOpuesto = (arco.getExtremoB()).clone();
					}
				}
				break;
				
			case('e'):
				for(Arco arco : aristasH){
					if( arco.getExtremoB().getId().equals(posicion.getId()) ){
						proximoNodoOpuesto = (arco.getExtremoA()).clone();
					}
				}
				break;
		}
	
		if (proximoNodoOpuesto != null ) {
			System.out.println("Anterior de " + posicion.getId() + "+" + orientacion + " es: " + proximoNodoOpuesto.getId());
		} else {
			System.out.println("Error en calcular anterior de: " + posicion.getId() + "+" + orientacion);
		}
		return proximoNodoOpuesto;
	}
	
	// Calcula el costo en segundos que le toma al Smart Toy para avanzar de un casillero a otro, a traves de un arco
	public Double costoAvanzar(EstadoAgente estadoAg){
		char flag = estadoAg.getUltimaAccion();
		switch(flag){
			case('a'):
				Casillero pos = estadoAg.getposicion();
				Casillero sig = estadoAg.getmapa().proximoEnDireccionOpuesta(pos, estadoAg.getorientacion());
		
				if (sig != null) {
					Arco ar = null;
					for(Arco a : aristas){
				
						if( (a.getExtremoA().getId().equals(pos.getId()) && a.getExtremoB().getId().equals(sig.getId())) 
							|| (a.getExtremoB().getId().equals(pos.getId()) && a.getExtremoA().getId().equals(sig.getId())) ){
							ar = a;
							break;
						}
					}
					double mitadDistancia = ar.getLongitud() / 2;
			
					double tiempoPos = mitadDistancia/(pos.getFactorVelocidadSuperficie());
					double tiempoSig = mitadDistancia/(sig.getFactorVelocidadSuperficie());
					
					double valorFinal = (tiempoPos + tiempoSig);
			
					return valorFinal;
			
				}else {
					return 9999999.0;
				}
			case('g'):
				return 0.01;
		}
		System.out.println("No registro ninguna ultima accion. Devuelve costo cero.");
		return 0.0; // para cumplir con la condicion de retornar un Double - nunca se deberia ejecutar
	}
	
	// Calcula el costo en segundos que le toma al Smart Toy para avanzar desde un casillero a otro en linea recta
	public Double funcionHeuristica(Casillero posicion, Casillero destino){
		
		double distanciaPitagora = 	Math.sqrt(
										(Math.pow((posicion.getCoordenada().get(0) - destino.getCoordenada().get(0)), 2))
										+
										(Math.pow((posicion.getCoordenada().get(1) - destino.getCoordenada().get(1)), 2))
							);
		
		return distanciaPitagora; // en realidad es tiempoPitagora, pero usamos la velocidad promedio de 1 metro/segundo
								  // velocidad*distancia = tiempo => cuando velocidad es 1: valor de distancia = valor tiempo
	}
	
}
