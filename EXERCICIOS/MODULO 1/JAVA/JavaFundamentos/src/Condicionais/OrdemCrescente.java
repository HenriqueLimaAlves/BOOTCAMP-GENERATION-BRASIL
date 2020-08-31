package Condicionais;
import java.util.Scanner;
public class OrdemCrescente {
	public static void main(String args[])
	{
		int n1, n2, n3;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = ler.nextInt();
		
		if (n1<=n2 && n1<=n3 && n2<=n3)
		{
			System.out.printf("Em ordem crescente fica: %n %d %n %d %n %d ", n1, n2, n3);
		}
		else if(n1<=n2 && n1<=n3 && n2>=n3)
		{
			System.out.printf("Em ordem crescente fica: %n %d %n %d %n %d ", n1, n3, n2);
		}
		else if(n2<=n1 && n2<=n3 && n3<=n1)
		{
			System.out.printf("Em ordem crescente fica: %n %d %n %d %n %d ", n2, n3, n1);
		}
		else if(n2<=n1 && n2<=n3 && n3>=n1)
		{
			System.out.printf("Em ordem crescente fica: %n %d %n %d %n %d ", n2, n1, n3);
		}
		else if(n3<=n1 && n3<=n2 && n1<=n2)
		{
			System.out.printf("Em ordem crescente fica: %n %d %n %d %n %d ", n3, n1, n2);
		}
		else
		{
			System.out.printf("Em ordem crescente fica: %n %d %n %d %n %d ", n3, n2, n1);
		}

		
	}
}

