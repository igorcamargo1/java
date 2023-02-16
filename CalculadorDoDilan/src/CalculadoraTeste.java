import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	//objetivo: somar 2 com 5 que deve retornar 7
	public void testeSoma2com5() {
		
		//iniciação de variáveis para o teste
		int variavel1 = 2;
		int variavel2 = 5;
		int resultadoEsperado = 7;
		
		//chamada da função de cálculo
		CalculadoraSimples calc = new CalculadoraSimples();	
		int resultadoReal = calc.somar(variavel1,variavel2);
		
		//avaliar resultado
		assertEquals(resultadoReal,resultadoEsperado);
		}
		
		
		@Test
		//objetivo: somar 8 com 9 que deve retornar 17
		public void testeSoma8com9() {
			
			//iniciação de variáveis para o teste
			int variavel1 = 8;
			int variavel2 = 9;
			int resultadoEsperado = 17;
			
			//chamada da função de cálculo
			CalculadoraSimples calc = new CalculadoraSimples();	
			int resultadoReal = calc.somar(variavel1,variavel2);
			
			//avaliar resultado
			assertEquals(resultadoReal,resultadoEsperado);
		
		
	}
}
