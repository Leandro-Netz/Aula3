import java.util.Scanner;
public class exemploWile2 {

	
	
	public static void main(String[] args) {
		
		// Exemplo de Estrutura de repeti��o

		int  idade=15;
		
		
		Scanner ler = new Scanner(System.in);
		
					
	   System.out.print("Digite sua idade: ");		
		
	   idade=ler.nextInt();
	   
	   System.out.println(idade);
		
		while(idade<18) {
			
			System.out.println(idade);
			//idade++; // idade=idade+1;   // incremento idade++
		}
		
	}
}


	
