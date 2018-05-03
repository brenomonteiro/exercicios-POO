package aula20fev;

// Exercicio 1
public class Circulo {
	private int raio;
	
	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	public double calculaAreaCirculo() {
		return Math.PI * raio * raio;
	}

	public double calculaPerimetroCirculo() {
		return 2 * Math.PI * raio;
	}
}
