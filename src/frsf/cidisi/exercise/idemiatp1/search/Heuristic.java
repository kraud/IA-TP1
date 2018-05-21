package frsf.cidisi.exercise.idemiatp1.search;

import domain.Casillero;
import frsf.cidisi.faia.solver.search.IEstimatedCostFunction;
import frsf.cidisi.faia.solver.search.NTree;

/**
 * This class allows to define a function to be used by any
 * informed search strategy, like A Star or Greedy.
 */
public class Heuristic implements IEstimatedCostFunction {

    /**
     * It returns the estimated cost to reach the goal from a NTree node.
     */
    @Override
    public double getEstimatedCost(NTree node) {
        EstadoAgente agState = (EstadoAgente) node.getAgentState();
        
        Casillero pos = agState.getposicion();
        Casillero dest = agState.getdestino();
        GrafoCasa mapa = agState.getmapa();
		
        double aux = mapa.funcionHeuristica(pos, dest);
        
        return aux;
    }
}
