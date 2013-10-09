package ar.edu.unlam.tallerweb.funcion;

public abstract class OperacionUnaria extends Expresion {
	protected Expresion expresion1;

	OperacionUnaria(Expresion expresion1) {
		this.expresion1 = expresion1;
	}

}
