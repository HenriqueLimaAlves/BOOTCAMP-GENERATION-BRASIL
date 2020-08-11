/*6-Escrever um programa que receba vários números inteiros 
no teclado. E no final imprimir a média dos números múltiplos de 3. 
Para sair digitar 0(zero).(DO...WHILE)*/
package Repeticao;

import java.util.Scanner;

public class somaInteiros {
	public static void main (String args[])
	{
		int num, mult=0, media, cont=0;
		
		Scanner ler = new Scanner (System.in);
		
		do
		{
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
			if(num%3==0 && num!=0) 
			{
				mult+=num;
				cont++;
			}
		}while(num!=0);
		
		media=mult/cont;
		
		System.out.printf("%nA media da soma dos numeros multiplos de 3 é: %d", media);
	}
}
