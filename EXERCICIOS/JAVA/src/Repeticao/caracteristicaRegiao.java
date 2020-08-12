/*4-	Uma empresa desenvolveu uma pesquisa para saber 
as características psicológicas dos indivíduos de uma região.
Para tanto, a cada uma das pessoas era perguntado: 
idade, sexo (1-feminino / 2-masculino / 3-Outros), 
e as opções (1, se a pessoa era calma; 2, 
se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados 
de 150 pessoas, calcule e mostre: (WHILE)*/
package Repeticao;

import java.util.Scanner;

public class caracteristicaRegiao {
	public static void main(String args[])
	{
		int idade, sexo, op, x=0, feminino=0, masculino=0, n40=0, c18=0;
		int outros=0, calmo=0, Mnervoso=0, Hagressivo=0, calmoO=0;
		
		Scanner ler = new Scanner (System.in);
		
		while(x<150)
		{
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.printf("%nSexo: %n1--Feminino%n2--Masculino%n3--Outros%n");
			sexo = ler.nextInt();
			
			System.out.printf("%nVocê é: %n1--Calmo(a)%n2--Nervoso(a)%n3--Agressivo(a)%n");
			op = ler.nextInt();
			
			if(op==1)
			{
				calmo++;
				if(op==1 && sexo==3)
				{
					calmoO++;
				}
			}
			else if(op==2 && sexo==1)
			{
				Mnervoso++;
			}
			else if(op==3 && sexo==2)
			{
				Hagressivo++;
			}
			
			if((idade>40 && op == 2 ) || (idade<18 && op ==1))
			{
				if(idade>40)
				{
					n40++;
				}
				else
				{
					c18++;
				}
			}
			x++;
		}
		
		System.out.println("%nO numero de pessoas calmas é de: "+ calmo);
		System.out.println("%nO numero de mulheres nervosas é de: "+ Mnervoso);
		System.out.println("%nO numero de homens agressivos é de: "+ Hagressivo);
		System.out.println("%nO numero de outros calmos é de: "+ calmoO);
		System.out.println("%nO numero de pessoas nervosas com mais de 40 anos é de: "+ n40);
		System.out.println("%nO numero de pessoas calmas com menos de 18 anos é de: "+ c18);
	}
}
