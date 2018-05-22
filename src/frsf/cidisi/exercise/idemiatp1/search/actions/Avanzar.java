package frsf.cidisi.exercise.idemiatp1.search.actions;

import java.util.List;

import domain.Arco;
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
        boolean obstaculizado = agState.getobstaculos().contains(proximoNodo); // revisa si objeto pertenece a la lista. Puede ser que nunca de verdadero. Revisar por ID

    	System.out.println("Pienso en avanzar en " + agState.getposicion().getId() + ", hacia " + agState.getorientacion() + ".");
        if(proximoNodo!=null && !obstaculizado){
        	// proximoNodo.setVisitado(true);
        	agState.getmapa().getCasilleroPorId(proximoNodo.getId()).setVisitado(true); // Marco como visitado el NODO en el mapa DEL AGENTE
        	
        	// Al parecer los extremos de los arcos NO son punteros a los nodos del mapa, asique los modifico manualmente
        	List<Arco> arcosTemp = agState.getmapa().getArcosPorIds(proximoNodo.getId());
        	for (Arco arc : arcosTemp){ // Hay que marcarlo como visitado en todos los arcos que lo contienen
        		if(arc.getExtremoA().getId().equals(proximoNodo.getId())){ // TODO: NO ESTA CONSIDERANDO EL CASO EN QUE NO EXISTA EL ARCO. Revisar.
            		arc.getExtremoA().setVisitado(true);
            	}
            	else {
            		arc.getExtremoB().setVisitado(true);
            	}
        	}
        	agState.setposicion(proximoNodo);
        	agState.setUltimaAccion('a');
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

            // Update the agent state
            agState.setposicion(proximoNodo);
            // marcar nodo del mapa como visitado
            for(Casillero nodo : agState.getmapa().getNodos()){
            	if(nodo.getId().equals(proximoNodo.getId())){
            		nodo.setVisitado(true);
            	}
            }          
            // marcar arcos del mapa como visitado
            List<Arco> arcosQueContieneProximoNodo = agState.getmapa().getArcosPorIds(proximoNodo.getId());
            for (Arco arc : arcosQueContieneProximoNodo){
        		if(arc.getExtremoA().getId().equals(proximoNodo.getId())){ // NO ESTA CONSIDERANDO EL CASO EN QUE NO EXISTA EL ARCO. Revisar.
            		arc.getExtremoA().setVisitado(true);
            	}
            	else {
            		arc.getExtremoB().setVisitado(true);
            	}
        	}
            
        	// Update the real world
            environmentState.setposicionAgente(proximoNodo);
            // para interfaz
            environmentState.modificarPosicionSmartToy(proximoNodo);
        	agState.setUltimaAccion('a');
        	System.out.println("Avance REAL.");        	
            return environmentState;
        }

        return null;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost() {
    	
        return new Double(1);
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