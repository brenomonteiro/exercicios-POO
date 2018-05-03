package aula20fev;

// Exercicio 5
public class Pessoa {
	private String nome;
	private String CPF;
	private int idade;

	public Pessoa(String nome, String CPF, int idade) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + CPF + "\nIdade: " + idade;
	}

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joao", "018.586.186-57", 19);
		Pessoa p2 = new Pessoa("Maria", "586.018.186-57", 22);

		System.out.println(p1);
		System.out.println("\n" + p2);
		p1.setCPF("000.000.000-00");
		p1.setNome("Teste de sucesso!");
		p1.setIdade(100);

		p2.setCPF("111.111.111-11");
		p2.setNome("Teste de sucesso 2!\n");
		p2.setIdade(200);

		System.out.println(" --------------------------- Depois de editar!");
		System.out.println("Nome: " + p1.getNome() + "\nCPF: " + p1.getCPF() + "\nIdade: " + p1.getIdade() + "\n");
		System.out.println("Nome: " + p2.getNome() + "CPF: " + p2.getCPF() + "\nIdade: " + p2.getIdade());

	}
}
