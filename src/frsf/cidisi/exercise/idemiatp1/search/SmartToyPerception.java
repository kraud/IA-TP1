package frsf.cidisi.exercise.idemiatp1.search;

import java.util.List;

import domain.Casillero;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class SmartToyPerception extends Perception {

	//TODO: Setup Statics
    public static int UNKNOWN_PERCEPTION = -1;
    public static List<String> UNKNOWN_PERCEPTION_LIST = null;
    public static String UNKNOWN_PERCEPTION_ITEM = null;
  
    //TODO: Setup Sensors
    private List<String> obstaculos;
	private String destino;
	
 

    public  SmartToyPerception() {
    	//TODO: Complete Method
    	obstaculos = UNKNOWN_PERCEPTION_LIST;
    	destino = UNKNOWN_PERCEPTION_ITEM;
    	
    }

    public SmartToyPerception(Agent agent, Environment environment) {
        super(agent, environment);
    }

    /**
     * This method is used to setup the perception.
     */
    @Override
    public void initPerception(Agent agentIn, Environment environmentIn) {
    	
    	//TODO: Complete Method
        
        SmartToy agent = (SmartToy) agentIn;
        Casa environment = (Casa) environmentIn;
        EstadoCasa environmentState = environment.getEnvironmentState();
        
        
        Casillero c = environmentState.getposicionAgente();
        EstadoAgente estadoAg = (EstadoAgente) agent.getAgentState();
        Casillero siguienteNodo = estadoAg.getmapa().proximoEnDireccion(c, estadoAg.getorientacion());
        
        boolean estaEnObjetivo  = environmentState.getdestinoAgente().equals(c);
        boolean hayObstaculo = environmentState.getobstaculosCasa().contains(siguienteNodo);
        
        if (estaEnObjetivo){
        	
        }
        else{
        	
        }
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        //TODO: Complete Method

        return str.toString();
    }

    // The following methods are agent-specific:
    //TODO: Complete this section with the agent-specific methods
	
     public List<String> getobstaculos(){
        return obstaculos;
     }
     public void setobstaculos(List<String> arg){
        this.obstaculos = arg;
     }
     public String getdestino(){
        return destino;
     }
     public void setdestino(String arg){
        this.destino = arg;
     }
	
   
}
