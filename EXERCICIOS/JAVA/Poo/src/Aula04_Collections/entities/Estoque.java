package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public Estoque() {
		
	}
	
	Scanner ler = new Scanner(System.in);
	ArrayList<String>estoqueList = new ArrayList<String>();
	
	public void add()
	{
		char op;
		do {
			System.out.println("Adicionar item ao estoque? (Y/N)");
			op = ler.next().charAt(0);
			if(op=='y' || op=='Y' || op=='s' || op=='S')
			{
				System.out.println("Qual item irá adicionar ao estoque?");
				estoqueList.add(ler.next());
			}
		}while(op=='y' || op=='Y' || op=='s' || op=='S');
	}

	public void remove()
	{
		char op;
		do {
			System.out.println("Remover item ao estoque? (Y/N)");
			op = ler.next().charAt(0);
			if(op=='y' || op=='Y' || op=='s' || op=='S')
			{
				System.out.println("Qual item irá remover do estoque?");
				estoqueList.remove(ler.next());
			}
		}while(op=='y' || op=='Y' || op=='s' || op=='S');
	}
	
	public String toString()
	{
		return "Estoque: "+ "\n"+ estoqueList.toString();
	}
}
