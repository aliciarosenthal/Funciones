package ar.edu.unlam.tallerweb.funcion;

public class Formula {
	private Expresion expresion1;

	public Formula(Expresion expresion1) {
		this.expresion1 = expresion1;
	}

	public double eval() {
		return this.expresion1.eval();
	}

}
