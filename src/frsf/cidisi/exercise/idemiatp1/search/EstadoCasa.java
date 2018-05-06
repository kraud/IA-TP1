package frsf.cidisi.exercise.idemiatp1.search;

import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoCasa extends EnvironmentState {
	
	//TODO: Setup Variables
    private int posicionAgente;
    private int destinoAgente;
    private int obstaculosCasa;
	
    public EstadoCasa() {
        
        //TODO: Complete Method
    	/*
			// posicionAgente = initData0;
			// destinoAgente = initData1;
			// obstaculosCasa = initData2;
        */
        this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    @Override
    public void initState() {

        //TODO: Complete Method
    }

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
	
     public int getposicionAgente(){
        return posicionAgente;
     }
     public void setposicionAgente(int arg){
        posicionAgente = arg;
     }
     public int getdestinoAgente(){
        return destinoAgente;
     }
     public void setdestinoAgente(int arg){
        destinoAgente = arg;
     }
     public int getobstaculosCasa(){
        return obstaculosCasa;
     }
     public void setobstaculosCasa(int arg){
        obstaculosCasa = arg;
     }
	

}

