package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

//Somente para exemplo, usando static para não precisar criar objeto
public class Exemplo3 {
	private static int numerador, denominador, resultado;
	
	public static int calculaQuociente(int num, int den) throws ArithmeticException{
		resultado = num / den;
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continuar = true;
		
		do{
			try{
			System.out.println("Numerador: ");
			numerador = input.nextInt();
			System.out.println("Denominador: ");
			denominador = input.nextInt();
			
			resultado = calculaQuociente(numerador, denominador);
		}catch(InputMismatchException e){
			System.err.println("Não é permitido inserir letras...");
		}catch(ArithmeticException e){
			System.out.println("Divisão por zero...");
		}finally{
			System.out.println("Bloco Finally");
		}
			System.out.println("Continuar?");
			input.nextBoolean();
	}while(continuar = true);
		
	}
}
