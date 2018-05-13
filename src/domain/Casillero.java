package domain;

import java.util.List;

public class Casillero {
	
	private String id;
	private double factorVelocidadSuperficie;
	private boolean visitado;
	private boolean obstaculo; // el area tiene un obstaculo solido (ropa, silla, etc)
	private int obstruccion; // -1 basura, 0 nada, 1 agua
	
	public Casillero(){
		this.id = null;
		this.factorVelocidadSuperficie = 1.0; // El valor por defecto, para superficies que no afectan la velocidad.
		this.visitado = false;
		this.obstaculo = false;
		this.obstruccion = 0;
	}
	
	
	public Casillero (String id){
		this.id = id;
		this.factorVelocidadSuperficie = 1.0;
		this.visitado = false;
		this.obstaculo = false;
		this.obstruccion = 0;
	}
	
	public Casillero (String id, double factorVelocidad){
		this.id = id;
		this.factorVelocidadSuperficie = factorVelocidad;
		this.visitado = false;
		this.obstaculo = false;
		this.obstruccion = 0;
	}
	
	public Casillero (String id, double factorVelocidad, boolean obstaculo, int obstruccion){
		this.id = id;
		this.factorVelocidadSuperficie = factorVelocidad;
		this.visitado = false;
		this.obstaculo = obstaculo;
		this.obstruccion = obstruccion;
	}
	
	public void setFactorVelocidadSuperficie(double factorVelocidadSuperficie) {
		this.factorVelocidadSuperficie = factorVelocidadSuperficie;
	}
	public double getFactorVelocidadSuperficie() {
		return factorVelocidadSuperficie;
		//TODO: devolver el factor de velocidad modificado si el area esta mojada
	}
	
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
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
	
	// creo una copia del Casillero, para no generar problemas con referencias
	public Casillero clone(){
		Casillero nuevoCasillero = new Casillero();
		
		nuevoCasillero.setId(this.getId());
		nuevoCasillero.setFactorVelocidadSuperficie(this.getFactorVelocidadSuperficie());
		nuevoCasillero.setVisitado(this.isVisitado());
		nuevoCasillero.setObstaculo(this.isObstaculo());
		nuevoCasillero.setObstruccion(this.getObstruccion());
		
		return nuevoCasillero;
	}
}

