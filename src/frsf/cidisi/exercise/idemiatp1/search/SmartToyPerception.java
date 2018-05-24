package frsf.cidisi.exercise.idemiatp1.search;

import java.util.ArrayList;
import java.util.List;

import domain.Arco;
import domain.Casillero;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class SmartToyPerception extends Perception {

	//TODO: Setup Statics
    public static int UNKNOWN_PERCEPTION = -1;
  
    //TODO: Setup Sensors
    private Casillero proximoNodo;
	private Casillero destino;
	private boolean usuarioVisible;
	
 

    public  SmartToyPerception() {
    	//TODO: Complete Method
    	proximoNodo = new Casillero();
    	destino = new Casillero();
    	usuarioVisible = false;
    	
    }

    public SmartToyPerception(Agent agent, Environment environment) {
        super(agent, environment);
    }

    /**
     * This method is used to setup the perception -> son los valores con los que se INICIALIZA el agente (solo una vez)
     */
    @Override
    public void initPerception(Agent agentIn, Environment environmentIn) {
    	
    	//TODO: Complete Method
    	
        // AGENTE - AMBIENTE
        SmartToy agent = (SmartToy) agentIn;
        Casa environment = (Casa) environmentIn;
        
        // Estado AGENTE-AMBIENTE
        EstadoAgente estadoAg = (EstadoAgente) agent.getAgentState();
        EstadoCasa environmentState = environment.getEnvironmentState();
        
        // Informacion del agente
        Casillero pos = environmentState.getposicionAgente();
        //Casillero dest = environmentState.getdestinoAgente(); // ya se setea en el initState de EstadoAgente
        Casillero siguienteNodo = estadoAg.getmapa().proximoEnDireccion(pos, estadoAg.getorientacion());
        char orient = environmentState.getOrientacionAgente();
        
        // Comprueba si no esta parado en la puerta de la habitacion
        boolean metaIntermediaAlcanzada = estadoAg.getposicion().getId().equals(estadoAg.getMetaIntermedia().getId());
        // En caso de que inicie en el mismo cuarto, no hace falta que vaya hasta la puerta
        boolean enMismaHabitacion = estadoAg.getposicion().getId().substring(0,2).equals(estadoAg.getdestino().getId());
        
        // Asignamos al EstadoAgente la informacion del EstadoCasa
        
        estadoAg.setposicion(pos.clone());
        //estadoAg.setdestino(dest.clone()); // ya se setea en el initState de EstadoAgente
        estadoAg.setorientacion(orient);
        // TODO: Revisar aca cuando la posicion inicial del agente es igual a la 'posicion destino' de ese cuarto. Empieza y termina?
        if(metaIntermediaAlcanzada || enMismaHabitacion){ // si se encuentra en la puerta, o en la misma habitacion que su destino final
        	estadoAg.setMetaIntermedia(pos.clone()); // digo que su meta intermedia es su posicion inicial (si se 
        }
        
        //	clonar mapa
    	List<Casillero> nuevaListaNodosMapa = new ArrayList<Casillero>();
    	for(Casillero c : environmentState.getMapa().getNodos()){
    		Casillero aux = new Casillero(c); // c.clone() -> antes
    		aux.setObstaculo(false); // Es para borrar la informacion de obstaculos que el agente todavia no encontro, que si esta presente en el mapa completo del ambiente
    		aux.setObstruccion(0);
    		nuevaListaNodosMapa.add(aux);
    	}
    	List<Arco> nuevaListaAristasMapa = new ArrayList<Arco>();
    	for(Arco a : environmentState.getMapa().getAristas()){
    		nuevaListaAristasMapa.add(new Arco(a)); // a.clone() -> antes
    	}
    	GrafoCasa nuevoMapa = new GrafoCasa(nuevaListaNodosMapa, nuevaListaAristasMapa);
    	estadoAg.setmapa(nuevoMapa);
        
    	//	agrega el primer siguiente nodo a la lista de obstaculos, si corresponde
        boolean hayObstaculo = environmentState.getobstaculosCasa().contains(siguienteNodo);
        if(hayObstaculo){
        	estadoAg.getobstaculos().add(siguienteNodo);
        }
        // podria ser mas eficiente, pero asi tiene mas legibilidad, je.
        boolean usuarioEnFrente = environmentState.getdestinoAgente().getId().equals(estadoAg.getposicion().getId());
        if(usuarioEnFrente){
        	estadoAg.setUsuarioPercibido(true);
        }
    }
    
    @Override
    public String toString() {
        String str = "";
        
        if(proximoNodo != null){
        	str += "El Smart Toy percibe en frente suyo al casillero ";
        	str += proximoNodo.getId() + ". ";
        	str += "El casillero objetivo es ";
        	str += destino.getId();
        	str += "\n";
        	if(proximoNodo.isObstaculo()){
        		str += "Hay un obstaculo, no puede avanzar." + "\n";
        	}
        	if(proximoNodo.getObstruccion() < 0){
        		str += "Hay basura, avanza lento." + "\n";
        	}
        	if(proximoNodo.getObstruccion() > 0){
        		str += "Hay basura, avanza rapido." + "\n";
        	}
        }
        else {
        	str += "El Smart Toy no percibe nada en frente suyo." + "\n";
        }
        return str.toString();
    }

    // The following methods are agent-specific:
    //TODO: Complete this section with the agent-specific methods
	
     public Casillero getProximoNodo(){
        return proximoNodo;
     }
     public void setProximoNodo(Casillero arg){
        this.proximoNodo = arg;
     }
     public Casillero getdestino(){
        return destino;
     }
     public void setdestino(Casillero arg){
        this.destino = arg;
     }

	public void setUsuarioVisible(boolean usuarioVisible) {
		this.usuarioVisible = usuarioVisible;
	}

	public boolean isUsuarioVisible() {
		return usuarioVisible;
	}
	
   
}
