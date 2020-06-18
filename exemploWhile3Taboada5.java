import java.util.Scanner;

public class exemploWhile3Taboada5 {

	public static void main(String[] args) {
		// Taboada do 5
		
		//**************************************************************************
/*int x=1;
		
		while(x<=10) {
		
		System.out.println("x = " + x*5);
		
		x++; */
		
		//**************************************************************************
		//meu
		
		/*int tabuada=1,numero=5,res;
		
		while (tabuada<=10) {
			res = tabuada * numero;
			System.out.printf("Tabuada do %d: %d * %d = %d\n", numero,tabuada,numero,res);
			tabuada++;
		}*/
		
		//**************************************************************************
		
		
		/*Int n,x,res;
		
		x=1;
		n=5;
		
		System.out.println("========== TABUADA ===========");
		
		while(x<=10) {
			System.out.println("X = " + res);
			
			x++;
		}
		*/
		
		//**************************************************************************
		
		int valor=1;
		int resMulti;
		int multiplicador;
		
		
		Scanner ler = new Scanner(System.in);
		
				
		System.out.println("Digite a tabuada desejada:  ");
		multiplicador = ler.nextInt();
				
		while(valor<=10) {
		resMulti = valor * multiplicador;
		
		//cada "%d" dessa linha segue a sequencia dos dois argumentos.
		
		System.out.printf("Tabuada do %d: %d * %d = %d\n ",multiplicador,valor,multiplicador,resMulti);
		
		valor++;
		
		}
		
		/*
		
		{
			
		res = (tab*numero);
		
		System.out.println(tab +" * " +numero +" = " +res);
		
		numero++; }
		
		*/
		
		}
	
	

}