package arrayList;

public class Aluno {
	//Atributos da classe aluno
	private int matricula;
	private String nome;
	
	//Construtor
	public Aluno(int m, String n){
		matricula = m;
		nome = n;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString(){
		return "Matrícula: " + getMatricula() + "\n" + "Nome: " + getNome();
	}
	
}
