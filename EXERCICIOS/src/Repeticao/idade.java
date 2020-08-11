/*3-	Solicitar a idade de várias pessoas e imprimir: 
	Total de pessoas com menos de 21 anos. Total de pessoas 
	com mais de 50 anos. O programa termina quando idade 
	for =-99. (WHILE)*/
package Repeticao;

import java.util.Scanner;

public class idade {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int p, x=0, menos21=0, mais50=0;
		
		System.out.println("Digite sua idade: ");
		p = ler.nextInt();
		
		while(p>-99)
		{
			
			if(p<=21)
			{
				menos21++;
			}
			else if(p>=50)
			{
				mais50++;
			}
			System.out.println("Digite sua idade: ");
			p = ler.nextInt();
		}
		System.out.printf("%d pessoas são menores de 21 anos e %d pessoas são maiores de 50", menos21, mais50);
	}
}
