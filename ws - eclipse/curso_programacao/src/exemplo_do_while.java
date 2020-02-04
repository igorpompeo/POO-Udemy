import java.util.Locale;
import java.util.Scanner;

public class exemplo_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);
			System.out.println("Deseja repetir? (S/N) ");
			resp = sc.next().charAt(0);
		} while(resp != 'n');
		
		sc.close();
	}

}
