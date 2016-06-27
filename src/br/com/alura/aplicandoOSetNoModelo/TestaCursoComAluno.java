package br.com.alura.aplicandoOSetNoModelo;

import br.com.alura.listaDeObjetos.Aula;
import br.com.alura.relacionamentoComColecoes.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Charles", 123);
		Aluno a2 = new Aluno("David", 456);
		Aluno a3 = new Aluno("Hugo", 789);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		}); //expressão lambda do java 8 :D
		
		
		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		//sobreescrevemos o método equals
		Aluno charles = new Aluno("Charles", 34672);
		System.out.println("E esse Charles, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(charles));
		
		//sobreescrevemos o método hashcode
		System.out.println("O a1 é equals ao Charles?");
		System.out.println(a1.equals(charles));
	}

}
