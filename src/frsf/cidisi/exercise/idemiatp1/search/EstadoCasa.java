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
    private char orientacionAgente;
    private Casillero destinoAgente;
    private List<Casillero> obstaculosCasa;
	private GrafoCasa mapa;
    
	public EstadoCasa() {
        
        //TODO: Complete Method -- Aca se pueden crear los nodos / e inicializar
    	/*
			// posicionAgente = initData0;
			// destinoAgente = initData1;
			// obstaculosCasa = initData2;
			// mapa = initData3;
        */
        this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    @Override // aca se pueden inicializar si no se inicializaron en EstadoCasa(). Es opcional.
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

