package domain;

import java.util.Arrays;
import java.util.List;

public class Casillero {
	
	private String id;
	private double factorVelocidadSuperficie;
	private boolean visitado;
	//private short cantidadGiros;
	private boolean obstaculo; // el area tiene un obstaculo solido (ropa, silla, etc)
	private int obstruccion; // -1 basura, 0 nada, 1 agua
	private List<Double> coordenada; // el primer valor representa X, el segundo valor representa Y
	
	public Casillero(){
		this.id = null;
		this.factorVelocidadSuperficie = 1.0; // El valor por defecto, para superficies que no afectan la velocidad.
		this.visitado = false;
		this.obstaculo = false;
		this.obstruccion = 0;
		this.setCoordenada(null);
	}
	
	// Utilizado para clonar SIN referencia. Se usa para clonar el EstadoAgente
	public Casillero (Casillero estadoNuevo){
		this.id = estadoNuevo.id;
		this.factorVelocidadSuperficie = estadoNuevo.factorVelocidadSuperficie;
		this.visitado = estadoNuevo.visitado;
		this.obstaculo = estadoNuevo.obstaculo;
		this.obstruccion = estadoNuevo.obstruccion;
		this.coordenada = Arrays.asList(estadoNuevo.coordenada.get(0), estadoNuevo.coordenada.get(1));
	}
	
	
	public Casillero (String id){
		this.id = id;
		this.factorVelocidadSuperficie = 1.0;
		this.visitado = false;
	//	this.cantidadGiros = 0;
		this.obstaculo = false;
		this.obstruccion = 0;
		this.setCoordenada(null);
	}
	
	public Casillero (String id, double factorVelocidad){
		this.id = id;
		this.factorVelocidadSuperficie = factorVelocidad;
		this.visitado = false;
		this.obstaculo = false;
		this.obstruccion = 0;
		this.setCoordenada(null);
	}
	
	public Casillero (String id, double factorVelocidad, boolean obstaculo, int obstruccion, List<Double> coord){
		this.id = id;
		this.factorVelocidadSuperficie = factorVelocidad;
		this.visitado = false;
		this.obstaculo = obstaculo;
		this.obstruccion = obstruccion;
		this.setCoordenada(coord);
	}
	
	public void setFactorVelocidadSuperficie(double factorVelocidadSuperficie) {
		this.factorVelocidadSuperficie = factorVelocidadSuperficie;
	}
	public double getFactorVelocidadSuperficie() {
		double factorModificado = this.factorVelocidadSuperficie;
		
		switch(this.getObstruccion()){
			case(-1): 	factorModificado = factorModificado*0.5;
						break;
			
			case(0):	break;
			
			case(1):	factorModificado = factorModificado*2;
						break;
		}
		
		return factorModificado;
	}
	
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
//		System.out.print(id + " VISITADO");
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setObstaculo(boolean obstaculo) {
		this.obstaculo = obstaculo;
	}

	public boolean isObstaculo() {
		return obstaculo;
	}

	public void setObstruccion(int obstruccion) {
		this.obstruccion = obstruccion;
	}

	public int getObstruccion() {
		return obstruccion;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setCoordenada(List<Double> coordenada) {
		this.coordenada = coordenada;
	}


	public List<Double> getCoordenada() {
		return coordenada;
	}
	
	// creo una copia del Casillero, para no generar problemas con referencias
	public Casillero clone(){
		
		Casillero nuevoCasillero = new Casillero (this);
		/*
		Casillero nuevoCasillero = new Casillero();
		
		nuevoCasillero.setId(this.getId());
		nuevoCasillero.setFactorVelocidadSuperficie(this.getFactorVelocidadSuperficie());
		nuevoCasillero.setVisitado(this.isVisitado());
		nuevoCasillero.setObstaculo(this.isObstaculo());
		nuevoCasillero.setObstruccion(this.getObstruccion());
		nuevoCasillero.setCoordenada(this.getCoordenada());
		*/
		return nuevoCasillero;
	}


//	public void setCantidadGiros(short cantidadGiros) {
//		this.cantidadGiros = cantidadGiros;
//	}

	/*public void incrementarCantidadGiros() {
		this.cantidadGiros++;
	}*/


//	public short getCantidadGiros() {
//		return cantidadGiros;
//	}
}

