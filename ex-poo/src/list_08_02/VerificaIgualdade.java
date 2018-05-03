package aula8fev;

import java.util.Scanner;

public class VerificaIgualdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String primeiraPalavra = sc.next(), segundaPalavra = sc.next();
			
			if (primeiraPalavra.equals(segundaPalavra)) {
				System.out.println("igual");
			} else {
				System.out.println("diferente");
			}
			
		}
		
		
	}

}
