package br.com.alura.oPoderDosSets;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Aluno 1");
		alunos.add("Aluno 2");
		alunos.add("Aluno 3");
		alunos.add("Aluno 4");
		alunos.add("Aluno 5");
		alunos.add("Aluno 6");

		boolean pauloEstaMatriculado = alunos.contains("Aluno 4");
		alunos.remove("Aluno 5");

		System.out.println(pauloEstaMatriculado);

		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

	}

}
