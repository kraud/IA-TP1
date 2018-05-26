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
		
		
		//
		
		switch(numeroDeCuartoDestino){
		case(1):
			
			List<Casillero> listaDePuertas1 = new ArrayList<Casillero>();
			listaDePuertas1.add(this.getCasilleroPorId("PD0")); 
			listaDePuertas1.add(this.getCasilleroPorId("PD4"));
			listaDePuertas1.add(this.getCasilleroPorId("PD5"));
			listaDePuertas1.add(this.getCasilleroPorId("PD7"));
			listaDePuertas1.add(this.getCasilleroPorId("PD8"));	
			listaDePuertas = listaDePuertas1;
			break;
			
		case(2):
			List<Casillero> listaDePuertas2 = new ArrayList<Casillero>();
			listaDePuertas2.add(this.getCasilleroPorId("PR0"));
			listaDePuertas2.add(this.getCasilleroPorId("PR4"));
			listaDePuertas = listaDePuertas2;
			break;
		case(3):
			List<Casillero> listaDePuertas3 = new ArrayList<Casillero>();
		listaDePuertas3.add(this.getCasilleroPorId("PL0"));
		listaDePuertas3.add(this.getCasilleroPorId("PL4"));
			listaDePuertas = listaDePuertas3;
			break;
		
		case(4):
			List<Casillero> listaDePuertas4 = new ArrayList<Casillero>();
			listaDePuertas4.add(this.getCasilleroPorId("PT0"));
			listaDePuertas4.add(this.getCasilleroPorId("PT1"));
			listaDePuertas4.add(this.getCasilleroPorId("PT6"));
			listaDePuertas = listaDePuertas4;
			break;
			
		case(5):
			List<Casillero> listaDePuertas5 = new ArrayList<Casillero>();
			listaDePuertas5.add(this.getCasilleroPorId("GA0"));
			listaDePuertas5.add(this.getCasilleroPorId("GA2"));
			listaDePuertas5.add(this.getCasilleroPorId("GA5"));
			listaDePuertas = listaDePuertas5;
			break;
			
		case(6):
			List<Casillero> listaDePuertas6 = new ArrayList<Casillero>();
			listaDePuertas6.add(this.getCasilleroPorId("CO0"));
			listaDePuertas6.add(this.getCasilleroPorId("CO1"));
			listaDePuertas6.add(this.getCasilleroPorId("CO2"));
			listaDePuertas6.add(this.getCasilleroPorId("CO3"));
			listaDePuertas6.add(this.getCasilleroPorId("CO4"));
			listaDePuertas6.add(this.getCasilleroPorId("CO5"));
			listaDePuertas = listaDePuertas6;
			break;
			
		case(7):
			List<Casillero> listaDePuertas7 = new ArrayList<Casillero>();
			listaDePuertas7.add(this.getCasilleroPorId("HR0"));
			listaDePuertas = listaDePuertas7;
			break;
			
		case(8):
			List<Casillero> listaDePuertas8 = new ArrayList<Casillero>();
			listaDePuertas8.add(this.getCasilleroPorId("BC0"));
			listaDePuertas = listaDePuertas8;
			break;
			
		case(9):
			List<Casillero> listaDePuertas9 = new ArrayList<Casillero>();
			listaDePuertas9.add(this.getCasilleroPorId("HL0"));
			listaDePuertas = listaDePuertas9;
			break;
			
		case(10):
			List<Casillero> listaDePuertas10 = new ArrayList<Casillero>();
			listaDePuertas10.add(this.getCasilleroPorId("WW"));
			listaDePuertas = listaDePuertas10;
			break;
			
		case(11):
			List<Casillero> listaDePuertas11 = new ArrayList<Casillero>();
			listaDePuertas11.add(this.getCasilleroPorId("HG0"));
			listaDePuertas11.add(this.getCasilleroPorId("HG4"));
			listaDePuertas = listaDePuertas11;
			break;
			
		case(12):
			List<Casillero> listaDePuertas12 = new ArrayList<Casillero>();
			listaDePuertas12.add(this.getCasilleroPorId("BG0"));
			listaDePuertas = listaDePuertas12;
			break;
			
		case(13):
			
			List<Casillero> listaDePuertas13 = new ArrayList<Casillero>();
			listaDePuertas13.add(this.getCasilleroPorId("KI0"));
			listaDePuertas13.add(this.getCasilleroPorId("KI6"));
			listaDePuertas13.add(this.getCasilleroPorId("KI10"));
			listaDePuertas = listaDePuertas13;
			break;
			
		case(14):
			List<Casillero> listaDePuertas14 = new ArrayList<Casillero>();
			listaDePuertas14.add(this.getCasilleroPorId("LI0"));
			listaDePuertas14.add(this.getCasilleroPorId("LI1"));
			listaDePuertas14.add(this.getCasilleroPorId("LI2"));
			listaDePuertas = listaDePuertas14;
			break;
			
		case(15):
			List<Casillero> listaDePuertas15 = new ArrayList<Casillero>();
			listaDePuertas15.add(this.getCasilleroPorId("ME0"));
			listaDePuertas = listaDePuertas15;
			break;
			
		case(16):
			List<Casillero> listaDePuertas16 = new ArrayList<Casillero>();
			listaDePuertas16.add(this.getCasilleroPorId("EN0"));
			listaDePuertas16.add(this.getCasilleroPorId("EN1"));
			listaDePuertas16.add(this.getCasilleroPorId("EN2"));
			listaDePuertas = listaDePuertas16;
			break;
			
		case(17):
			List<Casillero> listaDePuertas17 = new ArrayList<Casillero>();
			listaDePuertas17.add(this.getCasilleroPorId("HS0"));
			listaDePuertas17.add(this.getCasilleroPorId("HS1"));
			listaDePuertas = listaDePuertas17;
			break;
			
		case(18):
			List<Casillero> listaDePuertas18 = new ArrayList<Casillero>();
			listaDePuertas18.add(this.getCasilleroPorId("BS0"));
			listaDePuertas = listaDePuertas18;
			break;
			
		case(19):
			List<Casillero> listaDePuertas19 = new ArrayList<Casillero>();
			listaDePuertas19.add(this.getCasilleroPorId("DE0"));
			listaDePuertas19.add(this.getCasilleroPorId("DE1"));
			listaDePuertas19.add(this.getCasilleroPorId("DE3"));
			listaDePuertas19.add(this.getCasilleroPorId("DE12"));
			listaDePuertas19.add(this.getCasilleroPorId("DE13"));
			listaDePuertas19.add(this.getCasilleroPorId("DE16"));
			listaDePuertas = listaDePuertas19;
			break;
			
		case(20):
			List<Casillero> listaDePuertas20 = new ArrayList<Casillero>();
			listaDePuertas20.add(this.getCasilleroPorId("OF"));
			listaDePuertas = listaDePuertas20;
			break;
			
		case(21):
			List<Casillero> listaDePuertas21 = new ArrayList<Casillero>();
			listaDePuertas21.add(this.getCasilleroPorId("SC"));
			listaDePuertas = listaDePuertas21;
			break;
			
		case(22):
			List<Casillero> listaDePuertas22 = new ArrayList<Casillero>();
			listaDePuertas22.add(this.getCasilleroPorId("SK"));
			listaDePuertas = listaDePuertas22;
			break;
			
		case(23):
			List<Casillero> listaDePuertas23 = new ArrayList<Casillero>();
			listaDePuertas23.add(this.getCasilleroPorId("SD"));
			listaDePuertas = listaDePuertas23;
			break;
			
		}
		Casillero aux = new Casillero();
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
		
		if((puertaCerca.getId()=="PD0") && (habitacion == 1)){
			puntoOpuesto = this.getCasilleroPorId("PD8");
		}
		if((puertaCerca.getId()=="PD5") && (habitacion == 1)){
			puntoOpuesto = this.getCasilleroPorId("PD4");
		}
		if((puertaCerca.getId()=="PD4") && (habitacion == 1)){
			puntoOpuesto = this.getCasilleroPorId("PD5");
		}
		if((puertaCerca.getId()=="PD7") && (habitacion == 1)){
			puntoOpuesto = this.getCasilleroPorId("PD0");
		}
		if((puertaCerca.getId()=="PD8") && (habitacion == 1)){
			puntoOpuesto = this.getCasilleroPorId("PD0");
		}
		
		if((puertaCerca.getId()=="PRO") && (habitacion == 2)){
			puntoOpuesto = this.getCasilleroPorId("PR4");
		}
		if((puertaCerca.getId()=="PR4") && (habitacion == 2)){
			puntoOpuesto = this.getCasilleroPorId("PR0");
		}
		if((puertaCerca.getId()=="PL0") && (habitacion == 3)){
			puntoOpuesto = this.getCasilleroPorId("PL4");
		}
		if((puertaCerca.getId()=="PL4") && (habitacion == 3)){
			puntoOpuesto = this.getCasilleroPorId("PL0");
		}
		
		if((puertaCerca.getId()=="PT0") && (habitacion ==4 )){
			puntoOpuesto = this.getCasilleroPorId("PT6");
		}
		if((puertaCerca.getId()=="PT1") && (habitacion ==4 )){
			puntoOpuesto = this.getCasilleroPorId("PT6");
		}
		if((puertaCerca.getId()=="PT6") && (habitacion ==4 )){
			puntoOpuesto = this.getCasilleroPorId("PT0");
		}
		if((puertaCerca.getId()=="GA0") && (habitacion ==5 )){
			puntoOpuesto = this.getCasilleroPorId("GA4");
		}
		if((puertaCerca.getId()=="GA2") && (habitacion ==5 )){
			puntoOpuesto = this.getCasilleroPorId("GA4");
		}
		if((puertaCerca.getId()=="GA5") && (habitacion ==5 )){
			puntoOpuesto = this.getCasilleroPorId("GA0");
		}
		if((puertaCerca.getId()=="CO0") && (habitacion ==6 )){
			puntoOpuesto = this.getCasilleroPorId("CO5");
		}
		if((puertaCerca.getId()=="C01") && (habitacion ==6 )){
			puntoOpuesto = this.getCasilleroPorId("CO5");
		}
		if((puertaCerca.getId()=="C02") && (habitacion ==6 )){
			puntoOpuesto = this.getCasilleroPorId("CO5");
		}
		if((puertaCerca.getId()=="CO3") && (habitacion ==6 )){
			puntoOpuesto = this.getCasilleroPorId("CO0");
		}
		if((puertaCerca.getId()=="CO4") && (habitacion ==6 )){
			puntoOpuesto = this.getCasilleroPorId("CO0");
		}
		if((puertaCerca.getId()=="CO5") && (habitacion ==6 )){
			puntoOpuesto = this.getCasilleroPorId("CO0");
		}
		if((puertaCerca.getId()=="HR0") && (habitacion ==7 )){
			puntoOpuesto = this.getCasilleroPorId("HR2");
		}
		if((puertaCerca.getId()=="BC0") && (habitacion ==8 )){
			puntoOpuesto = this.getCasilleroPorId("BC3");
		}
		if((puertaCerca.getId()=="HL0") && (habitacion ==9 )){
			puntoOpuesto = this.getCasilleroPorId("HL2");
		}
		if((puertaCerca.getId()=="WW") && (habitacion ==10 )){
			puntoOpuesto = this.getCasilleroPorId("WW");
		}
		if((puertaCerca.getId()=="HG0") && (habitacion ==11 )){
			puntoOpuesto = this.getCasilleroPorId("HG2");
		}
		if((puertaCerca.getId()=="HG4") && (habitacion ==11 )){
			puntoOpuesto = this.getCasilleroPorId("HG2");
		}
		if((puertaCerca.getId()=="BG0") && (habitacion ==12 )){
			puntoOpuesto = this.getCasilleroPorId("BG2");
		}
		if((puertaCerca.getId()=="KI0") && (habitacion ==13 )){
			puntoOpuesto = this.getCasilleroPorId("KI7");
		}
		if((puertaCerca.getId()=="KI6") && (habitacion ==13 )){
			puntoOpuesto = this.getCasilleroPorId("KI2");
		}
		if((puertaCerca.getId()=="KI10") && (habitacion ==13 )){
			puntoOpuesto = this.getCasilleroPorId("KI3");
		}
		if((puertaCerca.getId()=="LI0") && (habitacion ==14 )){
			puntoOpuesto = this.getCasilleroPorId("LI4");
		}
		if((puertaCerca.getId()=="LI1") && (habitacion ==14 )){
			puntoOpuesto = this.getCasilleroPorId("LI4");
		}
		if((puertaCerca.getId()=="LI2") && (habitacion ==14 )){
			puntoOpuesto = this.getCasilleroPorId("LI4");
		}
		if((puertaCerca.getId()=="ME0") && (habitacion ==15 )){
			puntoOpuesto = this.getCasilleroPorId("ME4");
		}
		if((puertaCerca.getId()=="EN0") && (habitacion ==16 )){
			puntoOpuesto = this.getCasilleroPorId("EN2");
		}
		if((puertaCerca.getId()=="EN1") && (habitacion ==16 )){
			puntoOpuesto = this.getCasilleroPorId("EN2");
		}
		if((puertaCerca.getId()=="EN2") && (habitacion ==16 )){
			puntoOpuesto = this.getCasilleroPorId("EN0");
		}
		if((puertaCerca.getId()=="HS0") && (habitacion ==17 )){
			puntoOpuesto = this.getCasilleroPorId("HS3");
		}	
		if((puertaCerca.getId()=="HS1") && (habitacion ==17 )){
			puntoOpuesto = this.getCasilleroPorId("HS3");
		}	
		if((puertaCerca.getId()=="BS0") && (habitacion ==18 )){
			puntoOpuesto = this.getCasilleroPorId("BS1");
		}
		if((puertaCerca.getId()=="DE0") && (habitacion ==19 )){
			puntoOpuesto = this.getCasilleroPorId("EN2");
		}
		if((puertaCerca.getId()=="DE1") && (habitacion ==19 )){
			puntoOpuesto = this.getCasilleroPorId("EN2");
		}
		if((puertaCerca.getId()=="DE3") && (habitacion ==19 )){
			puntoOpuesto = this.getCasilleroPorId("EN2");
		}
		if((puertaCerca.getId()=="DE4") && (habitacion ==19 )){
			puntoOpuesto = this.getCasilleroPorId("DE17");
		}
		if((puertaCerca.getId()=="DE12") && (habitacion ==19 )){
			puntoOpuesto = this.getCasilleroPorId("DE5");
		}
		if((puertaCerca.getId()=="DE13") && (habitacion ==19 )){
			puntoOpuesto = this.getCasilleroPorId("DE17");
		}
		if((puertaCerca.getId()=="DE16") && (habitacion ==19 )){
			puntoOpuesto = this.getCasilleroPorId("DE5");
		}
		if((puertaCerca.getId()=="OF") && (habitacion ==20 )){
			puntoOpuesto = this.getCasilleroPorId("OF");
		}
		if((puertaCerca.getId()=="SC") && (habitacion ==21 )){
			puntoOpuesto = this.getCasilleroPorId("SC");
		}
		if((puertaCerca.getId()=="SK") && (habitacion ==22 )){
			puntoOpuesto = this.getCasilleroPorId("SK");
		}
		if((puertaCerca.getId()=="SD") && (habitacion ==23 )){
			puntoOpuesto = this.getCasilleroPorId("SD");
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
