package Variaveis;
import java.util.Scanner;
public class anosParaDias {
	public static void main(String args[]){
		int ano, mes, dia, mesT, diasT, anosT;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento: ");
		ano = ler.nextInt();
		
		System.out.println("Digite seu mes de nascimento: ");
		mes = ler.nextInt();
		
		System.out.println("Digite seu dia de nascimento: ");
		dia = ler.nextInt();
		
		anosT=2020-ano;
		mesT = 128*anosT;
		diasT= (anosT*365)+(8-mes)*30;
		
		System.out.printf("%nSua idade é de %d anos, que é equivalente a %d Dias.",anosT, diasT);
	}
}
