

package frsf.cidisi.exercise.idemiatp1.search;

import domain.Casillero;
import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoSmartToy extends GoalTest {
	boolean metaIntermedia = false; // si paso por la meta intermedia correspondiente
	boolean enDestinoDeHabitacion = false; // si alcanzo el casillero definido como 'destino arbitrario' en la habitacion
	boolean percibioUsuario = false; // si percibo al usuario en frente
	int contador = 0; // para asegurarse que se cambien los boolean correspondientes UNA SOLA VEZ
	boolean enZonaCercana = false; // para cortar los arboles mas rapido, se fija que no salga de la habitacion
	boolean flag = false; // verdadero cuando percibi el usuario (osea que esta ENFRENTE mio)
	
    @Override
    public boolean isGoalState (AgentState agentState) {
    	EstadoAgente estado = (EstadoAgente) agentState;
    	if(!flag){
    		if(contador<1){ // vuelve a cero cuando ademas de haber pasado por la metaIntermedia, estoy en la zona intermedia y alcance el destino o al usuario
        		metaIntermedia = estado.getposicion().getId().equals(estado.getMetaIntermedia().getId());
        		if(metaIntermedia){
        			System.out.println("SMART TOY LLEGO A LA META INTERMEDIA.");
        			contador++;
        		}
        		else{
        			System.out.println("No cumplo aun la meta intermedia (" + estado.getposicion().getId() + "-"
        																	+ estado.getMetaIntermedia().getId() +
        																	").");
        		}
        	}
    		enDestinoDeHabitacion = estado.getposicion().getId().equals(estado.getdestino().getId());
        	percibioUsuario = estado.isUsuarioPercibido();
        	// CREO que no podemos depender de las primeras dos letras del ID, porque las puertas no siempre son nodos del cuarto
        	// enZonaCercana = estado.getposicion().getId().substring(0,2).equals(estado.getdestino().getId().substring(0,2));
        	if(metaIntermedia){
        		//if  (enZonaCercana && (enDestinoDeHabitacion || percibioUsuario)){
    	        if  (enDestinoDeHabitacion || percibioUsuario){
    	        	System.out.println("Objetivo de busqueda alcanzado");
    	        	if(percibioUsuario){
    	        		System.out.println(" al percibir usuario.");
    	        		flag = true;
    	        	}
    	        	else{
    	        		System.out.println(	" al alcanzar el punto arbitrario de la habitacion: " +
    	        							estado.getposicion().getId() + "-" + estado.getdestino().getId());
    	        	}
    	        	contador = 0; // para que cuando vuelva a ejecutar isGoalState durante la accion real, tenga que realizar lo mismo que al pensar
    	        	//enZonaCercana = false;
    	        	if(flag){ // si acabo de percibir al usuario, hacer un paso mas
    	        		return false;
    	        	}
    	        	else{ // si llego al 'destino arbitrario' de la habitacion, termino de pensar.
    	        		return true;
    	        	}
    	        	
    	        }
    	        //  NO MUESTRA MAS MENSAJES ESTO, se elimino el enZonaCercana
    	        else{ // no hace nada, era para ver que le falta cumplir, ahora que ya paso la meta intermedia.
    	        	/*
    	        	if(enZonaCercana){
    	        		System.out.println("Meta intermedia alcanzada, y esta en la zona, pero falta cumplir lo demas todavia.");
    	        	}
    	        	*/
    	        	if(enDestinoDeHabitacion){
    	        		System.out.println("Meta de agente alcanzada, pero no esta en la zona.");
    	        	}
    	        	if(percibioUsuario){
    	        		System.out.println("Agente detecto usuario, pero no alcanzo la meta intermedia.");
    	        	}
    	        	return false;
    	        }
        	}
        	else{
        		System.out.println("NO alcanzo la meta intermedia todavia.");
        		return false;
        	}	
    	}
    	else{ // lo percibi enfrente en el paso anterior (flag true) y ahora avance una vez mas (estoy encima)
    		if(estado.getUltimaAccion() == 'a'){ // si lo tenia enfrente y acabo de avanzar, estoy en su posicion
    			return true;
    		}
    	}
    	
    	return false; // para cumplir con la condicion de boolean del isGoalState
    	/////////////////////////////////////
    	//CODIGO ANTERIOR
    	//////////////////////////////////////
    	/*
    	if(contador<1){
    		metaIntermedia = estado.getposicion().getId().equals(estado.getMetaIntermedia().getId());
    		if(metaIntermedia){
    			System.out.println("SMART TOY LLEGO A LA META INTERMEDIA.");
    			contador++;
    		}
    		else{
    			System.out.println("No cumplo aun la meta intermedia (" + estado.getposicion().getId() + "-"
    																	+ estado.getMetaIntermedia().getId() +
    																	").");
    		}
    	}
    	enDestinoDeHabitacion = estado.getposicion().getId().equals(estado.getdestino().getId());
    	percibioUsuario = estado.isUsuarioPercibido();
    	enZonaCercana = estado.getposicion().getId().substring(0,2).equals(estado.getdestino().getId().substring(0,2));
    	
    	if(metaIntermedia){
	        if  (enZonaCercana && (enDestinoDeHabitacion || percibioUsuario)){
	        	System.out.println("Objetivo de busqueda alcanzado");
	        	if(percibioUsuario){
	        		System.out.println(" al percibir usuario.");
	        		flag = true;
	        	}
	        	else{
	        		System.out.println(	" al alcanzar el punto arbitrario de la habitacion: " +
	        							estado.getposicion().getId() + "-" + estado.getdestino().getId());
	        	}
	        	contador = 0; // para que cuando vuelva a ejecutar isGoalState durante la accion real, tenga que realizar lo mismo que al pensar
	        	enZonaCercana = false;
	        	return true;
	        }
	        else{
	        	if(enZonaCercana){
	        		System.out.println("Meta intermedia alcanzada, y esta en la zona, pero falta cumplir lo demas todavia.");
	        	}
	        	if(enDestinoDeHabitacion){
	        		System.out.println("Meta de agente alcanzada, pero no esta en la zona.");
	        	}
	        	if(percibioUsuario){
	        		System.out.println("Agente detecto usuario, pero no alcanzo la meta intermedia.");
	        	}
	        	return false;
	        }
    	}
    	else{
    		System.out.println("NO alcanzo la meta intermedia todavia.");
    		return false;
    	}
	*/
	}
}