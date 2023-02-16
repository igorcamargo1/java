
//Calculadora aritmética que opera com números inteiros

public class CalculadoraSimples {

	//atributo que guarda o resultado do cálculo no objeto
	private int valorResultado = 0;
	
	//métodos de cálculo
	//somar 2 números
	public int somar(int varialvel1, int variavel2) {
		valorResultado = varialvel1 + variavel2;
		return valorResultado;
	}
	
	//subtrair 2 números
	public int subtrair(int varialvel1, int variavel2) {
		valorResultado = varialvel1 - variavel2;
		return valorResultado;
	}
	
	//multiplicar 2 números
	public int multiplicar(int varialvel1, int variavel2) {
		valorResultado = varialvel1 * variavel2;
		return valorResultado;
	}
	
	
	//dividir 2 números
	public int dividir(int varialvel1, int variavel2) {
		valorResultado = varialvel1 / variavel2;
		return valorResultado;
	}
	
	
	

}
