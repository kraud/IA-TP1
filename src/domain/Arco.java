package domain;

import java.util.List;

public class Arco {

	private String id;
	private char tipoDeArco; // Define si es un arco horizontal (este-oeste) o vertical (norte-sur). 
	private Casillero extremoA; // (tipoDeArco == h) => corresponde al nodo este ; (tipoDeArco == v) => corresponde al nodo norte
	private Casillero extremoB; // (tipoDeArco == h) => corresponde al nodo oeste ; (tipoDeArco == v) => corresponde al nodo sur
	
	
	public Arco(String id, char tipo, Casillero cA, Casillero cB){
		this.setId(id);
		this.setTipoDeArco(tipo);
		this.setExtremoA(cA);
		this.setExtremoB(cB);
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public void setTipoDeArco(char tipoDeArco) {
		this.tipoDeArco = tipoDeArco;
	}

	public char getTipoDeArco() {
		return tipoDeArco;
	}

	public void setExtremoA(Casillero extremoA) {
		this.extremoA = extremoA;
	}

	public Casillero getExtremoA() {
		return extremoA;
	}

	public void setExtremoB(Casillero extremoB) {
		this.extremoB = extremoB;
	}

	public Casillero getExtremoB() {
		return extremoB;
	}
}
