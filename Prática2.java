import java.util.Scanner;

public class Pr�tica2 {

	public static void main(String[] args) {
		//Solicitar a idade de v�rias pessoas e imprimir: O programa termina quando idade for = -99
		
		Scanner ler = new Scanner(System.in);

 int  idade=0;
 	
       while(idade != -99) {
 	   System.out.print("Digite sua idade: ");		
	   idade=ler.nextInt();
	   	   
		}
       System.out.print("Programa finalizado");	
       

	}
}
