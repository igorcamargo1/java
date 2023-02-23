import static org.junit.Assert.*;

import org.junit.Test;

public class BoasVindasTeste {

    @Test
   public void testeCriaMesnsagemPadrao() {
	  String mensx;
	  mensx = "Pedro Bo";
	  BoasVindas mensagemUsuario = new BoasVindas(mensx);
	  String mensretorno = mensagemUsuario.completarMenssagem();
	  assertEquals("Ola! Seja bem vindo a sua calculadora pessoal,", mensretorno);     
   }
		   
   @Test
   public void testeExibeMesnsagem() {
	  String mensx;
	  mensx = "Pedro Bo";
	  BoasVindas mensagemUsuario = new  BoasVindas(mensx);
	  String mensRetorno;	
      	  mensRetorno = mensagemUsuario.exibirMenssagem();
      	  assertEquals(mensx, mensRetorno);     
   }


}

