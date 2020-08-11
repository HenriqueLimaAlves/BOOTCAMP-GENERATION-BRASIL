package Variaveis;
import java.util.Scanner;
public class equacaoLinear {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		double x, a, b, c, d, e, f, y;
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		c = ler.nextDouble();
		
		System.out.println("Digite o valor de d: ");
		d = ler.nextDouble();
		
		System.out.println("Digite o valor de e: ");
		e = ler.nextDouble();
		
		System.out.println("Digite o valor de f: ");
		f = ler.nextDouble();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.printf("O coeficiente de x é %.2f %nO coeficiente de y é %.2f", x, y);
				
	}
}
