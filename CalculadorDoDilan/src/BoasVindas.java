public class BoasVindas {

    private String menssagem;

   //Construtor de Objeto na Classe
   public BoasVindas(String mens){
         this.menssagem = mens; 
   }

   // Exibi��o da mensagem
   public String exibirMenssagem(){
         System.out.println(this.menssagem+'!');
         System.out.println("Confira os resultados dos testes no painel da JUNIT!");
         return this.menssagem;
   }   

   // Exibi��o da parte fixa da mensagem
   public String completarMenssagem(){
           String compmens;
           compmens = "Ola! Seja bem vindo a sua calculadora pessoal,";
           System.out.print(compmens);
           return compmens;
   }
   
}

