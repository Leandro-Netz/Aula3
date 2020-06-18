
public class Prática1 {

	public static void main(String[] args) {
		// Gerar sucessão 0 1 2 -3 4 5 -6 7 8 -9

		int i,num,res;
		i=0;
		res=0;
		
		System.out.println(i);
		
		//for (inicialização;condição;incremento)
		for(i=1;i<=9;i=i+1) {
			
			res=i%3;
			num=i;
			
			if (res == 0) {
				num=(num-(num*2));
				System.out.println(num);
			}
			else {
				System.out.println(num);
			}
		}
		
		
		
	}

}
