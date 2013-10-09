package ar.edu.unlam.tallerweb.funcion;

public abstract class OperacionBinaria extends Expresion {
	protected Expresion expresion1;
	protected Expresion expresion2;

	public OperacionBinaria(Expresion expresion1, Expresion expresion2) {
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}

}
