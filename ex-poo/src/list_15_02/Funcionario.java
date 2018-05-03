package aula15fev;

public class Funcionario {

	// Exercicio 1.2
	private String nome;
	private double horasTrabalhadas;
	private double valorHora;
 
	// Exercicio 1.13
	public Funcionario(String nome, double horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	// Exercicio 1.5
	public double calculaSalario() {
		return horasTrabalhadas * valorHora;
	}

	public String getNome() {
		return nome;
	}
}
