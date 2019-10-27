package di.xml.clases;

import di.xml.interfaces.ICalculadora;
import di.xml.interfaces.IMatematicas;

public class Calculadora implements ICalculadora {
	//
	private IMatematicas iMatematicas;
	
	public Calculadora() {};
	
	public Calculadora(IMatematicas iMatematicas) {
		this.iMatematicas=iMatematicas;
	}

	@Override
	public String getMarca() {
		return "Marca: una marca";
	}

	@Override
	public String getModelo() {
		return "Modelo: un modelo";
	}

	@Override
	public String toString() {
	//	return "Calculadora [toString()=" + super.toString() + "]";
		return "Calculadora: "+getMarca()+"; "+getModelo();
	}

	@Override
	public double sumar(double n1, double n2) {
		return this.iMatematicas.sumar(n1, n2);
	}

	@Override
	public double restar(double n1, double n2) {
		return this.iMatematicas.restar(n1, n2);
	}

	@Override
	public double multiplicar(double n1, double n2) {
		return this.iMatematicas.multiplicar(n1, n2);
	}

	@Override
	public double dividir(double n1, double n2) {
		return this.iMatematicas.dividir(n1, n2);
	}

	
	

}
