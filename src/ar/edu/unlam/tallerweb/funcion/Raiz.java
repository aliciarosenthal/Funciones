package ar.edu.unlam.tallerweb.funcion;

public class Raiz extends OperacionBinaria{
	public Raiz(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public double eval() {
		return Math.pow(this.expresion1.eval(),1/this.expresion2.eval());
	}
	
}
