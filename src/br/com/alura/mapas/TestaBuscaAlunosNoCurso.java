package br.com.alura.mapas;

import br.com.alura.aplicandoOSetNoModelo.Aluno;
import br.com.alura.listaDeObjetos.Aula;
import br.com.alura.relacionamentoComColecoes.Curso;

public class TestaBuscaAlunosNoCurso {

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
		
		System.out.println("Quem é o aluno com matrícula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(789);
		System.out.println("Aluno: " + aluno);

	}

}
