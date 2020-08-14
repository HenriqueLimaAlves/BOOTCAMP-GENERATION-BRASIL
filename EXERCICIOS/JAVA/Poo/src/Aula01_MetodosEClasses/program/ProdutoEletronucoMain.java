package program;

import java.util.Scanner;

import entities.ProdutoEletronico;

public class ProdutoEletronucoMain {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ProdutoEletronico cel = new ProdutoEletronico("Android 1.4", "bloqueado", "Henrique");
		
		cel.desbloquear();
		cel.menu();
	}

}
