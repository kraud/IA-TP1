package frsf.cidisi.exercise.idemiatp1.search;

import domain.Casillero;
import frsf.cidisi.faia.solver.search.IStepCostFunction;
import frsf.cidisi.faia.solver.search.NTree;

/**
 * This class can be used in any search strategy like
 * Uniform Cost.
 */
public class CostFunction implements IStepCostFunction {

    /**
     * This method calculates the cost of the given NTree node.
     */
    @Override
    public double calculateCost(NTree node) {
        EstadoAgente estado = (EstadoAgente) node.getAgentState();
        GrafoCasa mapa = estado.getmapa();
           	
    	
        //return node.getAction().getCost(); -> no sabemos donde hacer los cambios para darle la informacion necesaria a getCost
        return mapa.costoAvanzar(estado);
    }
}
