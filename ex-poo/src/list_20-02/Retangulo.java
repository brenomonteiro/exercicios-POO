package aula20fev;

// Exercicio 9
public class Retangulo {
	private int base;
	private int altura;

	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int calculaArea() {
		return base * altura;
	}

	public int calcularPerimetro() {
		return 2 * base * altura;
	}

	public void verificaQuadrado() {
		if (base == altura) {
			System.out.println("SIM");
		} else {
			System.out.println("NAO");
		}
	}
}
