package frsf.cidisi.exercise.idemiatp1.search;

import java.util.List;

import domain.Casillero;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoCasa extends EnvironmentState {
	
	//TODO: Setup Variables
    private Casillero posicionAgente;
    private Casillero destinoAgente;
    private List<Casillero> obstaculosCasa;
	
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
	

}

