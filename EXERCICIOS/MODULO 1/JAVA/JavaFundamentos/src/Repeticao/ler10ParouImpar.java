//2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
package Repeticao;

import java.util.Scanner;

public class ler10ParouImpar {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int x,num, par=0, impar=0;
		
		for (x=0;x<10;x++)
		{
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			if(num%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf("%d numeros s�o pares e %d numeros s�o impar", par, impar);
	}

}
