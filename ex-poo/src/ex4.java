import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 double media ;
		 int n1 = sc.nextInt();
		 int n2 = sc.nextInt();
		 int n3 = sc.nextInt();
		 int n4 = sc.nextInt();
		
		 
		 media = (n1+n2+n3+n4)/4;
		 
		 System.out.println("a média é = "+media);
		 if(media >= 6) {
			 
			 System.out.println("aprovado");
		 }
		 else {
			 System.out.println("reprovado");
		 }

	}

}
