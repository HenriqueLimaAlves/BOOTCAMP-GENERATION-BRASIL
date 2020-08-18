package entities;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade)
	{
		super(nome, idade);
	}

	public String emitirSom(String som) {
		return"Latir";
		
	}

	public String movimentacao(String mov) {

		return "Correr";
	}
}
