package program;

import entities.Aviao;

public class aviaoMain {
	public static void main(String[]args) {
		
		Aviao aviao = new Aviao ("B-32", "S�o Paulo", 700, 200);
	
		aviao.comunicado();
		System.out.println("Est� em "+ aviao.capacidadeTotal() + "% de sua capacidade total.");
	}
}
