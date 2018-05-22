package frsf.cidisi.exercise.idemiatp1.search.actions;

import frsf.cidisi.exercise.idemiatp1.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class GirarDerecha extends SearchAction {
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
        
    	System.out.println("Pienso en girar derecha en " + agState.getposicion().getId() + ".");
        switch (agState.getorientacion()){
        	case 'n':	agState.setorientacion('e');
        				break;
        	case 'o':	agState.setorientacion('n');
						break;
        	case 's':	agState.setorientacion('o');
						break;
        	case 'e':	agState.setorientacion('s');
						break;
        }
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
        	System.out.println("Gire realmente a la derecha en " + agState.getposicion().getId() + ".");
        	switch (agState.getorientacion()){ // Uso solamente la orientacion del agState porque deberia ser igual a la del environmentState
        		case 'n':	agState.setorientacion('e');
        					environmentState.setOrientacionAgente('e');
        					break;
        		case 'o':	agState.setorientacion('n');
        					environmentState.setOrientacionAgente('n');
        					break;
        		case 's':	agState.setorientacion('o');
        					environmentState.setOrientacionAgente('o');
        					break;
        		case 'e':	agState.setorientacion('s');
        					environmentState.setOrientacionAgente('s');
        					break;
        	}
        	//environmentState.girarAgente(agState, 'd');
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
        return "GirarDerecha";
    }
}