
//Calculadora aritm�tica que opera com n�meros inteiros

public class CalculadoraSimples {

	//atributo que guarda o resultado do c�lculo no objeto
	private int valorResultado = 0;
	
	//m�todos de c�lculo
	//somar 2 n�meros
	public int somar(int varialvel1, int variavel2) {
		valorResultado = varialvel1 + variavel2;
		return valorResultado;
	}
	
	//subtrair 2 n�meros
	public int subtrair(int varialvel1, int variavel2) {
		valorResultado = varialvel1 - variavel2;
		return valorResultado;
	}
	
	//multiplicar 2 n�meros
	public int multiplicar(int varialvel1, int variavel2) {
		valorResultado = varialvel1 * variavel2;
		return valorResultado;
	}
	
	
	//dividir 2 n�meros
	public int dividir(int varialvel1, int variavel2) {
		valorResultado = varialvel1 / variavel2;
		return valorResultado;
	}
	
	
	

}
