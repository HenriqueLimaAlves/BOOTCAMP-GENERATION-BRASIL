package program;

import java.util.Scanner;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class AnimalMain {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		Cachorro cachorro = new Cachorro("Cachorro", 10);
		Cavalo cavalo = new Cavalo("Cavalo", 5);
		Preguica preguica = new Preguica("Preguiça", 2);
		
		System.out.println(cachorro.toString()+ cavalo.toString()+preguica.toString());
		
		ler.close();
	}
}
