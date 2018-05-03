package aula15fev;

// Exercicio 1.18
public class Quadrado {
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	public double area() {
		return lado * lado;
	}
	
	public double perimetro() {
		return lado * 4;
	}
}
