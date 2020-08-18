package entities;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade)
	{
		super(nome, idade);
	}
	
	public String emitirSom(String som) {
		return"Relinchar";
		
	}

	public String movimentacao(String mov) {

		return "Correr";
	}
}
