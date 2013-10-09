package ar.edu.unlam.tallerweb.funcion;

public class Negativo extends OperacionUnaria {

	Negativo(Expresion expresion1) {
		super(expresion1);
	}

	@Override
	public double eval() {
		return this.expresion1.eval() * -1;
	}

}
