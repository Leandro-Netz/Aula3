import java.util.Scanner;

public class ExemploFor3 {

	public static void main(String[] args) {
		// Tabuada de 10 utilizando a estrutura de repetição for

int i,mult;

		
Scanner ler = new Scanner(System.in);


System.out.println("Digite a tabuada desejada:  ");
mult = ler.nextInt();


		for(i=1;i<=10;i++) {
			
			System.out.println(mult + "x" + i+  "="  + mult * i);}
		
	}
		
		/*
		 * Scanner ler = new Scanner(System.in);
		
				
		System.out.println("Digite a tabuada desejada:  ");
		multiplicador = ler.nextInt();
				
		while(valor<=10) {
		resMulti = valor * multiplicador;
		
		//cada "%d" dessa linha segue a sequencia dos dois argumentos.
		
		System.out.printf("Tabuada do %d: %d * %d = %d\n ",multiplicador,valor,multiplicador,resMulti);
		
		valor++;
		
		}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * *********************************************************
		 * int i,mult;

mult = 10;
		
		for(i=1;i<=10;i++) {
			
			System.out.println(mult + "x" + i+  "="  + mult * i); */
		
	}

