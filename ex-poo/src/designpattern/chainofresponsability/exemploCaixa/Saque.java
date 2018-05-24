//armazena o valor do saque
package designpattern.chainofresponsability.exemploCaixa;
public class Saque {
	private int valor;
	public Saque(int qtde) {
		this.valor = qtde;
	}
	public int getValor() {
		return this.valor;
	}
}