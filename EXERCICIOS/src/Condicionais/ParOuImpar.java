package Condicionais;
import java.util.Scanner;
import java.lang.Math;

public class ParOuImpar {
	public static void main(String args[])
	{
		double n1, raiz, pow;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n1=ler.nextInt();
		
		if (n1%2==0)
		{
			raiz=Math.sqrt(n1);
			System.out.printf("%nO numero %.2f � Par e sua raiz quadrada � %.2f", n1, raiz);
		}
		else
		{
			pow=Math.pow(n1, 2.0);
			System.out.printf("%nO numero %.2f � Impar e o resultado elevado ao quadrado �: %.2f", n1, pow);
		}
	}

}
