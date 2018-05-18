package frsf.cidisi.exercise.idemiatp1.search.actions;

import java.util.List;

import domain.Casillero;
import frsf.cidisi.exercise.idemiatp1.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class Avanzar extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
        EstadoAgente agState = (EstadoAgente) s;
        
        // TODO: Use this conditions
        // PreConditions: null
        // PostConditions: null
        
        Casillero proximoNodo = agState.getmapa().proximoEnDireccion(agState.getposicion(), agState.getorientacion());
        boolean obstaculizado = agState.getobstaculos().contains(proximoNodo);
        
        if(proximoNodo!=null && !obstaculizado){
        	proximoNodo.setVisitado(true);
        	agState.setposicion(proximoNodo);
        	System.out.println("AVANCÉ BUSQUEDA!!!!");
        	return agState;
        }        
        return null;
    }

    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        EstadoCasa environmentState = (EstadoCasa) est;
        EstadoAgente agState = ((EstadoAgente) ast);

        Casillero proximoNodo = agState.getmapa().proximoEnDireccion(agState.getposicion(), agState.getorientacion());
        boolean obstaculizado = agState.getobstaculos().contains(proximoNodo);
        
        // TODO: Use this conditions
        // PreConditions: null
        // PostConditions: null
        
        if (proximoNodo!=null && !obstaculizado) {
            // Update the real world
        	
        	// Busco el nodo correspondiente a 'proximoNodo', pero EN el mapa DEL AMBIENTE, para actualizar la informacion de visitado
        	List<Casillero> listaCasillerosAmbiente = environmentState.getMapa().getNodos();
        	for(Casillero c : listaCasillerosAmbiente){
        		if(c.getId().equals(proximoNodo.getId())){
        			c.setVisitado(true);
        		}
        	}
        	
            // Update the agent state
            proximoNodo.setVisitado(true);
        	agState.setposicion(proximoNodo);
        	
        	System.out.println("AVANCÉ REAL!!!!");
            return environmentState;
        }

        return null;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost() {
    	
    	
    	
        return new Double(0);
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "Avanzar";
    }
}