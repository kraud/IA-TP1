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
	
	// A partir de un Casillero de origen(la posicion del Smart Toy) y un Casillero destino (la posicion real del usuario),
	// devuelve un Casillero por el cual debe ingresar al cuarto (la puerta) y un destino final opuesto a esa puerta dentro de ese cuarto
	public List<Casillero> getMetasAgente(String origen, String destino){
		
		List<Casillero> metas = new ArrayList<Casillero>();
	    int numArea = this.getNumeroHabitacionPorId(destino);
	    
	    Casillero casilleroOrigen = this.getCasilleroPorId(origen);
	    Casillero CasilleroDestino = this.getCasilleroPorId(destino);
	    List<Casillero> puertas = this.getListaDePuertas(numArea); // Todas las puertas del cuarto donde se encuentra el usuario
	    
	    Casillero puertaMasCercana = this.getPuertaMasCercana(casilleroOrigen, puertas); // La puerta mas cercana al agente (la meta intermedia).
	    Casillero destinoEnHabitacion = this.getPuntoOpuesto(puertaMasCercana, numArea); // El punto en la habitacion correspondiente para cada puerta
	    	
	    metas.add(puertaMasCercana);
	    metas.add(destinoEnHabitacion);
	    
	    return metas;
	 }
	
	///////////////////////////////////
	///IMPLEMENTAR ESTOS DOS METODOS///
	///////////////////////////////////
	
	// A partir del numero de habitacion, devuelve la lista de puertas de esa habitacion
	public List<Casillero> getListaDePuertas(int numeroDeCuartoDestino){
		List<Casillero> listaDePuertas = new ArrayList<Casillero>();
		
		// Agregar todos los casilleros que son puerta, para CADA cuarto
		List<Casillero> listaDePuertas1 = new ArrayList<Casillero>();
		listaDePuertas1.add(this.getCasilleroPorId("")); //aca entre las comillas poner el ID de un nodo que es 'puerta' del cuarto
		listaDePuertas1.add(this.getCasilleroPorId(""));
		
		List<Casillero> listaDePuertas2 = new ArrayList<Casillero>();
		listaDePuertas2.add(this.getCasilleroPorId(""));
		listaDePuertas2.add(this.getCasilleroPorId(""));
		
		List<Casillero> listaDePuertas3 = new ArrayList<Casillero>();
		listaDePuertas3.add(this.getCasilleroPorId(""));
		listaDePuertas3.add(this.getCasilleroPorId(""));

		// ... y asi sucesivamente con todos los IDs
		
		switch(numeroDeCuartoDestino){
		case(1):
			listaDePuertas = listaDePuertas1;
			break;
		case(2):
			listaDePuertas = listaDePuertas2;
			break;
		case(3):
			listaDePuertas = listaDePuertas3;
			break;
		// ... y asi con todos los casos
		}
		
		return listaDePuertas;
	}
	// A partir de la lista de todas las puertas de una habitacion, devuelve la puerta mas cercana al agente
	public Casillero getPuertaMasCercana(Casillero posicionOrigen, List<Casillero> listaPuertas){
		double distancia = 0;
	    double distanciaAux = 0;
		Casillero puertaMasCercana = listaPuertas.get(0);
		
		distancia = this.funcionHeuristica(posicionOrigen,listaPuertas.get(0));
		for(Casillero p : listaPuertas){
			distanciaAux = this.funcionHeuristica(posicionOrigen, p);
			if(distanciaAux < distancia){ // Iterar hasta conseguir las puerta mas cercana
				puertaMasCercana = p.clone();
			}
		}
		return puertaMasCercana;
	}
	
	// Tiene en cuenta la habitacion tambien, porque cada puerta lleva a dos lugares
	public Casillero getPuntoOpuesto(Casillero puertaCerca, int habitacion){
		Casillero puntoOpuesto = null;
		
		/* EJEMPLO: para la puerta X, entrando a la habitacion i, el punto al que debe ir el agente es el casillero Y
		if((puertaCerca.getId()=="X") && (habitacion == i)){
			puntoOpuesto = this.getCasilleroPorId("Y");
		}
		*/
		
		if((puertaCerca.getId()=="") && (habitacion == 1)){
			puntoOpuesto = this.getCasilleroPorId("Y");
		}
		if((puertaCerca.getId()=="") && (habitacion == 2)){
			puntoOpuesto = this.getCasilleroPorId("Y");
		}
		if((puertaCerca.getId()=="") && (habitacion == 3)){
			puntoOpuesto = this.getCasilleroPorId("Y");
		}
		
		return puntoOpuesto;
	}
	
	//////////////////////////////////////////////////////////////////
	
	// Metodo auxiliar (horrible) de getMetasAgente para recibir el numero que corresponde para cada habitacion
	public int getNumeroHabitacionPorId(String origenId){
		String area = origenId.substring(0,2);
		int numeroHabitacion = 0;
		
		if(area.equals("PD")){
			numeroHabitacion = 1;
			return numeroHabitacion;
		}
		if(area.equals("PR")){
			numeroHabitacion = 2;
			return numeroHabitacion;
		}
		if(area.equals("PL")){
			numeroHabitacion = 3;
			return numeroHabitacion;
		}
		if(area.equals("PT")){
			numeroHabitacion = 4;
			return numeroHabitacion;
		}
		if(area.equals("GA")){
			numeroHabitacion = 5;
			return numeroHabitacion;
		}
		if(area.equals("CO")){
			numeroHabitacion = 6;
			return numeroHabitacion;
		}
		if(area.equals("HR")){
			numeroHabitacion = 7;
			return numeroHabitacion;
		}
		if(area.equals("BC")){
			numeroHabitacion = 8;
			return numeroHabitacion;
		}
		if(area.equals("HL")){
			numeroHabitacion = 9;
			return numeroHabitacion;
		}
		if(area.equals("WW")){
			numeroHabitacion = 10;
			return numeroHabitacion;
		}
		if(area.equals("HG")){
			numeroHabitacion = 11;
			return numeroHabitacion;
		}
		if(area.equals("BG")){
			numeroHabitacion = 12;
			return numeroHabitacion;
		}
		if(area.equals("KI")){
			numeroHabitacion = 13;
			return numeroHabitacion;
		}
		if(area.equals("LI")){
			numeroHabitacion = 14;
			return numeroHabitacion;
		}
		if(area.equals("ME")){
			numeroHabitacion = 15;
			return numeroHabitacion;
		}
		if(area.equals("EN")){
			numeroHabitacion = 16;
			return numeroHabitacion;
		}
		if(area.equals("HS")){
			numeroHabitacion = 17;
			return numeroHabitacion;
		}
		if(area.equals("BS")){
			numeroHabitacion = 18;
			return numeroHabitacion;
		}
		if(area.equals("DE")){
			numeroHabitacion = 19;
			return numeroHabitacion;
		}
		if(area.equals("OF")){
			numeroHabitacion = 20;
			return numeroHabitacion;
		}
		if(area.equals("SC")){
			numeroHabitacion = 21;
			return numeroHabitacion;
		}
		if(area.equals("SK")){
			numeroHabitacion = 22;
			return numeroHabitacion;
		}
		if(area.equals("SD")){
			numeroHabitacion = 23;
			return numeroHabitacion;
		}
		
		return numeroHabitacion;
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
