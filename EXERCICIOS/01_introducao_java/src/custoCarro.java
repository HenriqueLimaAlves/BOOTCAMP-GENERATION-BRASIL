import java.util.Scanner;
public class custoCarro {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		double  custoF, custoC;
		
		System.out.println("Digite o custo de fabrica: ");
		custoF = ler.nextDouble();
		
		custoC = custoF*0.75+custoF;
		
		System.out.printf("%nO Custo para o consumidor final é de: %.2f ", custoC);
	}
}
