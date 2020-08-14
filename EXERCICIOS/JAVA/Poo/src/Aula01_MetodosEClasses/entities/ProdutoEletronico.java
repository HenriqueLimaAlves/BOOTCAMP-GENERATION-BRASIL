package entities;

import java.util.Scanner;

public class ProdutoEletronico {
	private String name;
	private String status;
	private String dono;
	public int senha;

	Scanner ler = new Scanner(System.in);

	public ProdutoEletronico(String name, String status, String dono) {
		this.name = name;
		this.status = status;
		this.dono = dono;
	}

	public String mudarDono() {
		String mudarDono = dono;
		return mudarDono;
	}

	public void desbloquear() {
		int desbloquear = 633;

		if (status == "bloqueado") {
			do {

				System.out.print("Digite sua senha para prosseguir: ");
				senha = ler.nextInt();

				if (senha == desbloquear) {
					System.out.println("Acesso liberado.");
				} else {
					System.out.println("Senha incorreta!");
				}

			} while (senha != desbloquear);
		}
	}

	public void menu() {
		int op;
		do {
			System.out.printf("Menu: %n1--calculadora%n2--Fazer uma ligação%n3--Whatsapp%n4--Bloquear a tela");
			op = ler.nextInt();

			switch (op) {
			case 1: {
				int n1, n2, op2;
				System.out.println("Digite o primeiro numero: ");
				n1 = ler.nextInt();
				System.out.println("Digite o segundo numero: ");
				n2 = ler.nextInt();
				System.out.printf("%nDigite uma operação:%n1--Soma%n2--Subtração%n3--Multiplicação%n4--Divisão ");
				op2 = ler.nextInt();
				do {
					switch (op2) {
					case 1:
						int result = n1 + n2;
						System.out.println("resultado = " + result);
						break;
					case 2:
						int result2 = n1 - n2;
						System.out.println("resultado = " + result2);
						break;
					case 3:
						int result3 = n1 * n2;
						System.out.println("resultado = " + result3);
						break;
					case 4:
						int result4 = n1 / n2;
						System.out.println("resultado = " + result4);
						break;
					default:
						System.out.println("Entrada invalida!");
					}
				} while (op2 < 4);
			}
			case 2:{
				int ler1;
				System.out.println("Digite o numero: ");
				ler1 = ler.nextInt();
				System.out.println("No momento estamos sem serviço, tente novamente mais tarde.");
				break;
			}
			case 3:
				System.out.println("WhatsApp Parou de funcionar..");
				break;
			
			default:
				if(op>4 && op<0) {
				System.out.println("Opção invalida!!");
				}
			}
		} while (op > 0 && op != 4);

	}
}
