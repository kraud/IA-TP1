

package frsf.cidisi.exercise.idemiatp1.search;

import domain.Casillero;
import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoSmartToy extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    
    	EstadoAgente estado = (EstadoAgente) agentState;
    	
    	Casillero pos = estado.getposicion();
    	Casillero dest = estado.getdestino();
    	
    	String posId = pos.getId();
    	String destId = dest.getId();
    	
        if  (posId.equals(destId)){
        	System.out.println("Objetivo de busqueda alcanzado");
        	return true;
        }
        else{
        	return false;
        }
	}
}