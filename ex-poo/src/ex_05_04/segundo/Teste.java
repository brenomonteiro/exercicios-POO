package ocp.segundo;

public class Teste {
	public static void main(String[] args) {
		ServicoDeEntrega frete = new FreteBicicleta();
		TabelaDePreco tabela = new TabelaDePrecoPadrao();
		Compra compra = new Compra(100.0, "SAO PAULO");
		System.out.println((new CalculadoraDePrecos(tabela, frete)).calcula(compra));
	}

}
