package ar.edu.unlam.tallerweb.funcion;

public class LogNep extends OperacionUnaria {
	public LogNep(Expresion expresion1) {
		super(expresion1);
	}

	@Override
	public double eval() {
		return Math.log(this.expresion1.eval());
	}

}
