package aula15fev;

// Exercicio 1.20
public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome;

		if (qtdMinima < 0 || qtdAtual < 0) {
			System.out.println("As quantidades nao podem ser negativas!");
			return;
		}

		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public void repor(int qtd) {
		this.qtdAtual += qtd;
	}

	public void darBaixa(int qtd) {
		if ((qtdAtual - qtd) < 0) {
			System.out.println("A quantidade informada excede o estoque");
			return;
		}

		this.qtdAtual -= qtd;
	}

	public String descricao() {
		return "Nome do Produto: " + this.nome + "\nQuantidade Mínima: " + this.qtdMinima + "\nQuantidade Atual: "
				+ qtdAtual;

	}

	public boolean precisaRepor() {
		if (qtdAtual <= qtdMinima) {
			return true;
		}

		return false;
	}
}
