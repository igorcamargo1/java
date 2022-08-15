package arrayObjetos;

public class ListaAlunosTeste {

	public static void main(String[] args) {
		//Criando a lista
		ListaAlunos lista = new ListaAlunos(5);
		//Criando os objetos
		Aluno a1 = new Aluno(1,"Igor");
		Aluno a2 = new Aluno(2,"Paulo");
		Aluno a3 = new Aluno(3,"Pedro");
		//inserindo os alunos na lista
		lista.insereAluno(a1);
		lista.insereAluno(a2);
		lista.insereAluno(a3);
		//imprimindo os elementos da lista
		lista.imprimeLista();

	}

}
