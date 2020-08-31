package entities;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade)
	{
		super(nome, idade);

	}

	public String emitirSom(String som) {
		return "Grunhido";
		
	}

	public String movimentacao(String mov) {
		return "Subir em arvore";
	}
}
