package ar.edu.unlam.tallerweb.funcion;

import org.junit.Assert;
import org.junit.Test;

public class FuncionTest {
	Expresion c1 = new Constante(3);
	Expresion c2 = new Constante(2);
	Variable v1 = new Variable();
	Expresion multiplicacion = new Multiplicacion(c1, v1);
	Expresion multiplicacion2 = new Multiplicacion(c1, c2);
	Expresion suma = new Suma(c1, v1);
	Expresion negativo = new Negativo(c2);
	Expresion lognep = new LogNep(multiplicacion2);
	Expresion suma2 = new Suma(multiplicacion, suma); // suma con dos operaciones
	Formula formula1 = new Formula(suma2); // la formula seria f(x)= (3*x)(3+x)

	@Test
	public void TestearFormula1() {
		// formula a testear f(x)= (3*x)(3+x)
		v1.setVal(15);
		Assert.assertTrue(formula1.eval() == 63); // f(15)=(3*15)+(3+15)
	}

	@Test
	public void TestearFormula1conOtraVariable() {
		// formula a testear f(x)= (3*x)(3+x)
		v1.setVal(10);
		Assert.assertTrue(formula1.eval() == 43); // f(10)=(3*10)+(3+10)
	}

	@Test
	public void TestearFormula2() {
		// formula a testear f(x)= -((x*2)+ (lognep(3))
		v1.setVal(5);
		Expresion lognep3 = new LogNep(c1); // lognep3 =1.0986122887
		Expresion multiplicacion3 = new Multiplicacion(v1, c2); // multiplicacion3=10
		Expresion suma3 = new Suma(multiplicacion3, lognep3); // sum3=11.098
		Expresion negativo2 = new Negativo(suma3); // negativo2 = -11.098z
		Formula formula2 = new Formula(negativo2); // f(5)= -((5*2)+ (lognep(3))
		Assert.assertEquals(-11.098, formula2.eval(), 0.1);

	}
	
	@Test
	public void TestearFormula3() {
		// formula a testear f(x) = (ln (3*(x^2))/2
		v1.setVal(3);
		Expresion elevado1 = new Elevado(v1, c2);// =9
		Expresion multiplicacion4 = new Multiplicacion(c1, elevado1);// =27
		Expresion lognep4 = new LogNep(multiplicacion4);// =3,2958
		Expresion division1 = new Division(lognep4, c2);// =1,6479
		Formula formula3 = new Formula(division1);
		Assert.assertEquals(1.64, formula3.eval(), 0.1);
	}
	
	@Test
	public void TestearFormula4() {
		// formula a testear f(x,y) = 3x + 2y 
		v1.setVal(3);
		Variable y = new Variable();
		y.setVal(4);
		Expresion multiplicacion3 = new Multiplicacion(c1,v1);//=9
		Expresion multiplicacion4 = new Multiplicacion(c2,y);//=8
		Expresion suma3 = new Suma (multiplicacion3, multiplicacion4);//=17
		Formula formula4 = new Formula(suma3);
		Assert.assertEquals(17, formula4.eval(), 0.1);
	}

	@Test
	public void TestearEvalLogNep() {
		Assert.assertEquals(1.779, lognep.eval(), 0.1); // logNep (6) (c1=3 * c2=2);
	}

	@Test
	public void TestearEvalNegativo() {
		Assert.assertTrue(negativo.eval() == -2);
	}

	@Test
	public void TestearEvalSumaConMultiplicacion() {
		v1.setVal(7);
		Assert.assertTrue(suma2.eval() == 31); // (3*7) + (3+7)=31
	}

	@Test
	public void TestearEvalSuma() {
		v1.setVal(7);
		Assert.assertTrue(suma.eval() == 10);
	}

	@Test
	public void TestearEvalMultiplicacion() {
		v1.setVal(5);
		Assert.assertTrue(multiplicacion.eval() == 15);
	}

	@Test
	public void TestearEvalConstante() {
		Assert.assertTrue(c1.eval() == 3);
	}

	@Test
	public void TestearEvalVariable() {
		v1.setVal(5);
		Assert.assertTrue(v1.eval() == 5);
	}
}
