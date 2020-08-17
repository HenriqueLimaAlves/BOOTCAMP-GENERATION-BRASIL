package program;

import entities.Operario;
import entities.Pessoa;

public class OperarioMain {

	public static void main(String[] args) {
		Pessoa op = new Operario("Nelson", "Rio de janeiro", "(11)4002-8922", 1000, 5);
		System.out.println(op.toString());
	}

}
