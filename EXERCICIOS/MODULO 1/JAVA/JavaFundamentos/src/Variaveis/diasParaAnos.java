package Variaveis;
import java.util.Scanner;
public class diasParaAnos {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int dias, mes, dia, idade;
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		idade = dias/365;
		mes = (dias%365)/30; 
		dia = (dias%365)%30;
		
		System.out.printf("sua idade é de %d anos, %d meses e %d dias", idade, mes, dia);
		
	}
}
