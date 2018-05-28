package frsf.cidisi.exercise.idemiatp1.search;

import interfaz.VistaPrincipal;

import java.util.ArrayList;
import java.util.List;

import domain.Casillero;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoCasa extends EnvironmentState {
	
	//TODO: Setup Variables
    private Casillero posicionAgente;
    private char orientacionAgente;
    private Casillero destinoAgente;
    private List<Casillero> obstaculosCasa;
	private GrafoCasa mapa;
	// Para la Interfaz
	private VistaPrincipal ventana;
    
	public EstadoCasa() {
        //Aca se pueden crear los nodos / e inicializar
		
		obstaculosCasa = new ArrayList<Casillero>();
		mapa = new GrafoCasa();
        
		this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    @Override // aca se pueden inicializar si no se inicializaron en EstadoCasa(). Es OPCIONAL.
    public void initState() {
    	
    	////////////////////////////////////////////////////
    	// 				INICIALIZAR EL AMBIENTE           //
    	////////////////////////////////////////////////////
    	String posicionAgente = "EN1";
    	char orientacionAgente = 'e';
    	String posicionUsuario = "DE9";
    	////////////////////////////////////////////////////
    	////////////////////////////////////////////////////
    	
    	// Inicializamos el mapa
    	GranInit iniciar = new GranInit();
    	this.mapa.setNodos(iniciar.getMapa().getNodos());
    	this.mapa.setAristas(iniciar.getMapa().getAristas());
    	
    	//Inicializamos posicion inicial del agente
    	this.posicionAgente = this.mapa.getCasilleroPorId(posicionAgente);

    	//Inicializamos destino del agente
    	this.destinoAgente = this.mapa.getCasilleroPorId(posicionUsuario);
    	
    	//Inicializamos orientacion inicial del agente
    	this.orientacionAgente = orientacionAgente;
    	
    	//INTERFAZ
    	List<Casillero> listaObstrucciones = new ArrayList<Casillero>();
    	for(Casillero n : this.getMapa().getNodos()){
    		if(n.getObstruccion() != 0){
    			listaObstrucciones.add(n);
    		}
    	}
    	for(Casillero n : this.getMapa().getNodos()){
    		if(n.isObstaculo()){
    			this.obstaculosCasa.add(n);
    		}
    	}
    	ventana = new VistaPrincipal(this.posicionAgente, this.orientacionAgente, this.destinoAgente, this.getobstaculosCasa(), listaObstrucciones);
    }
    
    public void cargarMetaIntermediaYDestinoArbitrario(EstadoAgente agentState){
    	ventana.cargarMetaIntermediaYDestinoArbitrario(agentState);
    }
    
    public void modificarPosicionSmartToy(Casillero destino) {
		ventana.actualizarPosicionAuto(destino);
	}
    
    public void girarAgente(EstadoAgente estado) {
		ventana.girarAgente(estado);
	}
    

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
    	  String str = "";
    	  String aux = "Los nodos obstaculo son los siguientes: ";
          
          str += "El Smart Toy se encuentra en el casillero ";
          str += this.posicionAgente.getId() + ". ";
          str += "El casillero objetivo es ";
          str += this.destinoAgente.getId();
          str += "\n";
          
          for(Casillero nodo : this.getobstaculosCasa()){
        	  aux += nodo.getId() + ", ";
          }
          aux += "." + "\n";
          
          str = str + aux;

        return str;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
	
     public Casillero getposicionAgente(){
        return posicionAgente;
     }
     public void setposicionAgente(Casillero arg){
        posicionAgente = arg;
     }
     public Casillero getdestinoAgente(){
        return destinoAgente;
     }
     public void setdestinoAgente(Casillero arg){
        destinoAgente = arg;
     }
     public List<Casillero> getobstaculosCasa(){
        return obstaculosCasa;
     }
     public void setobstaculosCasa(List<Casillero> arg){
        obstaculosCasa = arg;
     }

	public void setMapa(GrafoCasa mapa) {
		this.mapa = mapa;
	}

	public GrafoCasa getMapa() {
		return mapa;
	}

	public void setOrientacionAgente(char orientacion) {
		this.orientacionAgente = orientacion;
	}

	public char getOrientacionAgente() {
		return orientacionAgente;
	}
	

}

