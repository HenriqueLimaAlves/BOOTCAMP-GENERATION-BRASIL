package Variaveis;
import java.util.Scanner;
public class mediaPonderada {
	public static void main(String args[]) {
		
		double a, b, c, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		a = ler.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		b = ler.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		c = ler.nextInt();
		
		media = (a*2 + b*3 + c*5)/10;
		
		System.out.printf("%nA media ponderada é de %.2f", media);
	}
}
