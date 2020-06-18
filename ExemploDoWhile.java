import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// Exemplo utilizando a estrutura de repetição DoWhile 

		int numero,soma;
		
		soma=0;
		
		Scanner ler =new Scanner (System.in);
		
		do {
			System.out.println("Digite um valor:  ");
			numero= ler.nextInt();
			
			soma= soma+numero;
			System.out.println("Total:"    + soma);
			
		} while(soma<10);
		
		
	}

}
