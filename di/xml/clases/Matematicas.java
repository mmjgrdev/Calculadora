package di.xml.clases;

import di.xml.interfaces.IMatematicas;

public class Matematicas implements IMatematicas {
	/*
	private double n1;
	private double n2;
	*/
	/*
	public Matematicas() {
		this.n1=0.0;
		this.n2=0.0;
	}
	*/
	/*
	public Matematicas(double n1, double n2) {
		this.n1=n1;
		this.n2=n2;
	}
*/
	@Override
	public double sumar(double n1, double n2) {
	//	return this.n1+this.n2;
		return n1+n2;
	}

	@Override
	public double restar(double n1, double n2) {
		return n1-n2;
	}

	@Override
	public double multiplicar(double n1, double n2) {
		return n1*n2;
	}

	@Override
	public double dividir(double n1, double n2) {
		return (n2==0.0)?0.0:n1/n2;
	}

}
