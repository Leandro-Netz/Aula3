import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		// Ler o nome do aluno e duas notas de 15 alunos, calcular a média e exibir o nome, as duas notas e a média.
		
		Scanner ler = new Scanner(System.in);

		double  aluno,nota1,nota2,media;
		String NomeDoAluno;
		
			for(aluno=1;aluno<=3;aluno=aluno+1) {
				
				System.out.println("Digite nome do aluno  ");
				NomeDoAluno = ler.next();
				System.out.println("Digite a primeira nota  ");
				nota1 = ler.nextDouble();
				System.out.println("Digite a segunda nota  ");
				nota2 = ler.nextDouble();
				media = (nota1+nota2)/2;
					
					
					
					System.out.print("  Aluno  " + NomeDoAluno + "  Nota1 =   " +  nota1 + "  Nota2 =   " + nota2 + "  Média  =    " + media);
				}
				
				
			}

	}

