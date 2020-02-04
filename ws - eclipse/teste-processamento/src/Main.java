import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// exemplo 1 sobre processamento de dados / casting
//		int x;
//		int y;
//		x = 5;
//		y = 2 * x;
//		System.out.println(x);
//		System.out.println(y);
		
		// exemplo 2
//		int x;
//		double y;
//		x = 5;
//		y = 2 * x;
//		System.out.println(x);
//		System.out.println(y);
		
		// exemplo 3
//		double b, B, h, area;
//		b = 6.0;
//		B = 8.0;
//		h = 5.0;
//		area = (b + B) / 2.0 * h;
//		System.out.println(area);
		
		// exemplo 4
//		int a, b;
//		double resultado;
//		a = 5;
//		b = 2;
//		resultado = (double) a / b;
//		System.out.println(resultado);
		
		// exemplo 5
//		double a;
//		int b;
//		a = 5.0;
//		b = (int) a;
//		System.out.println(b);
		
		//Leitura de dados;
		Scanner sc = new Scanner(System.in);
//		String x;
//		x = sc.next();
//		System.out.println("Você digitou: " + x);
//		sc.close();

		// leitura de números inteiros
//		int x;
//		x = sc.nextInt();
//		System.out.println("Você digitou: " + x);
//		sc.close();
		
		// leitura de números ponto flutuantes
//		double x;
//		x = sc.nextDouble();
//		System.out.println("Você digitou: " + x);
//		sc.close();
		
		// leitura tipo char
//		char x;
//		x = sc.next().charAt(0);
//		System.out.println("Você digitou: " + x);
//		sc.close();
		
		// multiplas leituras
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(x + " " + y + " " + z);
		sc.close();
	}

}
