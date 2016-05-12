package br.com.alura.listaDeObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisando os ArraysLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas); //Sem ordenar
		
		Collections.sort(aulas);
		
		System.out.println(aulas); //Após ordernar por nome das aulas 
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas); //Após ordenar pelo tempo da aula 
		
	}

}
