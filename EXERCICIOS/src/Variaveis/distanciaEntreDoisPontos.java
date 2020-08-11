package Variaveis;
import java.util.Scanner;
import java.lang.Math;
public class distanciaEntreDoisPontos {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		double x1, x2, y1, y2, d; 
		
		System.out.println("Digite o valor de X1: ");
		x1 = ler.nextDouble();
		
		System.out.println("Digite o valor de X2: ");
		x2 = ler.nextDouble();
		
		System.out.println("Digite o valor de Y1: ");
		y1 = ler.nextDouble();
		
		System.out.println("Digite o valor de Y2: ");
		y2 = ler.nextDouble();
		
		d = Math.sqrt(((Math.pow((x2-x1), 2))) + ((Math.pow((y2-y1), 2))));
		
		System.out.printf("%nO resultado é de %.2f", d);
		
	}
}
