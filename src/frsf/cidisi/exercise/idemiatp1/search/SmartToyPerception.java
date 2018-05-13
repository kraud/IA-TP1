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
	
 

    public  SmartToyPerception() {
    	//TODO: Complete Method
    	proximoNodo = new Casillero();
    	destino = new Casillero();
    	
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
        Casillero dest = environmentState.getdestinoAgente();
        Casillero siguienteNodo = estadoAg.getmapa().proximoEnDireccion(pos, estadoAg.getorientacion());
        char orient = environmentState.getOrientacionAgente();
        GrafoCasa mapa =  environmentState.getMapa();
        
        // Asignamos al EstadoAgente la informacion del EstadoCasa
        estadoAg.setposicion(pos.clone());
        estadoAg.setdestino(dest.clone());
        // estadoAg.setobstaculos(new ArrayList<Casillero>()); -> ya esta en EstadoAgente()
        estadoAg.setorientacion(orient);
        
        //	clonar mapa
    	List<Casillero> nuevaListaNodosMapa = new ArrayList<Casillero>();
    	for(Casillero c : environmentState.getMapa().getNodos()){
    		Casillero aux = c.clone();
    		aux.setObstaculo(false); // Es para borrar la informacion de obstaculos que el agente todavia no encontro, que si esta presente en el mapa completo del ambiente
    		nuevaListaNodosMapa.add(aux);
    	}
    	List<Arco> nuevaListaAristasMapa = new ArrayList<Arco>();
    	for(Arco a : environmentState.getMapa().getAristas()){
    		nuevaListaAristasMapa.add(a.clone());
    	}
    	GrafoCasa nuevoMapa = new GrafoCasa(nuevaListaNodosMapa, nuevaListaAristasMapa);
    	estadoAg.setmapa(nuevoMapa);
        
    	//	agrega el primer siguiente nodo a la lista de obstaculos, si corresponde
        boolean hayObstaculo = environmentState.getobstaculosCasa().contains(siguienteNodo);
        if(hayObstaculo){
        	estadoAg.getobstaculos().add(siguienteNodo);
        }
    }
    
    @Override
    public String toString() {
        String str = "";
        
        //TODO: Complete Method
        str += "El SmartToy se dirige a ";
        str += destino.getId();
        
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
	
   
}
