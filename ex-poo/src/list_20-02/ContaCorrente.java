package aula20fev;

// Exercicio 8
public class ContaCorrente {
	private String nome;
	private String senha;
	private double saldo;

	public ContaCorrente(String nome) {
		super();
		this.nome = nome;
	}

	public void cadastrarSenha(String senha) {
		this.senha = senha;
		System.out.println("Senha cadastrada com sucesso!");
	}

	public void alterarSenha(String senhaAntiga, String novaSenha) {
		if (senha.equals(senhaAntiga)) {
			this.senha = novaSenha;
			System.out.println("Senha alterada com sucesso!");
		} else {
			System.out.println("Senha antiga incorreta!");
		}
	}

	public void creditar(int valor, String senha) {
		if (this.senha.equals(senha)) {
			saldo += valor;
			System.out.println("Valor creditado com sucesso!\nSaldo Atual: " + saldo);
		} else {
			System.out.println("Senha incorreta!");
		}
	}

	public void debitar(int valor, String senha) {
		if (this.senha.equals(senha)) {
			saldo -= valor;
			System.out.println("Valor debitado com sucesso!\nSaldo Atual: " + saldo);
		} else {
			System.out.println("Senha incorreta!");
		}
	}

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente("Joaquim");
		c.cadastrarSenha("TESTE");
		c.alterarSenha("teste", "teste erro");
		c.alterarSenha("TESTE", "teste sucesso");
		c.creditar(15, "teste");
		c.creditar(15, "teste sucesso");
		c.debitar(10, "teste");
		c.debitar(10, "teste sucesso");
	}
}
