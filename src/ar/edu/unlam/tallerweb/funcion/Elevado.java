package ar.edu.unlam.tallerweb.funcion;

public class Elevado extends OperacionBinaria{

	public Elevado(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public double eval() {
		return Math.pow(this.expresion1.eval(),this.expresion2.eval());
	}
	

}
