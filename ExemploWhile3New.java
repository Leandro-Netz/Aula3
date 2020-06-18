import java.util.Scanner;

public class ExemploWhile3New {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);

				double mediageral = 0;
				int cont=0;		
				double mAlunos=0;
				while(mediageral<=40) {
														
					System.out.println("Digite a primeira nota  ");
					double n1 = ler.nextDouble();
					
					System.out.println("Digite a segunda nota  ");
					double n2 = ler.nextDouble();
						
					double media = (n1+n2)/2;
					mediageral = mediageral+media;
					cont++;
					mAlunos = mediageral/cont;
				}
				
				System.out.printf(" A média das notas dos %d alunos é de: %.2f%n",cont,mAlunos);
					
	}			
	

}
