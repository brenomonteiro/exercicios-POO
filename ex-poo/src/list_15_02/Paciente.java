package aula15fev;

public class Paciente {

	// Exercicio 1.3
	private String nome;
	private double peso;
	private double altura;
	 
	public Paciente(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	// Exercicio 1.6
	public double calcularIMC() {
		return peso / altura * altura;
	}

	public String getNome() {
		return nome;
	}
}
