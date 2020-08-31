package entities;

public class Cliente {
	private String nome;
	private int cadastro;
	private String cpf;
	//controlador
	public Cliente (String nome, int cadastro, String cpf)
	{
		this.nome = nome;
		this.cadastro = cadastro;
		this.cpf = cpf;
	}
	
	public void printCliente() 
	{
		System.out.printf("%nCliente: %s%nCadastro: %d%nCpf: %s%n", nome, cadastro, cpf);
	}
	
	public String getName()
	{
		return nome;
	}
	
	public int getCadastro()
	{
		return cadastro;
	}
	
	public String getCpf()
	{
		return cpf;
	}
	
}
