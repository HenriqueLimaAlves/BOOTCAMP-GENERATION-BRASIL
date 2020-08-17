package entities;

public class Operario extends Pessoa {
	protected double valorProducao;
	protected double comissao;
	
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao)
	{
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double comissao()
	{
		return (comissao/100)*valorProducao;
	}
	public String toString()
	{
		return "Nome do Operario: "+ nome+ "\n"+ "Endereço: "+ endereco+ 
				"\n"+"Telefone: "+ telefone+ "\n"+ "Produção: "+ valorProducao+"\n"+ "Comissão: "+ comissao();
	}
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
