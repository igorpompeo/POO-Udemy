package exercicios_fixacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// formata��o de impress�o de casas decimais
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		// configurar separador para US
		Locale.setDefault(Locale.US);
		
		// impress�o na tela (quebra da maldi��o)
		System.out.println("Ol� Mundo!");
		
		// Concatena��o
		System.out.println("Resultado = " + x + " metros");
		
		// Concatena��o com PRINTF
		System.out.printf("Resultado = %.2f metros%n", + x);
		
		// varias vari�veis juntas no PRINTF + modo de formata��o (%f - flutuante; %d - inteiro; %s - string; %n - pular linha)
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
