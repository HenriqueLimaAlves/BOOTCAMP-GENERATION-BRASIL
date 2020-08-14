//2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
		System.out.printf("%d numeros são pares e %d numeros são impar", par, impar);
	}

}
