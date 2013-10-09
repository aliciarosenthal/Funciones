package ar.edu.unlam.tallerweb.funcion;

public abstract class Operando extends Expresion {
	int val;

	@Override
	public double eval() {
		return val;
	}

}
