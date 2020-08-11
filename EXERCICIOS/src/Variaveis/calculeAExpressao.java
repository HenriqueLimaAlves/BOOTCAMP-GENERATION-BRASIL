package Variaveis;
import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;
public class calculeAExpressao {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		double A, B, C, R, S, D;
		
		System.out.println("Digite o valor de A: ");
		A = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		C = ler.nextInt();
		
		R = Math.pow((A+B), 2.0);
		S = Math.pow((C+B), 2.0);
		D = R+S/2;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("O resultado de D=R+S/2 é: %.2f", D);
	}
}
