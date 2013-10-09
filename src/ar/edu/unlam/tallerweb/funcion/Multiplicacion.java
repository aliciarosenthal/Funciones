package ar.edu.unlam.tallerweb.funcion;

public class Multiplicacion extends OperacionBinaria {

	public Multiplicacion(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public double eval() {
		return this.expresion1.eval() * this.expresion2.eval();
	}
}
