package di.xml.interfaces;

public interface ICalculadora {
	public String getMarca();
	public String getModelo();
	//inyecto Matemáticas
	public double sumar(double n1, double n2);
	public double restar(double n1, double n2);
	public double multiplicar(double n1, double n2);
	public double dividir(double n1, double n2);
}
