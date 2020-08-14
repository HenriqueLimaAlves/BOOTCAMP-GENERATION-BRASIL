//3- Leia uma matriz 3 x 3, conte e escreva quantos valores 
//maiores que 10 ela possui.
package Arrays;

import java.util.Scanner;

public class MatrizMaiorQue3 {
	public static void main(String[]args)
	{
		Scanner ler = new Scanner(System.in);
		
		int [][]mat = new int [3][3];
		int i, j; 
		
		for (i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				System.out.printf("Digite um numero: M[%d][%d]%n", i+1, j+1);
				mat[i][j] = ler.nextInt();
			}
		}
		
		System.out.println("Os valores maiores que 10 são: ");
		System.out.println();
		for (i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				if(mat[i][j]>10)
				{
					System.out.println(mat[i][j]);
				}
			}
		}
		
	}
}
