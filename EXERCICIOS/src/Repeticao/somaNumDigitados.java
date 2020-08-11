/*5-	Crie um programa que leia um número do teclado 
 até que encontre um número igual a zero. No final, 
 mostre a soma dos números digitados.(DO...WHILE)*/
package Repeticao;

import java.util.Scanner;

public class somaNumDigitados {
	public static void main(String args[]) {
		
		int num, sum=0;
		
		Scanner ler = new Scanner (System.in);
		
		do
		{
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
			sum+=num;
		}while(num!=0);
		
		System.out.println("A soma dos numeros digitados é: "+ sum);
	}
	
}
