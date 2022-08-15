package arrayObjetos;

public class ListaAlunos {
	private Aluno[] alunos; // array objetos
	private int i = 0; // variável de controle do índice
	
	//método construtor
	public ListaAlunos(int qtde){
		//instanciando o array alunos
		alunos = new Aluno[qtde];
	}
	
	//insere um aluno na lista "alunos"
	public void insereAluno(Aluno a){
		if (i < alunos.length){
		alunos[i] = a;
		i++;
		}else{
			System.out.println("Lista cheia");
		}
	}
	
	public void imprimeLista(){
		for(int i=0; i < alunos.length; i++){
			if(alunos[i] == null){
				System.out.println("Vazio");
			}else{
				System.out.println(alunos[i].toString());
			}

		}
	}
	
	
	
	
	
	
}
