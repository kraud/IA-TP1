package frsf.cidisi.exercise.idemiatp1.search;

import java.util.ArrayList;
import java.util.List;

import domain.Arco;
import domain.Casillero;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {
	
	//TODO: Setup Variables
    private Casillero posicion;
    private char orientacion;
    private Casillero destino;
    private GrafoCasa mapa;
    private List<Casillero> obstaculos;
    private char ultimaAccion; // Necesario para definir un costo diferente para avanzar y girar
	

    public EstadoAgente() {

    }

    /**
     * This method is OPTIONAL, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
    	// Inicializamos el mapa
		mapa = new GrafoCasa();
		
		// TODO: Proablemente la inicializacion deberia ser otra para el agente. Toda informacion sobre las condiciones del estado del mapa no deberian verse
		GranInit iniciar = new GranInit();
    	this.mapa.setNodos(iniciar.getMapa().getNodos());
    	this.mapa.setAristas(iniciar.getMapa().getAristas());

		obstaculos = new ArrayList<Casillero>();

    	//Inicializamos posicion inicial del agente
    	this.posicion = this.mapa.getCasilleroPorId("ME5");
    	this.mapa.getCasilleroPorId("ME5").setVisitado(true);
    	
    	//Inicializamos orientacion inicial del agente
    	this.orientacion = 's';
    	
    	//Inicializamos destino del agente
    	this.destino = this.mapa.getCasilleroPorId("ME4");
    	
    	// Inicializamos la ultima accion
    	this.ultimaAccion = '\n';
    }

    /**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    @Override
    public SearchBasedAgentState clone() {
        
		//TODO: Complete Method
    	EstadoAgente estadoClonado = new EstadoAgente();
    	
    	// Atributo primitivo, se pasa por copia
    	
    	//	orientacion
    	estadoClonado.setorientacion(this.getorientacion());
    	// ultima accion
    	estadoClonado.setUltimaAccion(this.getUltimaAccion());
    	
    	// Atributos objeto, se clonan (usamos constructor que es lo mismo)
    	//	mapa
    	List<Casillero> mapaNodosClonados = new ArrayList<Casillero>();
    	for(Casillero c : this.mapa.getNodos()){
    		mapaNodosClonados.add(new Casillero(c));
    	}
    	List<Arco> mapaAristasClonadas = new ArrayList<Arco>();
    	for(Arco a : this.mapa.getAristas()){
    		mapaAristasClonadas.add(new Arco(a));
    	}
    	GrafoCasa mapaClonado = new GrafoCasa(mapaNodosClonados, mapaAristasClonadas);
    	estadoClonado.setmapa(mapaClonado);
    	
    	//	obstaculos
    	List<Casillero> obstaculosClonados = new ArrayList<Casillero>();
    	for(Casillero ca : mapaClonado.getNodos()){
    		for(Casillero o : this.getobstaculos()){
    			if(ca.getId().equals(o.getId())){
    				obstaculosClonados.add(ca);
    			}
    		}
    	}
    	estadoClonado.setobstaculos(obstaculosClonados);
    	// posicion
    	for(Casillero cas : mapaClonado.getNodos()){
    		if(cas.getId().equals(this.posicion.getId())){
    			estadoClonado.setposicion(new Casillero(cas));
    		}
    	}
    	// destino
    	for(Casillero casi : mapaClonado.getNodos()){
    		if(casi.getId().equals(this.destino.getId())){
    			estadoClonado.setdestino(new Casillero(casi));
    		}
    	}
    	
        return estadoClonado;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    @Override
    public void updateState(Perception p) {
        
    	Casillero siguienteCasillero = ((SmartToyPerception) p).getProximoNodo(); // Este Casillero 'sabe' si es un OBSTACULO o si tiene una OBSTRUCCION. Viene desde el Mapa del EstadoAmbiente
    	List<Casillero> nodosMapaAgente = this.getmapa().getNodos();
		
    	if(siguienteCasillero != null){
    		// actualizamos el mapa del EstadoAgente en caso de que haya un obstaculo
    		if (siguienteCasillero.isObstaculo()){
    			// agrego informacion sobre obstaculo en la lista obstaculos del EstadoAgente
    			this.getobstaculos().add(siguienteCasillero);
    			// agrego informacion sobre obstaculo en el MAPA del EstadoAgente
    			for(Casillero cas : nodosMapaAgente){
    				if(cas.getId().equals(siguienteCasillero.getId())){
    					cas.setObstaculo(true);
    					// TODO: AGREGAR EL OBSTACULO EN LA LISTA DE ARISTAS.
    				}
    			}
    		
    		}
    		// actualizamos el mapa del EstadoAgente en caso de que haya una obstruccion
    		if(siguienteCasillero.getObstruccion() != 0){
    			for(Casillero cas : nodosMapaAgente){
    				if(cas.getId().equals(siguienteCasillero.getId())){
    					cas.setObstruccion(siguienteCasillero.getObstruccion());
    				}
    			}
    		}
    	}
    	else{
    		System.out.println("En " + this.getposicion().getId() + " mirando al " + this.getorientacion() +  " no hay proximo.");
    	}    	
    }

    /**
     * This method returns the String representation of the agent state.
     */
    @Override
    public String toString() {
        String str = "";

        str += "En: ";
        str += this.getposicion().getId() + ", ";
        str += String.valueOf(this.getorientacion());
        return str;
    }

    /**
     * This method is used in the search process to verify if the node already
     * exists in the actual search.
     */
    @Override
    public boolean equals(Object obj) {
    	
       EstadoAgente estado = (EstadoAgente) obj;

    	boolean igualId = false;
    	boolean igualOrientacion = false;
    	// Igual ID
    	igualId = this.getposicion().getId().equals(estado.getposicion().getId());
    	// Ifual Orientacion    	
    	igualOrientacion = (this.getorientacion()==estado.getorientacion());
    	
    	return (igualId && igualOrientacion);
    }

    //TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
   	
     public Casillero getposicion(){
        return posicion;
     }
     public void setposicion(Casillero arg){
        posicion = arg;
     }
     public char getorientacion(){
        return orientacion;
     }
     public void setorientacion(char arg){
        orientacion = arg;
     }
     public Casillero getdestino(){
        return destino;
     }
     public void setdestino(Casillero arg){
        destino = arg;
     }
     public GrafoCasa getmapa(){
        return mapa;
     }
     public void setmapa(GrafoCasa arg){
        mapa = arg;
     }
     public List<Casillero> getobstaculos(){
        return obstaculos;
     }
     public void setobstaculos(List<Casillero> arg){
        obstaculos = arg;
     }

	public void setUltimaAccion(char ultimaAccion) {
		this.ultimaAccion = ultimaAccion;
	}

	public char getUltimaAccion() {
		return ultimaAccion;
	}
	
}

