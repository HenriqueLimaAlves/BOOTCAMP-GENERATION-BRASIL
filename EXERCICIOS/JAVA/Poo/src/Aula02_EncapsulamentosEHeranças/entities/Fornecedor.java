/*2 - Considere, como subclasse da classe Pessoa (desenvolvida no exercício
 anterior) a classe Fornecedor. Considere que cada instância da classe 
 Fornecedor tem, para além dos atributos que caracterizam a classe 
 Pessoa, os atributos valorCredito (correspondente ao crédito máximo 
 atribuído ao fornecedor) e valorDivida (montante da dívida para com 
 o fornecedor). Implemente na classe Fornecedor, para além dos usuais 
 métodos seletores e modificadores, um método obterSaldo() que devolve 
 os valores dos atributos valorCredito e valorDivida. Depois de 
 implementada a classe Fornecedor, crie um programa de teste adequado
  que lhe permita verificar o funcionamento dos métodos implementados 
 na classe Fornecedor e os herdados da classe Pessoa.*/
package entities;

public class Fornecedor extends Pessoa{
	protected double valorCredito;
	protected double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida)
	{
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public Fornecedor() {
	}
	
	public double obterSaldo()
	{
		return Math.abs((valorCredito - valorDivida));
	}
	
	public String toString()
	{
		return "Fornecedor: "+ nome+ "\n"+ "Endereço: "+ endereco+ "\n"+
				"Saldo: "+ obterSaldo();
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
}
