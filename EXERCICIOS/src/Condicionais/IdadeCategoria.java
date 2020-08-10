package Condicionais;
import java.util.Scanner;
public class IdadeCategoria {
	public static void main(String args[])
	{
		int n1;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		n1=ler.nextInt();
		
		if(n1>=10 && n1<=14)
		{
			System.out.println("Você se encontra na categoria INFANTIL!");
		}
		else if(n1>=15 && n1<=17)
		{
			System.out.println("Você se encontra na categoria JUVENIL!");
		}
		else if(n1>=18 && n1<=25)
		{
			System.out.println("Você se encontra na categoria ADULTO!");
		}
		else
		{
			System.out.println("Você não se qualifica em nenhuma das categorias!");
		}
	}
}
