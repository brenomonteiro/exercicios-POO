package aula8fev;

import java.util.Scanner;

public class TransformaMaiusculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String fraseNormal = sc.nextLine(), fraseMaiuscula = fraseNormal.toUpperCase();

			System.out.println(fraseMaiuscula);
		}

	}

}
