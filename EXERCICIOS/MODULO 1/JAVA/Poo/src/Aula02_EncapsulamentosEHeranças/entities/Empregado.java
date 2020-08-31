/*3 - Considere, como subclasse da classe Pessoa, a classe Empregado. 
Considere que cada inst�ncia da classe Empregado tem, para al�m dos 
atributos que caracterizam a classe Pessoa, os atributos codigoSetor 
(inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos)
. Implemente a classe Empregado com m�todos seletores e modificadores 
e um m�todo calcularSalario. Escreva um programa de teste adequado 
para a classe Empregado. */
package entities;

public class Empregado extends Pessoa{
	protected int codigoSetor;
	protected double salarioBase;
	protected double imposto;
	//construtor
	public Empregado(String nome, String endereco, String telefone, 
			int codigoSetor, double salarioBase, double imposto)
	{
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	//construtor sobrecarregado 
	public Empregado() {
	}
	//calculo da diferen�a dos impostos pelo salario base 
	public double calcularSalario()
	{
		return salarioBase - ((imposto/100)*salarioBase);
	}
	//formata��o da mensagem ao usuario 
	public String toString()
	{
		return "Nome do empregado: "+ nome+ "\n"+ "Endere�o: "+ endereco+
				"\n"+"Telefone: "+ telefone+ "\n"+ "Codigo do setor: "+ codigoSetor+
				"\n"+"Salario Bruto: " + salarioBase+"\n"+ "Salario Liquido: "+ calcularSalario();
	}
	//getters and setters 
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
}
