package entities;

public class Aviao {
	private String modelo;
	private String destino;
	private int velocidade;
	private int capacidade;
	
	public Aviao (String modelo, String destino, int velocidade, int capacidade)
	{
		this.modelo = modelo;
		this.destino = destino;
		this.velocidade = velocidade;
		this.capacidade = capacidade;
	}
	
	public int capacidadeTotal()
	{
		int total = 200;
		return Math.abs((capacidade/total)*100);
	}
	
	public void comunicado()
	{
		System.out.println("O avião "+ modelo + " com destino para "+ destino + " tem em média uma velocidade de "+ velocidade + " km/h");
	}
	
}
