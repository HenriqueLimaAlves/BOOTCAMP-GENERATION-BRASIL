/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
 O programa deve executar os seguintes passos: 

(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores 
das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

package Arrays;

public class VetorInt {
	public static void main (String []args)
	{
		int []a = {1, 0, 5, -2, -5, 7}; 
		int sum, x;
		
		a[4] = 100;
		sum = a[0] + a[1] + a[5];
		System.out.println("O valor da soma da posi��o 0, 1 e 5 do vetor �: "+ sum);
		System.out.println("O valor da correspondente a cada posi��o do vetor atual � de: ");
		for (x=0;x<6;x++)
		{
			System.out.println("Posi��o:"+ x+ " [ "+ a[x]+ " ]");
		}
	}
}
