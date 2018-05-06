package frsf.cidisi.exercise.idemiatp1.search;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class SmartToyPerception extends Perception {

	//TODO: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	
	//TODO: Setup Sensors
	private int obstaculos;
	private int destino;
	
 

    public  SmartToyPerception() {
    	//TODO: Complete Method
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
        
        //SmartToy agent = (SmartToy) agentIn;
        //Casa environment = (Casa) environmentIn;
        //EstadoCasa environmentState =
        //        environment.getEnvironmentState();
       
        
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        //TODO: Complete Method

        return str.toString();
    }

    // The following methods are agent-specific:
    //TODO: Complete this section with the agent-specific methods
	
     public int getobstaculos(){
        return obstaculos;
     }
     public void setobstaculos(int arg){
        this.obstaculos = arg;
     }
     public int getdestino(){
        return destino;
     }
     public void setdestino(int arg){
        this.destino = arg;
     }
	
   
}
