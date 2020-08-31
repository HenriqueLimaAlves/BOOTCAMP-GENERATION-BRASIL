/*4. Implemente a classe Administrador como subclasse da classe pessoa.
  Um determinado administrador tem como atributos da classe Pessoa 
  e também os atributos próprios como ajudaDeCusto (ajudas referentes 
   a viagens, estadias).*/
package entities;

public class Administrador extends Pessoa {
	protected double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, double ajudaDeCusto)
	{
		super(nome, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
