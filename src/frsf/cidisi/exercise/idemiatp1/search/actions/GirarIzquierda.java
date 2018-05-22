package frsf.cidisi.exercise.idemiatp1.search.actions;

import interfaz.VistaPrincipal;
import frsf.cidisi.exercise.idemiatp1.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class GirarIzquierda extends SearchAction {

	private VistaPrincipal ventana;
    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
    	
    	// TODO: Use this conditions
        // PreConditions: null
        // PostConditions: null
    	EstadoAgente agState = (EstadoAgente) s;
        
    	System.out.println("Pienso en girar izquierda en " + agState.getposicion().getId() + ".");
        switch (agState.getorientacion()) {
        	case 'n':	agState.setorientacion('o');
        				break;
        	case 'o':	agState.setorientacion('s');
						break;
        	case 's':	agState.setorientacion('e');
						break;
        	case 'e':	agState.setorientacion('n');
						break;
        }
        agState.setUltimaAccion('g');
        return agState; // siempre va a poder girar, y por eso borramos el return null predeterminado
    }

    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        EstadoCasa environmentState = (EstadoCasa) est;
        EstadoAgente agState = ((EstadoAgente) ast);

        // TODO: Use this conditions
        // PreConditions: null
        // PostConditions: null
        
        if (true) {
            // Update the real world
    		System.out.println("Gire realmente a la izquierda en " + agState.getposicion().getId() + ".");
        	switch (agState.getorientacion()) {
        	// Uso solamente la orientacion del agState porque deberia ser igual a la del environmentState

        		case 'n':	agState.setorientacion('o');
        					environmentState.setOrientacionAgente('o');
        					break;
        		case 'o':	agState.setorientacion('s');
        					environmentState.setOrientacionAgente('s');
        					break;
        		case 's':	agState.setorientacion('e');
        					environmentState.setOrientacionAgente('e');
        					break;
        		case 'e':	agState.setorientacion('n');
        					environmentState.setOrientacionAgente('n');
        					break;
        	}
        	//environmentState.girarAgente(agState, 'i');
        	agState.setUltimaAccion('g');
            return environmentState;
        }
        return null;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost() {
        return new Double(0.0); // El SmartToy tarda 1 segundo en cambiar de direccion
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "GirarIzquierda";
    }
}