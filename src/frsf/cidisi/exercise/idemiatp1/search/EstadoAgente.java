package frsf.cidisi.exercise.idemiatp1.search;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {
	
	//TODO: Setup Variables
    private int posicion;
    private char orientacion;
    private int destino;
    private GrafoCasa mapa;
    private int obstaculos;
	

    public EstadoAgente() {
    
    	//TODO: Complete Method
    	/*
			// posicion = initData0;
			// orientacion = initData1;
			// destino = initData2;
			// mapa = initData3;
			// obstaculos = initData4;
        */
        this.initState();
    }

    /**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    @Override
    public SearchBasedAgentState clone() {
        
		//TODO: Complete Method
		
        return null;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    @Override
    public void updateState(Perception p) {
        
        //TODO: Complete Method
    }

    /**
     * This method is optional, and sets the initial state of the agent.
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
       
       //TODO: Complete Method
        
        return true;
    }

    //TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
   	
     public int getposicion(){
        return posicion;
     }
     public void setposicion(int arg){
        posicion = arg;
     }
     public char getorientacion(){
        return orientacion;
     }
     public void setorientacion(char arg){
        orientacion = arg;
     }
     public int getdestino(){
        return destino;
     }
     public void setdestino(int arg){
        destino = arg;
     }
     public GrafoCasa getmapa(){
        return mapa;
     }
     public void setmapa(GrafoCasa arg){
        mapa = arg;
     }
     public int getobstaculos(){
        return obstaculos;
     }
     public void setobstaculos(int arg){
        obstaculos = arg;
     }
	
}

