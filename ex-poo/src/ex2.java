import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int area,perimetro,b,h;
		
		
		 b = sc.nextInt();
		 h = sc.nextInt();
		 
		 area = b*h;
		 perimetro = (2*b + 2*h);
		 System.out.println("a area é "+area+" e o perimetro é "+perimetro);

	}

}
