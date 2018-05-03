package aula15fev;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		// Executar apenas um metodo por vez
		// executaExercicio7();
		// executaExercicio8();
		// executaExercicio9();
		// executaExercicio10();
		// executaExercicio14();
		// executaExercicio19();
		executaExercicio21();
	}

	private static void executaExercicio21() {
		// Exercicio 1.21
		Estoque e1 = new Estoque("Impressora Jato de Tinta", 13, 6);
		Estoque e2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
		Estoque e3 = new Estoque("Mouse Ótico", 6, 2);
		
		// Letra A - Exercicio 1.21
		e1.darBaixa(5);
		
		// Letra B - Exercicio 1.21
		e2.repor(7);
		
		// Letra C - Exercicio 1.21
		e3.darBaixa(4);
		
		// Letra D - Exercicio 1.21
		System.out.println("Precisa repor estoque 1?\n" + e1.precisaRepor());
		System.out.println("\nPrecisa repor estoque 2?\n" + e2.precisaRepor());
		System.out.println("\nPrecisa repor estoque 3?\n" + e3.precisaRepor());
		
		System.out.println("----------------------------------------------------------");
		
		// Letra E - Exercicio 1.21
		System.out.println("\nDescricao do estoque 1\n" + e1.descricao());
		System.out.println("\nDescricao do estoque 2\n" + e2.descricao());
		System.out.println("\nDescricao do estoque 3" + e3.descricao());
		
		
	}

	private static void executaExercicio19() {
		// Exercicio 1.19
		System.out.println("Exercicio 1.19 --------------------------------------------------------------");
		Quadrado q1 = new Quadrado(3);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);

		imprimeQuadrado(q1);
		imprimeQuadrado(q2);
		imprimeQuadrado(q3);
	}

	private static void executaExercicio14() {
		// Exercicio 1.14
		System.out.println("Exercicio 1.14 --------------------------------------------------------------");
		Circulo c1 = new Circulo(32);
		Circulo c2 = new Circulo(44);
		Circulo c3 = new Circulo(17);

		imprimeCirculo(c1);
		imprimeCirculo(c2);
		imprimeCirculo(c3);
	}

	private static void executaExercicio10() {
		// Exercicio 1.10
		// Exercicio 1.17
		System.out.println("Exercicio 1.10/1.17 --------------------------------------------------------------");
		System.out.println("Insira o nome, horas trabalhadas e valor da hora do funcionário a calcular:");
		Funcionario f1 = new Funcionario(sc.next(), sc.nextDouble(), sc.nextDouble());
		Funcionario f2 = new Funcionario(sc.next(), sc.nextDouble(), sc.nextDouble());
		Funcionario f3 = new Funcionario(sc.next(), sc.nextDouble(), sc.nextDouble());

		imprimeFuncionario(f1);
		imprimeFuncionario(f2);
		imprimeFuncionario(f3);
	}

	private static void executaExercicio9() {
		// Exercicio 1.9
		// Exercicio 1.16
		System.out.println("Exercicio 1.9 --------------------------------------------------------------");
		Funcionario f1 = new Funcionario("Joao", 20, 3.5);
		Funcionario f2 = new Funcionario("Mateus", 40, 5.5);
		Funcionario f3 = new Funcionario("Lucas", 40, 13.5);

		imprimeFuncionario(f1);
		imprimeFuncionario(f2);
		imprimeFuncionario(f3);
	}

	private static void executaExercicio8() {
		// Exercicio 1.8
		System.out.println("Exercicio 1.8 --------------------------------------------------------------");
		System.out.println("Insira 3 valores para os raios dos circulos que quer calcular:");
		Circulo c1 = new Circulo(sc.nextInt());
		Circulo c2 = new Circulo(sc.nextInt());
		Circulo c3 = new Circulo(sc.nextInt());

		imprimeCirculo(c1);
		imprimeCirculo(c2);
		imprimeCirculo(c3);
	}

	private static void executaExercicio7() {
		// Exercicio 1.7
		// Exercicio 1.15
		System.out.println("Exercicio 1.7/1.15 --------------------------------------------------------------");
		Circulo c1 = new Circulo(3);
		Circulo c2 = new Circulo(4);
		Circulo c3 = new Circulo(7);

		imprimeCirculo(c1);
		imprimeCirculo(c2);
		imprimeCirculo(c3);

	}

	private static void imprimeFuncionario(Funcionario funcionario) {
		System.out.println("Funcionário: " + funcionario.getNome());
		System.out.printf("Salario: %.2f\n\n", funcionario.calculaSalario());
	}

	private static void imprimeCirculo(Circulo circulo) {
		System.out.printf("Área do Círculo: %.2f", circulo.calculaAreaCirculo());
		System.out.printf("\nPerímetro do Círculo: %.2f\n\n", circulo.calculaPerimetroCirculo());
	}

	private static void imprimeQuadrado(Quadrado quadrado) {
		System.out.printf("Área do Quadrado: %.2f", quadrado.area());
		System.out.printf("\nPerímetro do Quadrado: %.2f\n\n", quadrado.perimetro());
	}
}
