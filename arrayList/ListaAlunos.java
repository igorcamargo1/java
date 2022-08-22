package arrayList;

import java.util.ArrayList;

public class ListaAlunos {
	private ArrayList<Aluno> listaAlunos;
	
	public ListaAlunos(){
		listaAlunos = new ArrayList<Aluno>();
	}
	
	//inserindo um aluno na lista
	public void inserirAluno(Aluno a){
		listaAlunos.add(a);
	}
	
	//percorrendo a lista de alunos
	public void imprimirLista(){
		for(Aluno a : listaAlunos){
			System.out.println(a.toString());
		}
	}
}