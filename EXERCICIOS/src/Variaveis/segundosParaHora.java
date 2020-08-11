package Variaveis;
import java.util.Scanner;
public class segundosParaHora {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int seg, h, min, segT; 
		
		System.out.println("Digite o tempo em segundos: ");
		segT = ler.nextInt();
		
		h = segT/3600;
		min = (segT%3600)/60;
		seg = min%60;
		
		System.out.printf("%nSão %d horas, %d minutos e %d segundos.", h, min, seg);
 	}
}
