package domain;

import java.util.List;

public class Casillero {
	
	private String id;
	private double factorVelocidadSuperficie;
	private boolean visitado;
	private boolean obstaculo; // el area tiene un obstaculo solido (ropa, silla, etc)
	private boolean mojado;
	
	
	public Casillero (String id){
		this.id = id;
		this.factorVelocidadSuperficie = 1.0; // El valor por defecto, para superficies que no afectan la velocidad.
		this.visitado = false;
		this.obstaculo = false;
		this.mojado = false;
	}
	
	public Casillero (String id, double factorVelocidad){
		this.id = id;
		this.factorVelocidadSuperficie = factorVelocidad;
		this.visitado = false;
		this.obstaculo = false;
		this.mojado = false;
	}
	
	public Casillero (String id, double factorVelocidad, boolean obstaculo, boolean mojado){
		this.id = id;
		this.factorVelocidadSuperficie = factorVelocidad;
		this.visitado = false;
		this.obstaculo = obstaculo;
		this.mojado = mojado;
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

	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}

	public boolean isMojado() {
		return mojado;
	}
	
}

