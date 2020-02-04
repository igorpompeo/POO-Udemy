package exercicios_fixacao;
import java.util.Scanner;

public class exercicio_fixacao_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		System.out.println("Digite sua senha: ");
		
		while(senha != 2002) {
			senha = sc.nextInt();
			
			if(senha == 2002) {
				System.out.println("Acesso Permitido");
			}else {
				System.out.println("Senha Invalida");
			}
			
		}
		
		sc.close();
	}

}
