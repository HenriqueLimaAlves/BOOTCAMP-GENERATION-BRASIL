package Variaveis;
import java.util.Locale;
public class Main{
	public static void main(String args[]) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%d, which price is $ %f\n", product1, price1);
		System.out.printf("%d, which price is $ %f\n\n", product2, price2);
		System.out.printf("%d years old, code %d and gender: %s\n\n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f\nRouded (three decimal places): %.3f\n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}
}