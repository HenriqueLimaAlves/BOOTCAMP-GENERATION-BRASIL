package program;

import entities.Estoque;

public class EstoqueMain {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		
		estoque.add();
		estoque.remove();
		System.out.println(estoque.toString());	
	}
}
