package exemplos;

import java.util.Random;

public class Exemplo2 {

	public static void main(String[] args) {
		int a=0, b=0, c=0;
		Random r = new Random();
		
		
		for(int i=0; i<100; i++){
			try{
				b = r.nextInt(5);
				c = r.nextInt(5);
				System.out.printf("b: %d | c: %d \n",b,c);
				a = 12345 / (b/c);
				System.out.println("a: " + a);
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
				System.out.println("Divisão por zero.");
			}
		}
		

	}

}