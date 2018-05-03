package aula20fev;

// Exercicio 7
public class Teste {
	public static void main(String[] args) {
		Calculo c = new Calculo();

		c.credito(15);
		c.debito(12);
		System.out.println("Saldo: " + c.getSaldo());

	}
}
