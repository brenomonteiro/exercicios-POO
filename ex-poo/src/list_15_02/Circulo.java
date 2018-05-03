package aula15fev;

// Exercicio 1.1
public class Circulo {
 
	// Exercicio 1.4
	static double pi = 3.14159265359;
	private int raio;
	
	// Exercicio 1.12
	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	public double calculaAreaCirculo() {
		return pi * raio * raio;
	}

	public double calculaPerimetroCirculo() {
		return 2 * pi * raio;
	}
}