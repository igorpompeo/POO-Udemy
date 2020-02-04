import java.util.Scanner;

public class exemplo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um valor qualquer. \n<Obs> Zero sai do sistema.");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		while (x != 0) {
			System.out.println("Digite outro valor, até sair. \nPara sair digite 0.");
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("A soma de tudo é: " + soma);
				
		sc.close();
	}

}
