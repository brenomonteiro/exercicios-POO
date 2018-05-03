package aula20fev;

// Exercicio 6
public class Aluno {
	private String nome;
	private double n1;
	private double n2;

	public Aluno(String nome, double n1, double n2) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}

	public double mediaAritimetica() {
		return (n1 + n2) / 2;
	}

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 10, 9);
		Aluno a2 = new Aluno("Beto", 9, 10);
	}
}
