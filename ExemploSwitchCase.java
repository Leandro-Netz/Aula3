import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Digite o mês em número inteiro (Entre 1 e 4) ");
		opcao = ler.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
				
				default:
					System.out.println("Erro, digite somente números entre 1 e 4");
					break;
						}
		
				
	}

}
