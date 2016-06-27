package br.com.alura.aplicandoOSetNoModelo;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
	    if (nome == null) {
	        throw new NullPointerException("Nome n�o pode ser nulo");
	    }
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula+ "]"; 
	}
	
	//Para n�s, dois alunos s�o iguais se ambos tiverem o mesmo nome
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
	    return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}	
	// tudo continuar� funcionando se gerarmos o equals e o hashcode pelo comando ctrl+3 + equals
}
