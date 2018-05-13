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
	

    public EstadoAgente() {
    
    	//TODO: Complete Method
    	
		posicion = new Casillero();
		orientacion = '\0'; // Equivalente a 'null' char -> hacer condiciones considerando esto.
		destino = new Casillero();
		mapa = new GrafoCasa();
		obstaculos = new ArrayList<Casillero>();
        
        this.initState();
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
    	
    	// Atributos objeto, se clonan
    	//	mapa
    	List<Casillero> mapaNodosClonados = new ArrayList<Casillero>();
    	for(Casillero c : this.mapa.getNodos()){
    		mapaNodosClonados.add(c.clone());
    	}
    	List<Arco> mapaAristasClonadas = new ArrayList<Arco>();
    	for(Arco a : this.mapa.getAristas()){
    		mapaAristasClonadas.add(a.clone());
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
    			estadoClonado.setposicion(cas);
    		}
    	}
    	// destino
    	for(Casillero casi : mapaClonado.getNodos()){
    		if(casi.getId().equals(this.destino.getId())){
    			estadoClonado.setdestino(casi);
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
        
        //TODO: Complete Method
    	Casillero siguienteCasillero = ((SmartToyPerception) p).getProximoNodo(); // Este Casillero 'sabe' si es un OBSTACULO o si tiene una OBSTRUCCION. Viene desde el Mapa del EstadoAmbiente
    	List<Casillero> nodosMapaAgente = this.getmapa().getNodos();
		
    	// actualizamos el mapa del EstadoAgente en caso de que haya un obstaculo
    	if (siguienteCasillero.isObstaculo()){
    		// agrego informacion sobre obstaculo en la lista obstaculos del EstadoAgente
    		this.getobstaculos().add(siguienteCasillero);
    		// agrego informacion sobre obstaculo en el MAPA del EstadoAgente
    		for(Casillero cas : nodosMapaAgente){
    			if(cas.getId().equals(siguienteCasillero.getId())){
    				cas.setObstaculo(true);
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

    /**
     * This method is OPTIONAL, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
        
	//TODO: Complete Method

    }

    /**
     * This method returns the String representation of the agent state.
     */
    @Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

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
    	boolean igualesObstaculos = false;
       	boolean igualesVisitados = false;
    	boolean igualesObstrucciones = false;
    	
    	// IGUAL ID
    	igualId = this.getposicion().getId().equals(estado.getposicion().getId());
    	
    	// IGUAL OBSTACULOS
    	for(int i=0; i < this.getmapa().getNodos().size(); i++){
    		igualesObstaculos =
    			igualesObstaculos
    			&&
    			(this.getmapa().getNodos().get(i).isObstaculo()
    			==
    			estado.getmapa().getNodos().get(i).isObstaculo());
    	}
    	
    	// IGUAL VISITADOS
    	for(int i=0; i < this.getmapa().getNodos().size(); i++){
    		igualesVisitados =
    			igualesVisitados
    			&&
    			(this.getmapa().getNodos().get(i).isVisitado()
    			==
    			estado.getmapa().getNodos().get(i).isVisitado());
    	}
    	
    	// IGUAL OBSTRUCCIONES
    	for(int i=0; i < this.getmapa().getNodos().size(); i++){
    		igualesObstrucciones =
    			igualesObstrucciones
    			&&
    			(this.getmapa().getNodos().get(i).getObstruccion()
    			==
    			estado.getmapa().getNodos().get(i).getObstruccion());
    	}
    	
    	
        return (igualId && igualesObstaculos && igualesVisitados && igualesObstrucciones);
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
	
}

