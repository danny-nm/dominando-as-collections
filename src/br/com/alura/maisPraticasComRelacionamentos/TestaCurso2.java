package br.com.alura.maisPraticasComRelacionamentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.listaDeObjetos.Aula;
import br.com.alura.relacionamentoComColecoes.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

		System.out.println(javaColecoes.getAulas());

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		//fizemos esse processo acima, para poder usar o método 
		//sort em uma unmodifiableList
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);

	}

}
