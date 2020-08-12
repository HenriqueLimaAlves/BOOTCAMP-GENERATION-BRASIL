/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

package Arrays;

import java.util.Scanner;

public class NumInt {
	public static void main(String[]args)
	{
		Scanner ler = new Scanner (System.in);
		
		int []vec = new int [6];
		int []impar = new int [6];
		int []Vpar = new int [6];
		int x, num, sum, par=0, contimpar=0;
		
		for (x=0;x<6;x++)
		{
			System.out.printf("%nDigite o valor da posição %d%n", x+1);
			vec[x] = ler.nextInt();
			if(vec[x]%2==0)
			{
				Vpar[x]+=vec[x];
				par+=vec[x];				
			}
			else
			{
				impar[x] += vec[x]; 
				contimpar++;
			}
		}
		
		System.out.println("Os numeros pares digitados: ");
		for(x=0;x<6;x++)
		{
			if(vec[x]%2==0) {
				System.out.printf("Posição: %1d [ %d ]%n", x+1, Vpar[x]);
			}	
		}
		
		System.out.println("A Soma dos numeros pares digitados: "+ par);
		System.out.println();
		System.out.println("Os numeros Impares digitados: ");
		for(x=0;x<6;x++)
		{
			if (impar[x]%2!=0){
			System.out.printf("Posição: %1d [ %d ]%n", x+1, impar[x]);
			}
		}
		
		System.out.println("A quantidade de numeros impares digitados: "+ contimpar);
	}
}
