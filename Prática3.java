

public class Pr�tica3 {

	public static void main(String[] args) {
		
        // Calcular a m�dia aritm�tica dos n�meros inteiros entre 10 (inclusive) e 100 (inclusive).
		
		int i,res,media,count;
		
		res=0;
		i=0;
		media=0;
		count=0;
		
		

				for(i=10;i<=100;i=i+1) {
					
					res =(res + i);
					count++;
					
				}
				
				media=(res/count);
				System.out.println(media);
				}

}
