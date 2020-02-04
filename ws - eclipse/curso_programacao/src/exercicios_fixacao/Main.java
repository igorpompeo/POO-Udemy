package exercicios_fixacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// formatação de impressão de casas decimais
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		// configurar separador para US
		Locale.setDefault(Locale.US);
		
		// impressão na tela (quebra da maldição)
		System.out.println("Olá Mundo!");
		
		// Concatenação
		System.out.println("Resultado = " + x + " metros");
		
		// Concatenação com PRINTF
		System.out.printf("Resultado = %.2f metros%n", + x);
		
		// varias variáveis juntas no PRINTF + modo de formatação (%f - flutuante; %d - inteiro; %s - string; %n - pular linha)
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
