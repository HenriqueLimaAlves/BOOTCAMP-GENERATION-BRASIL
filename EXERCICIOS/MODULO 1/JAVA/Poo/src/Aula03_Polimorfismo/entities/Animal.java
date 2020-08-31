package entities;

public abstract class Animal {
	private String nome;
	private int idade;
	
	public abstract String emitirSom(String som);
	public abstract String movimentacao(String mov);
	
	public Animal() {
		
	}
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String toString()
	{
		return "Animal: "+ nome+"\n"+ "Idade: "+ idade+ " anos"+"\n"+ "Emite o som: "+ 
				emitirSom(null)+ "\n"+ "Caracteristica: "+ movimentacao(null)+"\n\n";
	}
}